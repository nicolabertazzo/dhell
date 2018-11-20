package eu.stamp_project.examples.dhell;


import java.io.File;
import java.util.ArrayList;
import org.junit.Assert;
import org.junit.Test;


public class MyStorageTest {
    @Test(timeout = 10000)
    public void testMyStorageDefault_literalMutationString112() throws Exception {
        MyStorage myFile = null;
        Assert.assertNull(myFile);
        String myFileName = "XdYQ7-#sa<}t>?";
        Assert.assertEquals("XdYQ7-#sa<}t>?", myFileName);
        File theFile = null;
        MyStorage.deleteFile(myFileName);
        myFile = new MyStorage();
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("my_storage.txt", ((MyStorage) (myFile)).getFileName());
        myFile.getFileName();
        myFile.getDataSize();
        theFile = new File(myFileName);
        theFile = new File(myFileName);
        boolean o_testMyStorageDefault_literalMutationString112__13 = theFile.exists();
        Assert.assertFalse(o_testMyStorageDefault_literalMutationString112__13);
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("my_storage.txt", ((MyStorage) (myFile)).getFileName());
        Assert.assertEquals("XdYQ7-#sa<}t>?", myFileName);
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("my_storage.txt", ((MyStorage) (myFile)).getFileName());
    }

    @Test(timeout = 10000)
    public void testMyStorageDefault_literalMutationString113() throws Exception {
        MyStorage myFile = null;
        Assert.assertNull(myFile);
        String myFileName = "";
        Assert.assertEquals("", myFileName);
        File theFile = null;
        MyStorage.deleteFile(myFileName);
        myFile = new MyStorage();
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("my_storage.txt", ((MyStorage) (myFile)).getFileName());
        myFile.getFileName();
        myFile.getDataSize();
        theFile = new File(myFileName);
        theFile = new File(myFileName);
        boolean o_testMyStorageDefault_literalMutationString113__13 = theFile.exists();
        Assert.assertFalse(o_testMyStorageDefault_literalMutationString113__13);
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("my_storage.txt", ((MyStorage) (myFile)).getFileName());
        Assert.assertEquals("", myFileName);
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("my_storage.txt", ((MyStorage) (myFile)).getFileName());
    }

    @Test(timeout = 10000)
    public void testMyStorageString_literalMutationString136() throws Exception {
        MyStorage myFile = null;
        Assert.assertNull(myFile);
        String myFileName = "foofoo?txt";
        Assert.assertEquals("foofoo?txt", myFileName);
        File theFile = null;
        MyStorage.deleteFile(myFileName);
        myFile = new MyStorage(myFileName);
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("foofoo?txt", ((MyStorage) (myFile)).getFileName());
        myFile.getFileName();
        myFile.getDataSize();
        theFile = new File(myFileName);
        boolean o_testMyStorageString_literalMutationString136__11 = theFile.exists();
        Assert.assertFalse(o_testMyStorageString_literalMutationString136__11);
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("foofoo?txt", ((MyStorage) (myFile)).getFileName());
        Assert.assertEquals("foofoo?txt", myFileName);
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("foofoo?txt", ((MyStorage) (myFile)).getFileName());
    }

    @Test(timeout = 10000)
    public void testMyStorageString_literalMutationString137() throws Exception {
        MyStorage myFile = null;
        Assert.assertNull(myFile);
        String myFileName = "foofgoo.txt";
        Assert.assertEquals("foofgoo.txt", myFileName);
        File theFile = null;
        MyStorage.deleteFile(myFileName);
        myFile = new MyStorage(myFileName);
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("foofgoo.txt", ((MyStorage) (myFile)).getFileName());
        myFile.getFileName();
        myFile.getDataSize();
        theFile = new File(myFileName);
        boolean o_testMyStorageString_literalMutationString137__11 = theFile.exists();
        Assert.assertFalse(o_testMyStorageString_literalMutationString137__11);
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("foofgoo.txt", ((MyStorage) (myFile)).getFileName());
        Assert.assertEquals("foofgoo.txt", myFileName);
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("foofgoo.txt", ((MyStorage) (myFile)).getFileName());
    }

    @Test(timeout = 10000)
    public void testAddData() throws Exception {
        MyStorage myFile = null;
        Assert.assertNull(myFile);
        String myFileName = "foo.txt";
        Assert.assertEquals("foo.txt", myFileName);
        ArrayList<String> myData = new ArrayList<String>();
        boolean o_testAddData__5 = myData.add("1st line");
        Assert.assertTrue(o_testAddData__5);
        boolean o_testAddData__10 = myData.add("a second line, longer than the first one");
        Assert.assertTrue(o_testAddData__10);
        boolean o_testAddData__11 = myData.add("3rd line with something else: 2, 4, 8, 16");
        Assert.assertTrue(o_testAddData__11);
        myFile = new MyStorage(myFileName);
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("foo.txt", ((MyStorage) (myFile)).getFileName());
        for (int i = 0; i < (myData.size()); i++) {
            myFile.addData(myData.get(i));
        }
        int o_testAddData__21 = myData.size();
        Assert.assertEquals(3, ((int) (o_testAddData__21)));
        myFile.getDataSize();
        boolean o_testAddData__23 = myFile.dataAreEqual(myData);
        Assert.assertTrue(o_testAddData__23);
        Assert.assertEquals(3, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("foo.txt", ((MyStorage) (myFile)).getFileName());
        Assert.assertEquals("foo.txt", myFileName);
        Assert.assertTrue(o_testAddData__5);
        Assert.assertTrue(o_testAddData__10);
        Assert.assertTrue(o_testAddData__11);
        Assert.assertEquals(3, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("foo.txt", ((MyStorage) (myFile)).getFileName());
        Assert.assertEquals(3, ((int) (o_testAddData__21)));
    }

    @Test(timeout = 10000)
    public void testAddData_literalMutationString1() throws Exception {
        MyStorage myFile = null;
        Assert.assertNull(myFile);
        String myFileName = "";
        Assert.assertEquals("", myFileName);
        ArrayList<String> myData = new ArrayList<String>();
        boolean o_testAddData_literalMutationString1__5 = myData.add("1st line");
        Assert.assertTrue(o_testAddData_literalMutationString1__5);
        boolean o_testAddData_literalMutationString1__10 = myData.add("a second line, longer than the first one");
        Assert.assertTrue(o_testAddData_literalMutationString1__10);
        boolean o_testAddData_literalMutationString1__11 = myData.add("3rd line with something else: 2, 4, 8, 16");
        Assert.assertTrue(o_testAddData_literalMutationString1__11);
        myFile = new MyStorage(myFileName);
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("", ((MyStorage) (myFile)).getFileName());
        for (int i = 0; i < (myData.size()); i++) {
            myFile.addData(myData.get(i));
        }
        int o_testAddData_literalMutationString1__21 = myData.size();
        Assert.assertEquals(3, ((int) (o_testAddData_literalMutationString1__21)));
        myFile.getDataSize();
        boolean o_testAddData_literalMutationString1__23 = myFile.dataAreEqual(myData);
        Assert.assertTrue(o_testAddData_literalMutationString1__23);
        Assert.assertEquals(3, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("", ((MyStorage) (myFile)).getFileName());
        Assert.assertEquals("", myFileName);
        Assert.assertTrue(o_testAddData_literalMutationString1__5);
        Assert.assertTrue(o_testAddData_literalMutationString1__10);
        Assert.assertTrue(o_testAddData_literalMutationString1__11);
        Assert.assertEquals(3, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("", ((MyStorage) (myFile)).getFileName());
        Assert.assertEquals(3, ((int) (o_testAddData_literalMutationString1__21)));
    }

    @Test(timeout = 10000)
    public void testAddData_literalMutationNumber25() throws Exception {
        MyStorage myFile = null;
        Assert.assertNull(myFile);
        String myFileName = "foo.txt";
        Assert.assertEquals("foo.txt", myFileName);
        ArrayList<String> myData = new ArrayList<String>();
        boolean o_testAddData_literalMutationNumber25__5 = myData.add("1st line");
        Assert.assertTrue(o_testAddData_literalMutationNumber25__5);
        boolean o_testAddData_literalMutationNumber25__10 = myData.add("a second line, longer than the first one");
        Assert.assertTrue(o_testAddData_literalMutationNumber25__10);
        boolean o_testAddData_literalMutationNumber25__11 = myData.add("3rd line with something else: 2, 4, 8, 16");
        Assert.assertTrue(o_testAddData_literalMutationNumber25__11);
        myFile = new MyStorage(myFileName);
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("foo.txt", ((MyStorage) (myFile)).getFileName());
        for (int i = 1; i < (myData.size()); i++) {
            myFile.addData(myData.get(i));
        }
        int o_testAddData_literalMutationNumber25__22 = myData.size();
        Assert.assertEquals(3, ((int) (o_testAddData_literalMutationNumber25__22)));
        myFile.getDataSize();
        boolean o_testAddData_literalMutationNumber25__24 = myFile.dataAreEqual(myData);
        Assert.assertFalse(o_testAddData_literalMutationNumber25__24);
        Assert.assertEquals(2, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("foo.txt", ((MyStorage) (myFile)).getFileName());
        Assert.assertEquals("foo.txt", myFileName);
        Assert.assertTrue(o_testAddData_literalMutationNumber25__5);
        Assert.assertTrue(o_testAddData_literalMutationNumber25__10);
        Assert.assertTrue(o_testAddData_literalMutationNumber25__11);
        Assert.assertEquals(2, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("foo.txt", ((MyStorage) (myFile)).getFileName());
        Assert.assertEquals(3, ((int) (o_testAddData_literalMutationNumber25__22)));
    }

    @Test(timeout = 10000)
    public void testAddData_literalMutationNumber26_failAssert0() throws Exception {
        try {
            MyStorage myFile = null;
            String myFileName = "foo.txt";
            ArrayList<String> myData = new ArrayList<String>();
            myData.add("1st line");
            myData.add("a second line, longer than the first one");
            myData.add("3rd line with something else: 2, 4, 8, 16");
            myFile = new MyStorage(myFileName);
            for (int i = -1; i < (myData.size()); i++) {
                myFile.addData(myData.get(i));
            }
            myData.size();
            myFile.getDataSize();
            myFile.dataAreEqual(myData);
            org.junit.Assert.fail("testAddData_literalMutationNumber26 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("-1", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testSaveReadData() throws Exception {
        MyStorage myFile = null;
        Assert.assertNull(myFile);
        MyStorage mySecondFile = null;
        Assert.assertNull(mySecondFile);
        String myFileName = "bar.txt";
        Assert.assertEquals("bar.txt", myFileName);
        File theFile = null;
        ArrayList<String> myData = new ArrayList<String>();
        MyStorage.deleteFile(myFileName);
        boolean o_testSaveReadData__8 = myData.add("1st line");
        Assert.assertTrue(o_testSaveReadData__8);
        boolean o_testSaveReadData__13 = myData.add("a second line, longer than the first one");
        Assert.assertTrue(o_testSaveReadData__13);
        boolean o_testSaveReadData__14 = myData.add("3rd line with something else: 2, 4, 8, 16");
        Assert.assertTrue(o_testSaveReadData__14);
        myFile = new MyStorage(myFileName);
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("bar.txt", ((MyStorage) (myFile)).getFileName());
        for (int i = 0; i < (myData.size()); i++) {
            myFile.addData(myData.get(i));
        }
        int o_testSaveReadData__25 = myData.size();
        Assert.assertEquals(3, ((int) (o_testSaveReadData__25)));
        myFile.getDataSize();
        boolean o_testSaveReadData__27 = myFile.dataAreEqual(myData);
        Assert.assertTrue(o_testSaveReadData__27);
        myFile.saveData();
        theFile = new File(myFileName);
        boolean o_testSaveReadData__31 = theFile.exists();
        Assert.assertTrue(o_testSaveReadData__31);
        mySecondFile = new MyStorage(myFileName);
        Assert.assertEquals(0, ((int) (((MyStorage) (mySecondFile)).getDataSize())));
        Assert.assertEquals("bar.txt", ((MyStorage) (mySecondFile)).getFileName());
        boolean o_testSaveReadData__35 = theFile.exists();
        Assert.assertTrue(o_testSaveReadData__35);
        boolean o_testSaveReadData__36 = theFile.exists();
        Assert.assertTrue(o_testSaveReadData__36);
        mySecondFile.readData();
        int o_testSaveReadData__38 = myData.size();
        Assert.assertEquals(3, ((int) (o_testSaveReadData__38)));
        mySecondFile.getDataSize();
        boolean o_testSaveReadData__40 = mySecondFile.dataAreEqual(myData);
        Assert.assertTrue(o_testSaveReadData__40);
        boolean o_testSaveReadData__41 = myFile.isEqual(mySecondFile);
        Assert.assertTrue(o_testSaveReadData__41);
        Assert.assertEquals(3, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("bar.txt", ((MyStorage) (myFile)).getFileName());
        Assert.assertEquals(3, ((int) (((MyStorage) (mySecondFile)).getDataSize())));
        Assert.assertEquals("bar.txt", ((MyStorage) (mySecondFile)).getFileName());
        Assert.assertEquals("bar.txt", myFileName);
        Assert.assertTrue(o_testSaveReadData__8);
        Assert.assertTrue(o_testSaveReadData__13);
        Assert.assertTrue(o_testSaveReadData__14);
        Assert.assertEquals(3, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("bar.txt", ((MyStorage) (myFile)).getFileName());
        Assert.assertEquals(3, ((int) (o_testSaveReadData__25)));
        Assert.assertTrue(o_testSaveReadData__27);
        Assert.assertTrue(o_testSaveReadData__31);
        Assert.assertEquals(3, ((int) (((MyStorage) (mySecondFile)).getDataSize())));
        Assert.assertEquals("bar.txt", ((MyStorage) (mySecondFile)).getFileName());
        Assert.assertTrue(o_testSaveReadData__35);
        Assert.assertTrue(o_testSaveReadData__36);
        Assert.assertEquals(3, ((int) (o_testSaveReadData__38)));
        Assert.assertTrue(o_testSaveReadData__40);
    }

    @Test(timeout = 10000)
    public void testSaveReadData_literalMutationString160() throws Exception {
        MyStorage myFile = null;
        Assert.assertNull(myFile);
        MyStorage mySecondFile = null;
        Assert.assertNull(mySecondFile);
        String myFileName = "";
        Assert.assertEquals("", myFileName);
        File theFile = null;
        ArrayList<String> myData = new ArrayList<String>();
        MyStorage.deleteFile(myFileName);
        boolean o_testSaveReadData_literalMutationString160__8 = myData.add("1st line");
        Assert.assertTrue(o_testSaveReadData_literalMutationString160__8);
        boolean o_testSaveReadData_literalMutationString160__13 = myData.add("a second line, longer than the first one");
        Assert.assertTrue(o_testSaveReadData_literalMutationString160__13);
        boolean o_testSaveReadData_literalMutationString160__14 = myData.add("3rd line with something else: 2, 4, 8, 16");
        Assert.assertTrue(o_testSaveReadData_literalMutationString160__14);
        myFile = new MyStorage(myFileName);
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("", ((MyStorage) (myFile)).getFileName());
        for (int i = 0; i < (myData.size()); i++) {
            myFile.addData(myData.get(i));
        }
        int o_testSaveReadData_literalMutationString160__25 = myData.size();
        Assert.assertEquals(3, ((int) (o_testSaveReadData_literalMutationString160__25)));
        myFile.getDataSize();
        boolean o_testSaveReadData_literalMutationString160__27 = myFile.dataAreEqual(myData);
        Assert.assertTrue(o_testSaveReadData_literalMutationString160__27);
        myFile.saveData();
        theFile = new File(myFileName);
        boolean o_testSaveReadData_literalMutationString160__31 = theFile.exists();
        Assert.assertFalse(o_testSaveReadData_literalMutationString160__31);
        mySecondFile = new MyStorage(myFileName);
        Assert.assertEquals(0, ((int) (((MyStorage) (mySecondFile)).getDataSize())));
        Assert.assertEquals("", ((MyStorage) (mySecondFile)).getFileName());
        boolean o_testSaveReadData_literalMutationString160__35 = theFile.exists();
        Assert.assertFalse(o_testSaveReadData_literalMutationString160__35);
        boolean o_testSaveReadData_literalMutationString160__36 = theFile.exists();
        Assert.assertFalse(o_testSaveReadData_literalMutationString160__36);
        mySecondFile.readData();
        int o_testSaveReadData_literalMutationString160__38 = myData.size();
        Assert.assertEquals(3, ((int) (o_testSaveReadData_literalMutationString160__38)));
        mySecondFile.getDataSize();
        boolean o_testSaveReadData_literalMutationString160__40 = mySecondFile.dataAreEqual(myData);
        Assert.assertFalse(o_testSaveReadData_literalMutationString160__40);
        boolean o_testSaveReadData_literalMutationString160__41 = myFile.isEqual(mySecondFile);
        Assert.assertFalse(o_testSaveReadData_literalMutationString160__41);
        Assert.assertEquals(3, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("", ((MyStorage) (myFile)).getFileName());
        Assert.assertEquals(0, ((int) (((MyStorage) (mySecondFile)).getDataSize())));
        Assert.assertEquals("", ((MyStorage) (mySecondFile)).getFileName());
        Assert.assertEquals("", myFileName);
        Assert.assertTrue(o_testSaveReadData_literalMutationString160__8);
        Assert.assertTrue(o_testSaveReadData_literalMutationString160__13);
        Assert.assertTrue(o_testSaveReadData_literalMutationString160__14);
        Assert.assertEquals(3, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("", ((MyStorage) (myFile)).getFileName());
        Assert.assertEquals(3, ((int) (o_testSaveReadData_literalMutationString160__25)));
        Assert.assertTrue(o_testSaveReadData_literalMutationString160__27);
        Assert.assertFalse(o_testSaveReadData_literalMutationString160__31);
        Assert.assertEquals(0, ((int) (((MyStorage) (mySecondFile)).getDataSize())));
        Assert.assertEquals("", ((MyStorage) (mySecondFile)).getFileName());
        Assert.assertFalse(o_testSaveReadData_literalMutationString160__35);
        Assert.assertFalse(o_testSaveReadData_literalMutationString160__36);
        Assert.assertEquals(3, ((int) (o_testSaveReadData_literalMutationString160__38)));
        Assert.assertFalse(o_testSaveReadData_literalMutationString160__40);
    }

    @Test(timeout = 10000)
    public void testSaveReadData_literalMutationString161() throws Exception {
        MyStorage myFile = null;
        Assert.assertNull(myFile);
        MyStorage mySecondFile = null;
        Assert.assertNull(mySecondFile);
        String myFileName = "eu.stamp_project.examples.dhell.MyGod";
        Assert.assertEquals("eu.stamp_project.examples.dhell.MyGod", myFileName);
        File theFile = null;
        ArrayList<String> myData = new ArrayList<String>();
        MyStorage.deleteFile(myFileName);
        boolean o_testSaveReadData_literalMutationString161__8 = myData.add("1st line");
        Assert.assertTrue(o_testSaveReadData_literalMutationString161__8);
        boolean o_testSaveReadData_literalMutationString161__13 = myData.add("a second line, longer than the first one");
        Assert.assertTrue(o_testSaveReadData_literalMutationString161__13);
        boolean o_testSaveReadData_literalMutationString161__14 = myData.add("3rd line with something else: 2, 4, 8, 16");
        Assert.assertTrue(o_testSaveReadData_literalMutationString161__14);
        myFile = new MyStorage(myFileName);
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("eu.stamp_project.examples.dhell.MyGod", ((MyStorage) (myFile)).getFileName());
        for (int i = 0; i < (myData.size()); i++) {
            myFile.addData(myData.get(i));
        }
        int o_testSaveReadData_literalMutationString161__25 = myData.size();
        Assert.assertEquals(3, ((int) (o_testSaveReadData_literalMutationString161__25)));
        myFile.getDataSize();
        boolean o_testSaveReadData_literalMutationString161__27 = myFile.dataAreEqual(myData);
        Assert.assertTrue(o_testSaveReadData_literalMutationString161__27);
        myFile.saveData();
        theFile = new File(myFileName);
        boolean o_testSaveReadData_literalMutationString161__31 = theFile.exists();
        Assert.assertTrue(o_testSaveReadData_literalMutationString161__31);
        mySecondFile = new MyStorage(myFileName);
        Assert.assertEquals(0, ((int) (((MyStorage) (mySecondFile)).getDataSize())));
        Assert.assertEquals("eu.stamp_project.examples.dhell.MyGod", ((MyStorage) (mySecondFile)).getFileName());
        boolean o_testSaveReadData_literalMutationString161__35 = theFile.exists();
        Assert.assertTrue(o_testSaveReadData_literalMutationString161__35);
        boolean o_testSaveReadData_literalMutationString161__36 = theFile.exists();
        Assert.assertTrue(o_testSaveReadData_literalMutationString161__36);
        mySecondFile.readData();
        int o_testSaveReadData_literalMutationString161__38 = myData.size();
        Assert.assertEquals(3, ((int) (o_testSaveReadData_literalMutationString161__38)));
        mySecondFile.getDataSize();
        boolean o_testSaveReadData_literalMutationString161__40 = mySecondFile.dataAreEqual(myData);
        Assert.assertTrue(o_testSaveReadData_literalMutationString161__40);
        boolean o_testSaveReadData_literalMutationString161__41 = myFile.isEqual(mySecondFile);
        Assert.assertTrue(o_testSaveReadData_literalMutationString161__41);
        Assert.assertEquals(3, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("eu.stamp_project.examples.dhell.MyGod", ((MyStorage) (myFile)).getFileName());
        Assert.assertEquals(3, ((int) (((MyStorage) (mySecondFile)).getDataSize())));
        Assert.assertEquals("eu.stamp_project.examples.dhell.MyGod", ((MyStorage) (mySecondFile)).getFileName());
        Assert.assertEquals("eu.stamp_project.examples.dhell.MyGod", myFileName);
        Assert.assertTrue(o_testSaveReadData_literalMutationString161__8);
        Assert.assertTrue(o_testSaveReadData_literalMutationString161__13);
        Assert.assertTrue(o_testSaveReadData_literalMutationString161__14);
        Assert.assertEquals(3, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("eu.stamp_project.examples.dhell.MyGod", ((MyStorage) (myFile)).getFileName());
        Assert.assertEquals(3, ((int) (o_testSaveReadData_literalMutationString161__25)));
        Assert.assertTrue(o_testSaveReadData_literalMutationString161__27);
        Assert.assertTrue(o_testSaveReadData_literalMutationString161__31);
        Assert.assertEquals(3, ((int) (((MyStorage) (mySecondFile)).getDataSize())));
        Assert.assertEquals("eu.stamp_project.examples.dhell.MyGod", ((MyStorage) (mySecondFile)).getFileName());
        Assert.assertTrue(o_testSaveReadData_literalMutationString161__35);
        Assert.assertTrue(o_testSaveReadData_literalMutationString161__36);
        Assert.assertEquals(3, ((int) (o_testSaveReadData_literalMutationString161__38)));
        Assert.assertTrue(o_testSaveReadData_literalMutationString161__40);
    }

    @Test(timeout = 10000)
    public void testSaveReadData_literalMutationString166() throws Exception {
        MyStorage myFile = null;
        Assert.assertNull(myFile);
        MyStorage mySecondFile = null;
        Assert.assertNull(mySecondFile);
        String myFileName = "bar.txt";
        Assert.assertEquals("bar.txt", myFileName);
        File theFile = null;
        ArrayList<String> myData = new ArrayList<String>();
        MyStorage.deleteFile(myFileName);
        boolean o_testSaveReadData_literalMutationString166__8 = myData.add("");
        Assert.assertTrue(o_testSaveReadData_literalMutationString166__8);
        boolean o_testSaveReadData_literalMutationString166__13 = myData.add("a second line, longer than the first one");
        Assert.assertTrue(o_testSaveReadData_literalMutationString166__13);
        boolean o_testSaveReadData_literalMutationString166__14 = myData.add("3rd line with something else: 2, 4, 8, 16");
        Assert.assertTrue(o_testSaveReadData_literalMutationString166__14);
        myFile = new MyStorage(myFileName);
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("bar.txt", ((MyStorage) (myFile)).getFileName());
        for (int i = 0; i < (myData.size()); i++) {
            myFile.addData(myData.get(i));
        }
        int o_testSaveReadData_literalMutationString166__25 = myData.size();
        Assert.assertEquals(3, ((int) (o_testSaveReadData_literalMutationString166__25)));
        myFile.getDataSize();
        boolean o_testSaveReadData_literalMutationString166__27 = myFile.dataAreEqual(myData);
        Assert.assertTrue(o_testSaveReadData_literalMutationString166__27);
        myFile.saveData();
        theFile = new File(myFileName);
        boolean o_testSaveReadData_literalMutationString166__31 = theFile.exists();
        Assert.assertTrue(o_testSaveReadData_literalMutationString166__31);
        mySecondFile = new MyStorage(myFileName);
        Assert.assertEquals(0, ((int) (((MyStorage) (mySecondFile)).getDataSize())));
        Assert.assertEquals("bar.txt", ((MyStorage) (mySecondFile)).getFileName());
        boolean o_testSaveReadData_literalMutationString166__35 = theFile.exists();
        Assert.assertTrue(o_testSaveReadData_literalMutationString166__35);
        boolean o_testSaveReadData_literalMutationString166__36 = theFile.exists();
        Assert.assertTrue(o_testSaveReadData_literalMutationString166__36);
        mySecondFile.readData();
        int o_testSaveReadData_literalMutationString166__38 = myData.size();
        Assert.assertEquals(3, ((int) (o_testSaveReadData_literalMutationString166__38)));
        mySecondFile.getDataSize();
        boolean o_testSaveReadData_literalMutationString166__40 = mySecondFile.dataAreEqual(myData);
        Assert.assertTrue(o_testSaveReadData_literalMutationString166__40);
        boolean o_testSaveReadData_literalMutationString166__41 = myFile.isEqual(mySecondFile);
        Assert.assertTrue(o_testSaveReadData_literalMutationString166__41);
        Assert.assertEquals(3, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("bar.txt", ((MyStorage) (myFile)).getFileName());
        Assert.assertEquals(3, ((int) (((MyStorage) (mySecondFile)).getDataSize())));
        Assert.assertEquals("bar.txt", ((MyStorage) (mySecondFile)).getFileName());
        Assert.assertEquals("bar.txt", myFileName);
        Assert.assertTrue(o_testSaveReadData_literalMutationString166__8);
        Assert.assertTrue(o_testSaveReadData_literalMutationString166__13);
        Assert.assertTrue(o_testSaveReadData_literalMutationString166__14);
        Assert.assertEquals(3, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("bar.txt", ((MyStorage) (myFile)).getFileName());
        Assert.assertEquals(3, ((int) (o_testSaveReadData_literalMutationString166__25)));
        Assert.assertTrue(o_testSaveReadData_literalMutationString166__27);
        Assert.assertTrue(o_testSaveReadData_literalMutationString166__31);
        Assert.assertEquals(3, ((int) (((MyStorage) (mySecondFile)).getDataSize())));
        Assert.assertEquals("bar.txt", ((MyStorage) (mySecondFile)).getFileName());
        Assert.assertTrue(o_testSaveReadData_literalMutationString166__35);
        Assert.assertTrue(o_testSaveReadData_literalMutationString166__36);
        Assert.assertEquals(3, ((int) (o_testSaveReadData_literalMutationString166__38)));
        Assert.assertTrue(o_testSaveReadData_literalMutationString166__40);
    }

    @Test(timeout = 10000)
    public void testSaveReadData_literalMutationNumber184() throws Exception {
        MyStorage myFile = null;
        Assert.assertNull(myFile);
        MyStorage mySecondFile = null;
        Assert.assertNull(mySecondFile);
        String myFileName = "bar.txt";
        Assert.assertEquals("bar.txt", myFileName);
        File theFile = null;
        ArrayList<String> myData = new ArrayList<String>();
        MyStorage.deleteFile(myFileName);
        boolean o_testSaveReadData_literalMutationNumber184__8 = myData.add("1st line");
        Assert.assertTrue(o_testSaveReadData_literalMutationNumber184__8);
        boolean o_testSaveReadData_literalMutationNumber184__13 = myData.add("a second line, longer than the first one");
        Assert.assertTrue(o_testSaveReadData_literalMutationNumber184__13);
        boolean o_testSaveReadData_literalMutationNumber184__14 = myData.add("3rd line with something else: 2, 4, 8, 16");
        Assert.assertTrue(o_testSaveReadData_literalMutationNumber184__14);
        myFile = new MyStorage(myFileName);
        Assert.assertEquals(0, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("bar.txt", ((MyStorage) (myFile)).getFileName());
        for (int i = 1; i < (myData.size()); i++) {
            myFile.addData(myData.get(i));
        }
        int o_testSaveReadData_literalMutationNumber184__26 = myData.size();
        Assert.assertEquals(3, ((int) (o_testSaveReadData_literalMutationNumber184__26)));
        myFile.getDataSize();
        boolean o_testSaveReadData_literalMutationNumber184__28 = myFile.dataAreEqual(myData);
        Assert.assertFalse(o_testSaveReadData_literalMutationNumber184__28);
        myFile.saveData();
        theFile = new File(myFileName);
        boolean o_testSaveReadData_literalMutationNumber184__32 = theFile.exists();
        Assert.assertTrue(o_testSaveReadData_literalMutationNumber184__32);
        mySecondFile = new MyStorage(myFileName);
        Assert.assertEquals(0, ((int) (((MyStorage) (mySecondFile)).getDataSize())));
        Assert.assertEquals("bar.txt", ((MyStorage) (mySecondFile)).getFileName());
        boolean o_testSaveReadData_literalMutationNumber184__36 = theFile.exists();
        Assert.assertTrue(o_testSaveReadData_literalMutationNumber184__36);
        boolean o_testSaveReadData_literalMutationNumber184__37 = theFile.exists();
        Assert.assertTrue(o_testSaveReadData_literalMutationNumber184__37);
        mySecondFile.readData();
        int o_testSaveReadData_literalMutationNumber184__39 = myData.size();
        Assert.assertEquals(3, ((int) (o_testSaveReadData_literalMutationNumber184__39)));
        mySecondFile.getDataSize();
        boolean o_testSaveReadData_literalMutationNumber184__41 = mySecondFile.dataAreEqual(myData);
        Assert.assertFalse(o_testSaveReadData_literalMutationNumber184__41);
        boolean o_testSaveReadData_literalMutationNumber184__42 = myFile.isEqual(mySecondFile);
        Assert.assertTrue(o_testSaveReadData_literalMutationNumber184__42);
        Assert.assertEquals(2, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("bar.txt", ((MyStorage) (myFile)).getFileName());
        Assert.assertEquals(2, ((int) (((MyStorage) (mySecondFile)).getDataSize())));
        Assert.assertEquals("bar.txt", ((MyStorage) (mySecondFile)).getFileName());
        Assert.assertEquals("bar.txt", myFileName);
        Assert.assertTrue(o_testSaveReadData_literalMutationNumber184__8);
        Assert.assertTrue(o_testSaveReadData_literalMutationNumber184__13);
        Assert.assertTrue(o_testSaveReadData_literalMutationNumber184__14);
        Assert.assertEquals(2, ((int) (((MyStorage) (myFile)).getDataSize())));
        Assert.assertEquals("bar.txt", ((MyStorage) (myFile)).getFileName());
        Assert.assertEquals(3, ((int) (o_testSaveReadData_literalMutationNumber184__26)));
        Assert.assertFalse(o_testSaveReadData_literalMutationNumber184__28);
        Assert.assertTrue(o_testSaveReadData_literalMutationNumber184__32);
        Assert.assertEquals(2, ((int) (((MyStorage) (mySecondFile)).getDataSize())));
        Assert.assertEquals("bar.txt", ((MyStorage) (mySecondFile)).getFileName());
        Assert.assertTrue(o_testSaveReadData_literalMutationNumber184__36);
        Assert.assertTrue(o_testSaveReadData_literalMutationNumber184__37);
        Assert.assertEquals(3, ((int) (o_testSaveReadData_literalMutationNumber184__39)));
        Assert.assertFalse(o_testSaveReadData_literalMutationNumber184__41);
    }

    @Test(timeout = 10000)
    public void testSaveReadData_literalMutationNumber185_failAssert1() throws Exception {
        try {
            MyStorage myFile = null;
            MyStorage mySecondFile = null;
            String myFileName = "bar.txt";
            File theFile = null;
            ArrayList<String> myData = new ArrayList<String>();
            MyStorage.deleteFile(myFileName);
            myData.add("1st line");
            myData.add("a second line, longer than the first one");
            myData.add("3rd line with something else: 2, 4, 8, 16");
            myFile = new MyStorage(myFileName);
            for (int i = -1; i < (myData.size()); i++) {
                myFile.addData(myData.get(i));
            }
            myData.size();
            myFile.getDataSize();
            myFile.dataAreEqual(myData);
            myFile.saveData();
            theFile = new File(myFileName);
            theFile.exists();
            mySecondFile = new MyStorage(myFileName);
            theFile.exists();
            theFile.exists();
            mySecondFile.readData();
            myData.size();
            mySecondFile.getDataSize();
            mySecondFile.dataAreEqual(myData);
            myFile.isEqual(mySecondFile);
            org.junit.Assert.fail("testSaveReadData_literalMutationNumber185 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("-1", expected.getMessage());
        }
    }
}

