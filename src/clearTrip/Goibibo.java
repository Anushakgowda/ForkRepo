//package clearTrip;
//
//public class Goibibo {
//
//	public static void main(String[] args) {
//		LocalDate time = LocalDate.now();
//		LocalDate date1 = time.plusDays(30);
//		int departDate = date1.getDayOfMonth();
//		LocalDate date2 = date1.plusDays(50);
//		int returnDate = date2.getDayOfMonth();
//		WebDriver driver = new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
//		driver.get("http://www.goibibo.com");
//		driver.findElement(By.xpath("(//input[contains(@placeholder,'Choose')])[1]")).click();
//		driver.findElement(By.xpath("(//div[text()='"+departDate+"'])[2]")).click();
//		driver.findElement(By.xpath("(//input[contains(@placeholder,'Choose')])[2]")).click();
//		driver.findElement(By.xpath("//span[contains(@class,'DayPicker-NavButton')]")).click();
//		driver.findElement(By.xpath("(//div[text()='"+returnDate+"'])[2]")).click();
//		driver.close();
//	}
//}
