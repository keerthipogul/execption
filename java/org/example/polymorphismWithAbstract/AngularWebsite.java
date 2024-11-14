package org.example.polymorphismWithAbstract;

public abstract class AngularWebsite implements Website {


    @Override
    public String header() {
        return "header";
    }

    @Override
    public String footer() {
        return "footer";
    }
    @Override
    public String body(){
        return "default body";

    }
    //public abstract String body();

    public String page(){
        header();
        footer();
        body();
        return this.getClass().getName();


        //public String page(){
        // StringBuilder builder = new StringBuilder;
        //        footer();
        //        body();
        //        return this.getClass().getName();
    }

}
