package org.kramerlab.tofuml.api.impl.mediation;

import static org.junit.Assert.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.net.URI;
import java.util.Set;

import org.junit.Test;
import org.kramerlab.seitan.api.impl.Permission;
import org.kramerlab.seitan.api.impl.exceptions.SEITANException;
import org.kramerlab.seitan.api.impl.objects.ReviewableSEITANObject;
import org.kramerlab.seitan.api.impl.objects.SEITANObject;
import org.kramerlab.tofuml.api.impl.logic.objects.Dataset;

public class DatasetInterfaceTest {

	@Test
	void constructorTest() {
		URI validURI = URI.create("testUri");
		try {
			DatasetInterface aI = new DatasetInterface("validUserName",  validURI);
			assertNotNull("Constructor failed.", aI);
		} catch (SEITANException e) {
			assertTrue("Got SEITANException.", false);
		} 
	}

	@Test 
	void getDatasetWithInvalidURITest() {
		URI validURI = URI.create("testUri");
		DatasetInterface dI = null;
		try {
			dI = new DatasetInterface("validUserName",  validURI);
			
		} catch (SEITANException e) {
			assertTrue("Got SEITANEXception.", false);
		}
		assertNotNull("Constructor failed.", dI);
		URI invalidURI = URI.create("notExistingAlgorithmLocation");
		Dataset testDataset = dI.getDataset(invalidURI);
		assertNull(testDataset);
	}
	
	@Test 
	void addAndgetDatasetTest() throws FileNotFoundException, SEITANException {
		URI validURI = URI.create("testUri");
		DatasetInterface dI = null;
		try {
			dI = new DatasetInterface("validUserName",  validURI);
			
		} catch (SEITANException e) {
			assertTrue("Got SEITANEXception.", false);
		}
		assertNotNull("Constructor failed.", dI);
		validURI = URI.create("testDatasetURI");
		TestDataset testDataset = new TestDataset(validURI, Permission.READ);
		InputStream in = new FileInputStream("Location of testDataset");
		dI.addDataset(in, "testDataSet", "totally interesting data!");
		Dataset testDataset1 = dI.getDataset(validURI);
		assertNotNull(testDataset);
		assertEquals(testDataset, (TestDataset)testDataset1);
		assertEquals("testDataSet", testDataset1.getName());
		//assertEquals("totally interesting data!",  testDataset1.getDescription());
	}

	@Test 
	void addAndgetDatasetsTest() throws FileNotFoundException, SEITANException {
		URI validURI = URI.create("testUri");
		DatasetInterface dI = null;
		try {
			dI = new DatasetInterface("validUserName",  validURI);
			
		} catch (SEITANException e) {
			assertTrue("Got SEITANEXception.", false);
		}
		assertNotNull("Constructor failed.", dI);
		validURI = URI.create("testDatasetURI");
		TestDataset testDataset = new TestDataset(validURI, Permission.READ);
		InputStream in = new FileInputStream("Location of testDataset");
		dI.addDataset(in, "testDataSet", "totally interesting data!");
		Set<Dataset> set = dI.getDatasets(); 
		assertNotNull(set);
		assertEquals(1, set.size());
		assertTrue(set.contains(testDataset));
	}
	
	@Test 
	void updateDatasetTest() throws FileNotFoundException, SEITANException {
		URI validURI = URI.create("testUri");
		DatasetInterface dI = null;
		try {
			dI = new DatasetInterface("validUserName",  validURI);
			
		} catch (SEITANException e) {
			assertTrue("Got SEITANEXception.", false);
		}
		assertNotNull("Constructor failed.", dI);
		validURI = URI.create("testDatasetURI");
		TestDataset testDataset = new TestDataset(validURI, Permission.READ);
		InputStream in = new FileInputStream("Location of testDataset");
		dI.addDataset(in, "testDataSet", "totally interesting data!");
		Dataset testDataset1 = dI.getDataset(validURI);
		assertNotNull(testDataset);
		assertEquals(testDataset, (TestDataset)testDataset1);
		assertEquals("testDataSet", testDataset1.getName());
		//assertEquals("totally interesting data!",  testDataset1.getDescription());
		dI.updateDataset(validURI, "newName", "newDesc");
		testDataset1 = dI.getDataset(validURI);
		assertNotNull(testDataset);
		assertEquals(testDataset, (TestDataset)testDataset1);
		assertEquals("newName", testDataset1.getName());
		//assertEquals("newDesc",  testDataset1.getDescription());
	}
	
	@Test 
	void deleteDatasetTest() throws FileNotFoundException, SEITANException {
		URI validURI = URI.create("testUri");
		DatasetInterface dI = null;
		try {
			dI = new DatasetInterface("validUserName",  validURI);
			
		} catch (SEITANException e) {
			assertTrue("Got SEITANEXception.", false);
		}
		assertNotNull("Constructor failed.", dI);
		validURI = URI.create("testDataset0URI");
		TestDataset testDataset0 = new TestDataset(validURI, Permission.READ);
		validURI = URI.create("testDataset1URI");
		TestDataset testDataset1 = new TestDataset(validURI, Permission.READ);
		InputStream in0 = new FileInputStream("Location of testDataset0");
		InputStream in1 = new FileInputStream("Location of testDataset1");
		dI.addDataset(in0, "testDataSet0", "totally interesting data!");
		dI.addDataset(in1, "testDataSet1", "almost interesting data!");
		Set<Dataset> set = dI.getDatasets();
		assertEquals(2, set.size());
		dI.deleteDataset(validURI);
		set = dI.getDatasets();
		assertEquals(1, set.size());
		assertTrue(set.contains(testDataset0));
		assertFalse(set.contains(testDataset1));
	}

	@Test 
	void deleteDatasetsTest() throws FileNotFoundException, SEITANException {
		URI validURI = URI.create("testUri");
		DatasetInterface dI = null;
		try {
			dI = new DatasetInterface("validUserName",  validURI);
			
		} catch (SEITANException e) {
			assertTrue("Got SEITANEXception.", false);
		}
		assertNotNull("Constructor failed.", dI);
		validURI = URI.create("testDataset0URI");
		TestDataset testDataset0 = new TestDataset(validURI, Permission.READ);
		validURI = URI.create("testDataset1URI");
		TestDataset testDataset1 = new TestDataset(validURI, Permission.READ);
		InputStream in0 = new FileInputStream("Location of testDataset0");
		InputStream in1 = new FileInputStream("Location of testDataset1");
		dI.addDataset(in0, "testDataSet0", "totally interesting data!");
		dI.addDataset(in1, "testDataSet1", "almost interesting data!");
		Set<Dataset> set = dI.getDatasets();
		assertEquals(2, set.size());
		dI.deleteDatasets();
		set = dI.getDatasets();
		assertEquals(0, set.size());
	}
	
	class TestDataset extends Dataset {

		public TestDataset(URI datasetUri, Permission perm) {
			super(datasetUri, perm);
			// TODO Auto-generated constructor stub
		}
		
	}
	
}
