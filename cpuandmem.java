import java.lang.management.ManagementFactory;
static int KB = 1000
static int MB = 1000*KB
static int GB = 1000*MB
static int KiB = 1024
static int MiB = 1024*KiB
static int GiB = 1024*MiB
class Cpuandmem
{
    public static void main(String args[])
	{
        System.out.println("Number of processors available to the Java virtual machine: ");
        System.out.println(Runtime.getRuntime().availableProcessors()+"\n");
        System.out.println("Total amount of memory currently available: ");
        System.out.println((Runtime.getRuntime().totalMemory())/GB+" GB or "(Runtime.getRuntime().totalMemory())/GiB+" GiB");
	}
}