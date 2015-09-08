package com.bitbucket

import com.dropbox.core.DbxAppInfo
import com.dropbox.core.DbxClient
import com.dropbox.core.DbxRequestConfig
import com.dropbox.core.DbxWebAuthNoRedirect
import grails.converters.JSON
import org.springframework.beans.factory.annotation.Autowired

/**
 * Created by thandomafela on 14/07/15.
 */
class HomeController {

    def quoteService
    final String accessToken = 'eawdWHED7z4AAAAAAAALIqVRD9PBAMgFpOObbgo6CUkhIj7POPyNmP2kxvG5eAOo'

    public index() {
//        final String APP_KEY = "uukcshplqa99rwq";
//        final String APP_SECRET = "kwaobqi7wjgtoxf";
//
//        DbxAppInfo appInfo = new DbxAppInfo(APP_KEY, APP_SECRET);
//
//        DbxRequestConfig config = new DbxRequestConfig(
//                "JavaTutorial/1.0", Locale.getDefault().toString());
//        DbxWebAuthNoRedirect webAuth = new DbxWebAuthNoRedirect(config, appInfo);
//
//        String authorizeUrl = webAuth.start();
//
//        response.sendRedirect(authorizeUrl)
    }

    def signin() {


        final String APP_KEY = "uukcshplqa99rwq";
        final String APP_SECRET = "kwaobqi7wjgtoxf";
//
        DbxAppInfo appInfo = new DbxAppInfo(APP_KEY, APP_SECRET);

        DbxRequestConfig config = new DbxRequestConfig(
                "JavaTutorial/1.0", Locale.getDefault().toString());
        DbxWebAuthNoRedirect webAuth = new DbxWebAuthNoRedirect(config, appInfo);

        DbxClient client = new DbxClient(config, accessToken);
        System.out.println("Linked account: " + client.getAccountInfo().displayName);

        render "Hello world >>>"
    }

}
