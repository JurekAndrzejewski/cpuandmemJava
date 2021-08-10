import java.lang.management.ManagementFactory;

class Cpuandmem
{
    //MemoryMXBean memoryMXBean = ManagementFactory.getMemoryMXBean();
    //ThreadMXBean threadMXBean = ManagementFactory.getThreadMXBean();
	
    public static void main(String args[])
	{
        System.out.println(Runtime.getRuntime().availableProcessors());
        System.out.println(Runtime.getRuntime().totalMemory());
	}
}