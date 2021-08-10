import java.lang.management.ManagementFactory;

class Cpuandmem
{
    //MemoryMXBean memoryMXBean = ManagementFactory.getMemoryMXBean();
    //ThreadMXBean threadMXBean = ManagementFactory.getThreadMXBean();
	
    public static void main(String args[])
	{
        System.out.println(Runtime.getRuntime().availableProcessors());
		Cpuandmem cpuandmem = new Cpuandmem();
		cpuandmem.cpu();
        cpuandmem.memory();
	}
    
    public void memory()
	{
		/*System.out.println(String.format("Initial memory: %.2f GB", 
          (double)memoryMXBean.getHeapMemoryUsage().getInit() /1073741824));
        System.out.println(String.format("Used heap memory: %.2f GB", 
          (double)memoryMXBean.getHeapMemoryUsage().getUsed() /1073741824));
        System.out.println(String.format("Max heap memory: %.2f GB", 
          (double)memoryMXBean.getHeapMemoryUsage().getMax() /1073741824));
        System.out.println(String.format("Committed memory: %.2f GB", 
          (double)memoryMXBean.getHeapMemoryUsage().getCommitted() /1073741824));*/
	}
    
    public void cpu()
	{
		//threadMXBean.getThreadCount();
	}
}