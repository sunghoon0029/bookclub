//package com.bit.bookclub.modules.csv;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import org.springframework.batch.item.ItemWriter;
//import org.springframework.context.annotation.Configuration;
//
//import lombok.RequiredArgsConstructor;
//
//@RequiredArgsConstructor
//@Configuration
//public class LibraryCsvWriter implements ItemWriter<TempLibraryDto> {
//
//    private final TempLibraryJpaRepository tempLibraryJpaRepository;
//
//    @Override
//    public void write(List<? extends TempLibraryDto> list) throws Exception {
//        List<TempLibrary> tempLibraryList = new ArrayList<>();
//
//        list.forEach(getTempLibrary -> {
//            TempLibrary tempLibrary = new TempLibrary();
//            tempLibrary.setLibraryNm(getTempLibrary.getLibraryNm());
//            tempLibrary.setBigLocal(getTempLibrary.getBigLocal());
//            tempLibrary.setSmallLocal(getTempLibrary.getSmallLocal());
//            tempLibrary.setLibraryType(getTempLibrary.getLibraryType());
//
//            tempLibraryList.add(tempLibrary);
//        });
//
//        tempLibraryJpaRepository.saveAll(tempLibraryList);
//    }
//
//}
