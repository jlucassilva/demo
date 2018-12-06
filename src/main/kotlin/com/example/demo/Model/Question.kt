package com.example.demo.Model

import javax.persistence.*

@Entity
class Question() {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    var id: Long = 0

    @Column(nullable = false)
    var index: Int = 0

    @Column(nullable = false,unique = true)
    var description: String = ""

    constructor(index: Int, description: String) : this() {
        this.index = index
        this.description = description
    }
}
