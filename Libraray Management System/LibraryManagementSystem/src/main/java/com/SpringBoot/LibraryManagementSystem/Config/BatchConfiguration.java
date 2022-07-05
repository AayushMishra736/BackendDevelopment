package com.SpringBoot.LibraryManagementSystem.Config;

import org.springframework.batch.core.Job;import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.ItemWriter;
import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.batch.item.file.LineMapper;
import org.springframework.batch.item.file.mapping.BeanWrapperFieldSetMapper;
import org.springframework.batch.item.file.mapping.DefaultLineMapper;
import org.springframework.batch.item.file.transform.DelimitedLineTokenizer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.Resource;

import com.SpringBoot.LibraryManagementSystem.Entity.Book;



public class BatchConfiguration {


@Bean
public Job job(JobBuilderFactory jobBuilderFactory,StepBuilderFactory stepBuilderFactory,
	ItemReader<Book> itemReader,ItemProcessor<Book, Book> itemProcessor,ItemWriter<Book> itemWriter) {	
	Step step = stepBuilderFactory.get("ETL-file-load").<Book ,Book>chunk(200).reader(itemReader).processor(itemProcessor).writer(itemWriter).build();			
	return jobBuilderFactory.get("ETL-Load").incrementer(new RunIdIncrementer()).start(step).build();
}


@Bean
public FlatFileItemReader<Book> fileItemReader(@Value("${input}") Resource resource){
	
	FlatFileItemReader<Book> flatFileItemReader = new FlatFileItemReader<>();
	flatFileItemReader.setResource(resource);
	flatFileItemReader.setName("CSV-Reader");
	flatFileItemReader.setLinesToSkip(1);
	flatFileItemReader.setLineMapper(lineMapper());
	return flatFileItemReader;
}

@Bean
public LineMapper<Book> lineMapper(){
	
	DefaultLineMapper<Book> defaultLineMapper = new DefaultLineMapper<>();
	DelimitedLineTokenizer lineTokenizer = new DelimitedLineTokenizer();
	
	lineTokenizer.setDelimiter(",");
	lineTokenizer.setStrict(false);
	lineTokenizer.setNames(new String[] {"book_id","book_author","book_name","book_price","book_publication","created_on","modified_on","no_of_copies","modified_by"});
	
	BeanWrapperFieldSetMapper<Book> fieldSetMapper = new BeanWrapperFieldSetMapper<>();
	fieldSetMapper.setTargetType(Book.class);
	
	defaultLineMapper.setLineTokenizer(lineTokenizer);
	defaultLineMapper.setFieldSetMapper(fieldSetMapper);
	
	return defaultLineMapper;
	
}

	
}
