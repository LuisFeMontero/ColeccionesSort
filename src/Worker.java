public class Worker implements Comparable <Worker>{

    private String name;

    private Integer hoursWorked;

    public Worker(String name, Integer hoursWorked) {
        this.name = name;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public int compareTo(Worker otherWorker) {
        //Forma 1:
        //if (this.hoursWorked > otherWorker.hoursWorked){
         //   return 1;
        //}
        //if (this.hoursWorked < otherWorker.hoursWorked){
          //  return -1;
        //}
        //return 0;

        //Forma 2 - con Integers (del que menos trabaja al que más)
        //return this.hoursWorked - otherWorker.hoursWorked;

        //Forma 3 - CompareTo del atributo interno
        //return this.hoursWorked.compareTo(otherWorker.hoursWorked);
        return otherWorker.name.compareTo(this.name);
    }
}
