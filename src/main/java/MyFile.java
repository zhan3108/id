import java.io.FileNotFoundException;
import java.util.*;

public class MyFile implements Comparable {
    String name;
    boolean exist;
    public MyFile(String name){
        this.name = name;
        this.exist = true;
    }
    public void changeExistence()
    {
        if (exist) exist = false;
        else this.exist = true;
    }
    public  boolean  ifExist() throws FileNotFoundException {
       if (exist)
       return true;
       else throw new FileNotFoundException("File " + name + " doesnt exist");
    }

    public static void main(String[] args) {
        MyFile file= new MyFile("file1");
        file.changeExistence();
        try {
            file.ifExist();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
        Set<MyFile> myFileSet= new HashSet<>();
        myFileSet.add(new MyFile("file2"));
        myFileSet.add(new MyFile("file3"));
        myFileSet.add(new MyFile("file3"));
        myFileSet.add(new MyFile("file4"));

        for(MyFile fff: myFileSet)
            System.out.println(fff.name);
            System.out.println();


        List<MyFile> newList = new ArrayList<>(myFileSet);
        Collections.sort(newList);

        for(MyFile fff: newList)
            System.out.println(fff.name);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyFile myFile = (MyFile) o;
        return
                Objects.equals(name, myFile.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public int compareTo(Object o) {
        MyFile ff=(MyFile)o;
        return this.name.compareTo(ff.name);
    }
}
