package com.nf.campuswall.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PaginationUtils<T> {
    //    当前页
    private int pageNo = 1;
    //    数据总数
    private int total = 0;
    //    每页数量
    private int pageSize = 2;
    //    总页数
    private int pages = 0;
    //    开始页后几位
    private int homePageCount = 3;
    private int lastPageCount = 3;
    private int currentLeftCount = 2;
    private int currentRightCount = 2;
    private String delimiter = "...";
    private List<T> list;

    public PaginationUtils() {
        this(1, 0, 2, 3, 3, 2, 2, "...", null);
    }

    public PaginationUtils(int pageNo, int total, int pageSize, List<T> list) {
        this(pageNo, total, pageSize, 3, 3, 2, 2, "...", list);
    }
    public PaginationUtils(int total, int pageSize) {
        this(1, total, pageSize, 3, 3, 2, 2, "...",null);
    }

    private PaginationUtils(int pageNo, int total, int pageSize, int homePageCount, int lastPageCount, int currentLeftCount, int currentRightCount, String delimiter, List<T> list) {
        this.pageNo = pageNo;
        this.total = total;
        this.pageSize = pageSize;
        this.homePageCount = homePageCount;
        this.lastPageCount = lastPageCount;
        this.currentLeftCount = currentLeftCount;
        this.currentRightCount = currentRightCount;
        this.delimiter = delimiter;
        this.list = list;
        this.pages = (int) Math.ceil(1.0 * this.total / this.pageSize);
    }

    public List<Integer> generateNums() {
        return Stream.of(IntStream.range(1, 1 + homePageCount + 1),
                IntStream.range(pageNo - currentLeftCount, pageNo + currentRightCount + 1),
                IntStream.range(pages - lastPageCount, pages + 1))
                .flatMapToInt(x -> x)
                .filter(x -> x >= 1 & x <= pages)
                .distinct()
                .sorted()
                .boxed()
                .collect(Collectors.toList());
    }

    public List<String> getNumsText() {
        List<String> result = new ArrayList<>();
        List<Integer> nums = generateNums();
        for(int i=0;i<nums.size();i++){
            int currentNum = nums.get(i);
            result.add(currentNum + "");
            if((i+1) <nums.size()){
                if(nums.get(i + 1)- currentNum>1){
                    result.add(delimiter);
                }
            }
        }
        return result;
    }

    public int getFristPage() {
        return 1;
    }

    public int getLastPage() {
        return pages;
    }

    public int getPrev() {
        return Math.max(this.pageNo - 1, 1);
    }

    public int getNext() {
        return Math.min(this.pageNo + 1, this.pages);
    }

    public int getPageNo() {
        return pageNo;
    }

    public void setPageNo(int pageNo) {
        this.pageNo = pageNo;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public int getHomePageCount() {
        return homePageCount;
    }

    public void setHomePageCount(int homePageCount) {
        this.homePageCount = homePageCount;
    }

    public int getLastPageCount() {
        return lastPageCount;
    }

    public void setLastPageCount(int lastPageCount) {
        this.lastPageCount = lastPageCount;
    }

    public int getCurrentLeftCount() {
        return currentLeftCount;
    }

    public void setCurrentLeftCount(int currentLeftCount) {
        this.currentLeftCount = currentLeftCount;
    }

    public int getCurrentRightCount() {
        return currentRightCount;
    }

    public void setCurrentRightCount(int currentRightCount) {
        this.currentRightCount = currentRightCount;
    }

    public String getDelimiter() {
        return delimiter;
    }

    public void setDelimiter(String delimiter) {
        this.delimiter = delimiter;
    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }
}
