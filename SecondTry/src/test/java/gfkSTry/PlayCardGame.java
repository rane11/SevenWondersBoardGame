package gfkSTry;

import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

import gfkSTry.CardsInHand;




public class PlayCardGame {
	
	CardsInHand cih = new CardsInHand();
	
	
	public void testStringCard() {
		System.out.println("\n");
		cih.compareCardsInHand("WASS", "BSWW");
		System.out.println("\n");
	}
	
	
	
	@Test (priority=1)
	public void TC01_CreateWWSS_withWWSS() {
		List<String> myCards = new ArrayList<String>();
		myCards.add("W");
		myCards.add("W");
		myCards.add("S");
		myCards.add("S");
		cih.buildWithAllOptions(myCards, "WWSS");
	}
	
	@Test(priority=2)
	public void TC02_CreateWWSS_withBWSS() {
		
		List<String> myCards = new ArrayList<String>();
		myCards.add("B");
		myCards.add("W");
		myCards.add("S");
		myCards.add("S");
		cih.buildWithAllOptions(myCards, "WWSS");
		
	}
	
	@Test(priority=3)
	public void TC03_CreateWWSS_withSWSS() {
		
		List<String> myCards = new ArrayList<String>();
		myCards.add("S");
		myCards.add("W");
		myCards.add("S");
		myCards.add("S");
		
		cih.buildWithAllOptions(myCards, "WWSS");
		
	}
	
	@Test(priority=4)
	public void TC04_CreateWWSS_withOWSS() {
		
		List<String> myCards = new ArrayList<String>();
		myCards.add("O");
		myCards.add("W");
		myCards.add("S");
		myCards.add("S");
		
		cih.buildWithAllOptions(myCards, "WWSS");
		
	}
	
	
	@Test(priority=5)
	public void TC05_CreateWWSS_withWWBS() {
		
		List<String> myCards = new ArrayList<String>();
		myCards.add("W");
		myCards.add("W");
		myCards.add("B");
		myCards.add("S");
		
		cih.buildWithAllOptions(myCards, "WWSS");
		
	}
	
	@Test(priority=6)
	public void TC06_CreateWWSS_withBWBS() {
		
		List<String> myCards = new ArrayList<String>();
		myCards.add("B");
		myCards.add("W");
		myCards.add("B");
		myCards.add("S");
		
		cih.buildWithAllOptions(myCards, "WWSS");
		
	}
	
	@Test(priority=7)
	public void TC07_CreateWWSS_withSWBS() {
		
		List<String> myCards = new ArrayList<String>();
		myCards.add("S");
		myCards.add("W");
		myCards.add("B");
		myCards.add("S");
		
		cih.buildWithAllOptions(myCards, "WWSS");
		
	}
	
	@Test(priority=8)
	public void TC08_CreateWWSS_withOWBS() {
		
		List<String> myCards = new ArrayList<String>();
		myCards.add("O");
		myCards.add("W");
		myCards.add("B");
		myCards.add("S");
		
		cih.buildWithAllOptions(myCards, "WWSS");
		
	}
	
	@Test(priority=9)
	public void TC09_CreateWWSS_withOOWS() {
		
		List<String> myCards = new ArrayList<String>();
		myCards.add("O");
		myCards.add("O");
		myCards.add("W");
		myCards.add("S");
		
		cih.buildWithAllOptions(myCards, "WWSS");
		
	}
	
	@Test(priority=10)
	public void TC10_CreateWWSS_withWWWS() {
		
		List<String> myCards = new ArrayList<String>();
		myCards.add("W");
		myCards.add("W");
		myCards.add("W");
		myCards.add("S");
		
		cih.buildWithAllOptions(myCards, "WWSS");
		
	}
	
	@Test(priority=11)
	public void TC11_CreateWWSS_withSWBSS() {
		
		List<String> myCards = new ArrayList<String>();
		myCards.add("W");
		myCards.add("W");
		myCards.add("W");
		myCards.add("S");
		myCards.add("S");
		
		cih.buildWithAllOptions(myCards, "WWSS");
		
	}
	
	@Test(priority=12)
	public void TC12_CreateWWSS_withWWSS() {
		
		List<String> myCards = new ArrayList<String>();
		myCards.add("W");
		myCards.add("W");
		myCards.add("S");
		myCards.add("S");
		
		cih.buildWithAllOptions(myCards, "WWSSS");
		
	}
	
	
	//Testing second set of cards
	
	
	
	@Test(priority=100)
	public void TC50_CreateBSWW_withSWWS() {
		System.out.println();
		List<String> myCards = new ArrayList<String>();
		myCards.add("S");
		myCards.add("W");
		myCards.add("W");
		myCards.add("S");
		
		cih.buildWithAllOptions(myCards, "BSWW");
		
	}
	
	@Test(priority=101)
	public void TC51_CreateBSWW_withSBWS() {
		
		List<String> myCards = new ArrayList<String>();
		myCards.add("S");
		myCards.add("B");
		myCards.add("W");
		myCards.add("S");
		
		cih.buildWithAllOptions(myCards, "BSWW");
		
	}
	
	@Test(priority=102)
	public void TC52_CreateBSWW_withSSWS() {
		
		List<String> myCards = new ArrayList<String>();
		myCards.add("S");
		myCards.add("S");
		myCards.add("W");
		myCards.add("S");
		
		cih.buildWithAllOptions(myCards, "BSWW");
		
	}
	
	@Test(priority=103)
	public void TC53_CreateBSWW_withSOWS() {
		
		List<String> myCards = new ArrayList<String>();
		myCards.add("S");
		myCards.add("O");
		myCards.add("W");
		myCards.add("S");
		
		cih.buildWithAllOptions(myCards, "BSWW");
		
	}
	
	@Test(priority=104)
	public void TC54_CreateBSWW_withSWWB() {
		
		List<String> myCards = new ArrayList<String>();
		myCards.add("S");
		myCards.add("W");
		myCards.add("W");
		myCards.add("B");
		
		cih.buildWithAllOptions(myCards, "BSWW");
		
	}
	
	@Test(priority=105)
	public void TC55_CreateBSWW_withSBWB() {
		
		List<String> myCards = new ArrayList<String>();
		myCards.add("S");
		myCards.add("B");
		myCards.add("W");
		myCards.add("B");
		
		cih.buildWithAllOptions(myCards, "BSWW");
		
	}
	
	@Test(priority=106)
	public void TC56_CreateBSWW_withSSWB() {
		
		List<String> myCards = new ArrayList<String>();
		myCards.add("S");
		myCards.add("S");
		myCards.add("W");
		myCards.add("B");
		
		cih.buildWithAllOptions(myCards, "BSWW");
		
	}
	
	@Test(priority=107)
	public void TC57_CreateBSWW_withSOWB() {
		
		List<String> myCards = new ArrayList<String>();
		myCards.add("S");
		myCards.add("O");
		myCards.add("W");
		myCards.add("B");
		
		cih.buildWithAllOptions(myCards, "BSWW");
		
	}
	
	@Test(priority=108)
	public void TC58_CreateBSWW_withWWSS() {
		
		List<String> myCards = new ArrayList<String>();
		myCards.add("W");
		myCards.add("W");
		myCards.add("S");
		myCards.add("S");
		
		cih.buildWithAllOptions(myCards, "BSWW");
		
	}
	
	@Test(priority=109)
	public void TC59_CreateBSWW_withWWSS() {
		
		List<String> myCards = new ArrayList<String>();
		myCards.add("B");
		myCards.add("S");
		myCards.add("W");
		
		
		cih.buildWithAllOptions(myCards, "BSWW");
		
	}
	
	@Test(priority=110)
	public void TC60_CreateBSWW_withWWSSB() {
		
		List<String> myCards = new ArrayList<String>();
		myCards.add("W");
		myCards.add("W");
		myCards.add("S");
		myCards.add("S");
		myCards.add("B");
		
		cih.buildWithAllOptions(myCards, "BSWW");
		
	}
	
	@Test(priority=111)
	public void TC61_CreateBSWW_withSWWS() {
		
		List<String> myCards = new ArrayList<String>();
		myCards.add("S");
		myCards.add("W");
		myCards.add("W");
		myCards.add("S");
		
		
		cih.buildWithAllOptions(myCards, "BSWWB");
		
	}
	
	//Testing Third set of cards
	
	@Test(priority=200)
	public void TC100_CreateSO_withBSW() {
		System.out.println();
		List<String> myCards = new ArrayList<String>();
		myCards.add("B");
		myCards.add("S");
		myCards.add("W");
		
		
		cih.buildWithAllOptions(myCards, "OS");
		
	}
	
	@Test(priority=200)
	public void TC101_CreateSO_withBSB() {
		
		List<String> myCards = new ArrayList<String>();
		myCards.add("B");
		myCards.add("S");
		myCards.add("B");
		
		
		cih.buildWithAllOptions(myCards, "OS");
		
	}
	
	@Test(priority=200)
	public void TC102_CreateSO_withBSO() {
		
		List<String> myCards = new ArrayList<String>();
		myCards.add("B");
		myCards.add("S");
		myCards.add("O");
		
		
		cih.buildWithAllOptions(myCards, "OS");
		
	}
	
	@Test(priority=200)
	public void TC103_CreateSO_withBBW() {
		
		List<String> myCards = new ArrayList<String>();
		myCards.add("B");
		myCards.add("B");
		myCards.add("W");
		
		
		cih.buildWithAllOptions(myCards, "OS");
		
	}
	
	@Test(priority=200)
	public void TC104_CreateSO_withBSBW() {
		
		List<String> myCards = new ArrayList<String>();
		myCards.add("B");
		myCards.add("S");
		myCards.add("B");
		myCards.add("W");
		
		
		cih.buildWithAllOptions(myCards, "OS");
		
	}
	
	@Test(priority=200)
	public void TC105_CreateSO_withBSO() {
		
		List<String> myCards = new ArrayList<String>();
		myCards.add("B");
		myCards.add("S");
		myCards.add("O");
		
		
		cih.buildWithAllOptions(myCards, "OSB");
		
	}
	
	//Testing fourth set of cards.
	
	@Test(priority=300)
	public void TC200_CreateNONE_withWW() {
		System.out.println();
		List<String> myCards = new ArrayList<String>();
		myCards.add("W");
		myCards.add("W");
		
		
		cih.buildWithAllOptions(myCards, "WWW");
		
	}
	
	@Test(priority=300)
	public void TC201_CreateNONE_withWB() {
		
		List<String> myCards = new ArrayList<String>();
		myCards.add("W");
		myCards.add("B");
		
		
		cih.buildWithAllOptions(myCards, "WWW");
		
	}
	
	@Test(priority=300)
	public void TC202_CreateNONE_withWS() {
		
		List<String> myCards = new ArrayList<String>();
		myCards.add("W");
		myCards.add("S");
		
		
		cih.buildWithAllOptions(myCards, "WWW");
		
	}
	
	@Test(priority=300)
	public void TC203_CreateNONE_withWS() {
		
		List<String> myCards = new ArrayList<String>();
		myCards.add("W");
		myCards.add("S");
		
		
		cih.buildWithAllOptions(myCards, "WWW");
		
	}
	
	@Test(priority=300)
	public void TC204_CreateNONE_withWO() {
		
		List<String> myCards = new ArrayList<String>();
		myCards.add("W");
		myCards.add("O");
		
		
		cih.buildWithAllOptions(myCards, "WWW");
		
	}
	
	@Test(priority=300)
	public void TC205_CreateNONE_withBB() {
		
		List<String> myCards = new ArrayList<String>();
		myCards.add("B");
		myCards.add("B");
		
		
		cih.buildWithAllOptions(myCards, "WWW");
		
	}
	
	@Test(priority=300)
	public void TC206_CreateNONE_withSS() {
		
		List<String> myCards = new ArrayList<String>();
		myCards.add("S");
		myCards.add("S");
		
		
		cih.buildWithAllOptions(myCards, "WWW");
		
	}
	
	@Test(priority=300)
	public void TC207_CreateNONE_withOO() {
		
		List<String> myCards = new ArrayList<String>();
		myCards.add("O");
		myCards.add("O");
		
		
		cih.buildWithAllOptions(myCards, "WWW");
		
	}
	
	@Test(priority=300)
	public void TC208_CreateNONE_withBS() {
		
		List<String> myCards = new ArrayList<String>();
		myCards.add("B");
		myCards.add("S");
		
		
		cih.buildWithAllOptions(myCards, "WWW");
		
	}
	
	//Testing fourth set of cards.
	
	@Test(priority=400)
	public void TC300_CreateNONE_withWSWWWW() {
		System.out.println();
		List<String> myCards = new ArrayList<String>();
		myCards.add("W");
		myCards.add("S");
		myCards.add("W");
		myCards.add("W");
		myCards.add("W");
		myCards.add("W");
		
		
		cih.buildWithAllOptions(myCards, "WWBSSOO");
		
	}
	
	@Test(priority=400)
	public void TC301_CreateNONE_withBSWWWW() {
		
		List<String> myCards = new ArrayList<String>();
		myCards.add("B");
		myCards.add("S");
		myCards.add("W");
		myCards.add("W");
		myCards.add("W");
		myCards.add("W");
		
		
		cih.buildWithAllOptions(myCards, "WWBSSOO");
		
	}
	
	@Test(priority=400)
	public void TC302_CreateNONE_withSSWWWW() {
		
		List<String> myCards = new ArrayList<String>();
		myCards.add("S");
		myCards.add("S");
		myCards.add("W");
		myCards.add("W");
		myCards.add("W");
		myCards.add("W");
		
		
		cih.buildWithAllOptions(myCards, "WWBSSOO");
		
	}
	
	@Test(priority=400)
	public void TC303_CreateNONE_withOSWWWW() {
		
		List<String> myCards = new ArrayList<String>();
		myCards.add("O");
		myCards.add("S");
		myCards.add("W");
		myCards.add("W");
		myCards.add("W");
		myCards.add("W");
		
		
		cih.buildWithAllOptions(myCards, "WWBSSOO");
		
	}
	
	@Test(priority=400)
	public void TC304_CreateNONE_withBOWWWW() {
		
		List<String> myCards = new ArrayList<String>();
		myCards.add("B");
		myCards.add("O");
		myCards.add("W");
		myCards.add("W");
		myCards.add("W");
		myCards.add("W");
		
		
		cih.buildWithAllOptions(myCards, "WWBSSOO");
		
	}
	
	@AfterSuite
	public void endTest() {
		System.out.println();
		System.out.println("---End of Test---");
		System.out.println();
	}
}
