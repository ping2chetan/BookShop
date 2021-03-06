package com.sharanamvaishali.dao;

import com.sharanamvaishali.model.PopularSearch;
import java.util.List;

public interface SearchDAO {
    public List searchResults(String searchCriteria);
    public List searchAllResults();
    public List listPopularSearches();
    public void savePopularSearch(PopularSearch popularSeacrh);
    public int getTotalPopularSearches();
    public void deletePopularSearches();
}
