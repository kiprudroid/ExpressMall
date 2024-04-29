package com.shadrackkipruto.expressmall.model

class User {
    var name:String = ""
    var email:String = ""
    var password:String = ""


    constructor(name: String, email: String, password: String) {
        this.name = name
        this.email = email
        this.password = password
    }

    constructor()
}