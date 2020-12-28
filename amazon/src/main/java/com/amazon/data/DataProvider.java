package com.amazon.data;


public class DataProvider {

    @org.testng.annotations.DataProvider(name = "searchData")
    public Object[] getSearchData(){
        return new Object[]{"Paulo Coelho", "MacBook Pro"};
    }

    @org.testng.annotations.DataProvider(name = "signInCredentials")
    public Object[] getSignInCredentials() {
        return new Object[][]{{"hisname@gmail.com", "password1"}, {"yourname@yahoo.com", "password2"}};
    }

}
