package com.company.ds;

/**
 * Created by dangineering on 7/10/16.
 */
public class Extending<LRU> {

    interface booz{
        void callback();
    }

    interface baz {
        void wtf();
    }

    interface foo extends booz, baz{
        @Override
        void wtf();

        @Override
        void callback();
    }
}
