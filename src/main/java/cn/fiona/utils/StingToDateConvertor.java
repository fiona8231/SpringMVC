package cn.fiona.utils;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

//turn Sting to Date type

public class StingToDateConvertor implements Converter<String, Date> {


    @Override

    public Date convert(String s) {

        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        try {
            return df.parse(s);
        } catch (ParseException e) {
           throw new RuntimeException("出错");
        }


    }
}
