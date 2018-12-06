package csv

import com.example.demo.Model.Question
import java.nio.file.Files
import java.nio.file.Paths
import java.util.stream.Collectors


object Leitor {


    fun ler() {
        val home = "C:\\Users\\TEMP.7SETLABS.007\\Downloads\\header.txt"
        val path = Paths.get(home).toAbsolutePath()

        val lines = Files.lines(path)
        val data: String = lines.collect(Collectors.joining())

        var questoes: MutableList<Question> = ArrayList()
        data.split(",").toList().forEach { questoes.add(Question(questoes.size, it)) }
        lines.close()

    }
}