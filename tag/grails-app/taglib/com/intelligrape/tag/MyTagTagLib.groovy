package com.intelligrape.tag

class MyTagTagLib {

    static namespace = "my"

    def input = {
        out << "<input type='text' name='name'>"

        println'--------------'+createLink(action:'list',controller:'user',id:5)
    }


    def name = {attrs ->
        String myName = attrs['name']
        String myCompany = attrs['company']

        out << " ${myCompany} : ${myName} "
    }

    def link = {attrs ->

        out << " Hel"
    }

    def myImage = {attrs ->
        String imageName = attrs['name']
        out << "<img src='${resource(dir:'images',file:imageName)}'/> "
    }

}
