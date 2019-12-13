package org.genco.testclient.fluent.pages.sidenav;

public class SideNav {

    private SideNavActController act;
    private SideNavVerifyController verify;

    public SideNavActController act(){
        return act;
    }

    public SideNavVerifyController verify(){
        return verify;
    }

    private SideNav(){
        // hide it
    }

    private SideNav(SideNavActController act, SideNavVerifyController verify){
        this.act = act;
        this.verify = verify;
    }

    public static SideNav getSideNav(){
        return new SideNav(new SideNavActController(),
                new SideNavVerifyController());
    }
}
