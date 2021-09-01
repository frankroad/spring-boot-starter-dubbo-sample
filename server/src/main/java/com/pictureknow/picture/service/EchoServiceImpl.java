package com.pictureknow.picture.service;


import com.pictureknow.picture.api.EchoService;
import org.springframework.stereotype.Service;

/**
 * @author yank
 * 2018/1/19
 */
@Service
public class EchoServiceImpl implements EchoService {

    @Override
    public String echo(String str) {
        return str;
    }
}
