import java.lang.management.ManagementFactory;

class Cpuandmem
{
    public static void main(String args[]) {
        final int KB = 1000;
        final int MB = 1000*KB;
        final int GB = 1000*MB;
        final int KiB = 1024;
        final int MiB = 1024*KiB;
        final int GiB = 1024*MiB;
        System.out.println("Number of processors available to the Java virtual machine: ");
        System.out.println(Runtime.getRuntime().availableProcessors()+"\n");
        System.out.println("Total amount of memory currently available: ");
        System.out.println(((Runtime.getRuntime().totalMemory())/GB)+" GB or " + ((Runtime.getRuntime().totalMemory())/GiB)+" GiB");
	}
}