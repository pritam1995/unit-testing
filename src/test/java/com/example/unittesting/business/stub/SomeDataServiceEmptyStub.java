package com.example.unittesting.business.stub;

import com.example.unittesting.data.SomeDataService;

public class SomeDataServiceEmptyStub implements SomeDataService {
    @Override
    public int[] retrieveAllData() {
        return new int[] { };
    }
}
