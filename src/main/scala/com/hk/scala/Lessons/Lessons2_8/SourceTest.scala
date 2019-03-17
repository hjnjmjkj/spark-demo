package com.hk.scala.Lessons.Lessons2_8
import scala.io.Source
import java.io.File

object SourceTest {
  def main(args: Array[String]): Unit = {
    val source = Source.fromFile("D:\\BigData\\lessions\\2_8.txt","UTF-8")
    val lines = source.getLines().toArray;
    for (line<- lines){
      println(line)
    }
    source.close()
    val dirList=getSubdirIterator(new File("D:\\Program Files"));
    for (dir <- dirList){
      println(dir.toString)
    }
  }
  def getSubdirIterator(dir:File):Iterable[File] = {
    val childDirs = dir.listFiles.filter(_.isDirectory);
    childDirs.toIterable ++ childDirs.toIterator.flatMap(getSubdirIterator(_))
  }
}
