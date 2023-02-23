package com.cloudmotiv;

import android.app.Application;
import android.content.Context;

import com.secneo.sdk.Helper;

public class MApplication extends Application{
        public DemoApplication demoApplication;
        @Override
        protected void attachBaseContext(Context paramContext) {
            super.attachBaseContext(paramContext);
            Helper.install(MApplication.this);
            if (demoApplication == null) {
                demoApplication = new DemoApplication();
                demoApplication.setContext(MApplication.this);
            }
        }
        @Override
        public void onCreate() {
            super.onCreate();
            demoApplication.onCreate();
        }
}
