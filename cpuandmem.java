import java.lang.management.ManagementFactory;

class Cpuandmem
{
    public static void main(String args[]) {
        final long KB = 1000;
        final long MB = 1000*KB;
        final long GB = 1000*MB;
        final long KiB = 1024;
        final long MiB = 1024*KiB;
        final long GiB = 1024*MiB;
        final long memInBytes = Runtime.getRuntime().totalMemory();
        final float memInGB = (float)memInBytes/GB;
        final float memInGiB = (float)memInBytes/GiB;
        System.out.println("Number of processors available to the Java: ");
        System.out.println(Runtime.getRuntime().availableProcessors()+"\n");
        System.out.println("Total amount of memory currently available: ");
        System.out.println(memInGB + " GB");
        System.out.println(memInGiB + " GiB");
	}
}