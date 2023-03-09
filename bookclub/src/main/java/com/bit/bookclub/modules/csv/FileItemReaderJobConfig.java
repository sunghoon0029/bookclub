//package com.bit.bookclub.modules.csv;
//
//import org.springframework.batch.core.Job;
//import org.springframework.batch.core.Step;
//import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
//import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import lombok.RequiredArgsConstructor;
//import lombok.extern.slf4j.Slf4j;
//
//@Slf4j
//@Configuration
//@RequiredArgsConstructor
//public class FileItemReaderJobConfig {
//    private final JobBuilderFactory jobBuilderFactory;
//    private final StepBuilderFactory stepBuilderFactory;
//    private final TempLibraryJpaRepository tempLibraryJpaRepository;
//    private final LibraryCsvReader libraryCsvReader;
//    private final LibraryCsvProcessor libraryCsvProcessor;
//    private final LibraryCsvWriter libraryCsvWriter;
//
//    private static final int chunkSize = 100;
//
//    @Bean
//    public Job csvFileItemReaderJob() {
//        return jobBuilderFactory.get("csvFileItemReaderJob")
//                .start(csvFileItemReaderStep())
//                .build();
//    }
//
//    @Bean
//    public Step csvFileItemReaderStep() {
//        return stepBuilderFactory.get("csvFileItemReaderStep")
//                .<TempLibraryDto, TempLibraryDto>chunk(chunkSize)
//                .reader(libraryCsvReader.csvFileItemReader())
//                .processor(libraryCsvProcessor)
//                .writer(libraryCsvWriter)
//                .build();
//    }
//}
