package eu.stamp_project.examples.dhell;


import java.io.File;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;


public class HelloAppTest {
    @BeforeClass
    public static void runOnceAtTheBeginning() {
        System.out.println("dhell.HelloAppTest: @BeforeClass - runOnceAtTheBeginning");
    }

    @org.junit.AfterClass
    public static void runOnceAtTheEnd() {
        System.out.println("dhell.HelloAppTest: @AfterClass - runOnceAtTheEnd");
    }

    @Test(timeout = 10000)
    public void testHelloAppDefault() throws Exception {
        HelloApp myApp = null;
        Assert.assertNull(myApp);
        File theFile = null;
        myApp = new HelloApp();
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals("myHelloApp.traces", ((HelloApp) (myApp)).getMyTracesName());
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        myApp.getMyPrintCount();
        myApp.getMyTracesName();
        int o_testHelloAppDefault__7 = myApp.cardMyTraces();
        Assert.assertEquals(0, ((int) (o_testHelloAppDefault__7)));
        boolean boolean_0 = (myApp.returnSomething()) > 0;
        theFile = new File(myApp.getMyTracesName());
        boolean o_testHelloAppDefault__13 = theFile.exists();
        Assert.assertFalse(o_testHelloAppDefault__13);
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals("myHelloApp.traces", ((HelloApp) (myApp)).getMyTracesName());
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals("myHelloApp.traces", ((HelloApp) (myApp)).getMyTracesName());
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        Assert.assertEquals(0, ((int) (o_testHelloAppDefault__7)));
    }

    @Test(timeout = 10000)
    public void testHelloAppInt() throws Exception {
        HelloApp myApp = null;
        Assert.assertNull(myApp);
        File theFile = null;
        int myCount = 8;
        Assert.assertEquals(8, ((int) (myCount)));
        myApp = new HelloApp(myCount);
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(8, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals("myHelloApp.traces", ((HelloApp) (myApp)).getMyTracesName());
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        myApp.getMyPrintCount();
        myApp.getMyTracesName();
        int o_testHelloAppInt__8 = myApp.cardMyTraces();
        Assert.assertEquals(0, ((int) (o_testHelloAppInt__8)));
        theFile = new File(myApp.getMyTracesName());
        boolean o_testHelloAppInt__12 = theFile.exists();
        Assert.assertFalse(o_testHelloAppInt__12);
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(8, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals("myHelloApp.traces", ((HelloApp) (myApp)).getMyTracesName());
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        Assert.assertEquals(8, ((int) (myCount)));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(8, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals("myHelloApp.traces", ((HelloApp) (myApp)).getMyTracesName());
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        Assert.assertEquals(0, ((int) (o_testHelloAppInt__8)));
    }

    @Test(timeout = 10000)
    public void testHelloAppInt_literalMutationNumber1() throws Exception {
        HelloApp myApp = null;
        Assert.assertNull(myApp);
        File theFile = null;
        int myCount = 4;
        Assert.assertEquals(4, ((int) (myCount)));
        myApp = new HelloApp(myCount);
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(4, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals("myHelloApp.traces", ((HelloApp) (myApp)).getMyTracesName());
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        myApp.getMyPrintCount();
        myApp.getMyTracesName();
        int o_testHelloAppInt_literalMutationNumber1__9 = myApp.cardMyTraces();
        Assert.assertEquals(0, ((int) (o_testHelloAppInt_literalMutationNumber1__9)));
        theFile = new File(myApp.getMyTracesName());
        boolean o_testHelloAppInt_literalMutationNumber1__13 = theFile.exists();
        Assert.assertFalse(o_testHelloAppInt_literalMutationNumber1__13);
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(4, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals("myHelloApp.traces", ((HelloApp) (myApp)).getMyTracesName());
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        Assert.assertEquals(4, ((int) (myCount)));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(4, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals("myHelloApp.traces", ((HelloApp) (myApp)).getMyTracesName());
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        Assert.assertEquals(0, ((int) (o_testHelloAppInt_literalMutationNumber1__9)));
    }

    @Test(timeout = 10000)
    public void testHelloAppInt_literalMutationNumber2() throws Exception {
        HelloApp myApp = null;
        Assert.assertNull(myApp);
        File theFile = null;
        int myCount = 16;
        Assert.assertEquals(16, ((int) (myCount)));
        myApp = new HelloApp(myCount);
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(16, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals("myHelloApp.traces", ((HelloApp) (myApp)).getMyTracesName());
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        myApp.getMyPrintCount();
        myApp.getMyTracesName();
        int o_testHelloAppInt_literalMutationNumber2__9 = myApp.cardMyTraces();
        Assert.assertEquals(0, ((int) (o_testHelloAppInt_literalMutationNumber2__9)));
        theFile = new File(myApp.getMyTracesName());
        boolean o_testHelloAppInt_literalMutationNumber2__13 = theFile.exists();
        Assert.assertFalse(o_testHelloAppInt_literalMutationNumber2__13);
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(16, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals("myHelloApp.traces", ((HelloApp) (myApp)).getMyTracesName());
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        Assert.assertEquals(16, ((int) (myCount)));
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(16, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals("myHelloApp.traces", ((HelloApp) (myApp)).getMyTracesName());
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        Assert.assertEquals(0, ((int) (o_testHelloAppInt_literalMutationNumber2__9)));
    }

    @Test(timeout = 10000)
    public void testHelloAppString() throws Exception {
        HelloApp myApp = null;
        Assert.assertNull(myApp);
        File theFile = null;
        String MyTracesName = "foo1.traces";
        Assert.assertEquals("foo1.traces", MyTracesName);
        myApp = new HelloApp(MyTracesName);
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals("foo1.traces", ((HelloApp) (myApp)).getMyTracesName());
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        myApp.getMyPrintCount();
        myApp.getMyTracesName();
        int o_testHelloAppString__8 = myApp.cardMyTraces();
        Assert.assertEquals(0, ((int) (o_testHelloAppString__8)));
        theFile = new File(myApp.getMyTracesName());
        boolean o_testHelloAppString__12 = theFile.exists();
        Assert.assertFalse(o_testHelloAppString__12);
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals("foo1.traces", ((HelloApp) (myApp)).getMyTracesName());
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        Assert.assertEquals("foo1.traces", MyTracesName);
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals("foo1.traces", ((HelloApp) (myApp)).getMyTracesName());
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        Assert.assertEquals(0, ((int) (o_testHelloAppString__8)));
    }

    @Test(timeout = 10000)
    public void testHelloAppString_literalMutationString249() throws Exception {
        HelloApp myApp = null;
        Assert.assertNull(myApp);
        File theFile = null;
        String MyTracesName = "foo1traces";
        Assert.assertEquals("foo1traces", MyTracesName);
        myApp = new HelloApp(MyTracesName);
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals("foo1traces", ((HelloApp) (myApp)).getMyTracesName());
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        myApp.getMyPrintCount();
        myApp.getMyTracesName();
        int o_testHelloAppString_literalMutationString249__8 = myApp.cardMyTraces();
        Assert.assertEquals(0, ((int) (o_testHelloAppString_literalMutationString249__8)));
        theFile = new File(myApp.getMyTracesName());
        boolean o_testHelloAppString_literalMutationString249__12 = theFile.exists();
        Assert.assertFalse(o_testHelloAppString_literalMutationString249__12);
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals("foo1traces", ((HelloApp) (myApp)).getMyTracesName());
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        Assert.assertEquals("foo1traces", MyTracesName);
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals("foo1traces", ((HelloApp) (myApp)).getMyTracesName());
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        Assert.assertEquals(0, ((int) (o_testHelloAppString_literalMutationString249__8)));
    }

    @Test(timeout = 10000)
    public void testHelloAppString_literalMutationString250() throws Exception {
        HelloApp myApp = null;
        Assert.assertNull(myApp);
        File theFile = null;
        String MyTracesName = "";
        Assert.assertEquals("", MyTracesName);
        myApp = new HelloApp(MyTracesName);
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals("", ((HelloApp) (myApp)).getMyTracesName());
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        myApp.getMyPrintCount();
        myApp.getMyTracesName();
        int o_testHelloAppString_literalMutationString250__8 = myApp.cardMyTraces();
        Assert.assertEquals(0, ((int) (o_testHelloAppString_literalMutationString250__8)));
        theFile = new File(myApp.getMyTracesName());
        boolean o_testHelloAppString_literalMutationString250__12 = theFile.exists();
        Assert.assertFalse(o_testHelloAppString_literalMutationString250__12);
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals("", ((HelloApp) (myApp)).getMyTracesName());
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        Assert.assertEquals("", MyTracesName);
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals("", ((HelloApp) (myApp)).getMyTracesName());
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        Assert.assertEquals(0, ((int) (o_testHelloAppString_literalMutationString250__8)));
    }

    @Test(timeout = 10000)
    public void testHelloAppIntString() throws Exception {
        HelloApp myApp = null;
        Assert.assertNull(myApp);
        File theFile = null;
        int myCount = 8;
        Assert.assertEquals(8, ((int) (myCount)));
        String MyTracesName = "foo2.traces";
        Assert.assertEquals("foo2.traces", MyTracesName);
        myApp = new HelloApp(myCount, MyTracesName);
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(8, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals("foo2.traces", ((HelloApp) (myApp)).getMyTracesName());
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        myApp.getMyPrintCount();
        myApp.getMyTracesName();
        int o_testHelloAppIntString__9 = myApp.cardMyTraces();
        Assert.assertEquals(0, ((int) (o_testHelloAppIntString__9)));
        theFile = new File(myApp.getMyTracesName());
        boolean o_testHelloAppIntString__13 = theFile.exists();
        Assert.assertFalse(o_testHelloAppIntString__13);
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(8, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals("foo2.traces", ((HelloApp) (myApp)).getMyTracesName());
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        Assert.assertEquals(8, ((int) (myCount)));
        Assert.assertEquals("foo2.traces", MyTracesName);
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(8, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals("foo2.traces", ((HelloApp) (myApp)).getMyTracesName());
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        Assert.assertEquals(0, ((int) (o_testHelloAppIntString__9)));
    }

    @Test(timeout = 10000)
    public void testHelloAppIntString_literalMutationNumber21() throws Exception {
        HelloApp myApp = null;
        Assert.assertNull(myApp);
        File theFile = null;
        int myCount = 4;
        Assert.assertEquals(4, ((int) (myCount)));
        String MyTracesName = "foo2.traces";
        Assert.assertEquals("foo2.traces", MyTracesName);
        myApp = new HelloApp(myCount, MyTracesName);
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(4, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals("foo2.traces", ((HelloApp) (myApp)).getMyTracesName());
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        myApp.getMyPrintCount();
        myApp.getMyTracesName();
        int o_testHelloAppIntString_literalMutationNumber21__10 = myApp.cardMyTraces();
        Assert.assertEquals(0, ((int) (o_testHelloAppIntString_literalMutationNumber21__10)));
        theFile = new File(myApp.getMyTracesName());
        boolean o_testHelloAppIntString_literalMutationNumber21__14 = theFile.exists();
        Assert.assertFalse(o_testHelloAppIntString_literalMutationNumber21__14);
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(4, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals("foo2.traces", ((HelloApp) (myApp)).getMyTracesName());
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        Assert.assertEquals(4, ((int) (myCount)));
        Assert.assertEquals("foo2.traces", MyTracesName);
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(4, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals("foo2.traces", ((HelloApp) (myApp)).getMyTracesName());
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        Assert.assertEquals(0, ((int) (o_testHelloAppIntString_literalMutationNumber21__10)));
    }

    @Test(timeout = 10000)
    public void testHelloAppIntString_literalMutationString26() throws Exception {
        HelloApp myApp = null;
        Assert.assertNull(myApp);
        File theFile = null;
        int myCount = 8;
        Assert.assertEquals(8, ((int) (myCount)));
        String MyTracesName = "";
        Assert.assertEquals("", MyTracesName);
        myApp = new HelloApp(myCount, MyTracesName);
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(8, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals("", ((HelloApp) (myApp)).getMyTracesName());
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        myApp.getMyPrintCount();
        myApp.getMyTracesName();
        int o_testHelloAppIntString_literalMutationString26__9 = myApp.cardMyTraces();
        Assert.assertEquals(0, ((int) (o_testHelloAppIntString_literalMutationString26__9)));
        theFile = new File(myApp.getMyTracesName());
        boolean o_testHelloAppIntString_literalMutationString26__13 = theFile.exists();
        Assert.assertFalse(o_testHelloAppIntString_literalMutationString26__13);
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(8, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals("", ((HelloApp) (myApp)).getMyTracesName());
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        Assert.assertEquals(8, ((int) (myCount)));
        Assert.assertEquals("", MyTracesName);
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(8, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals("", ((HelloApp) (myApp)).getMyTracesName());
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        Assert.assertEquals(0, ((int) (o_testHelloAppIntString_literalMutationString26__9)));
    }

    @Test(timeout = 10000)
    public void testHelloAppRun1() throws Exception {
        HelloApp myApp = null;
        Assert.assertNull(myApp);
        File theFile = null;
        MyStorage fileContent = null;
        Assert.assertNull(fileContent);
        String countString;
        myApp = new HelloApp();
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals("myHelloApp.traces", ((HelloApp) (myApp)).getMyTracesName());
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        myApp.run();
        theFile = new File(myApp.getMyTracesName());
        countString = Integer.toString(myApp.getMyPrintCount());
        Assert.assertEquals("1", countString);
        boolean o_testHelloAppRun1__17 = theFile.exists();
        Assert.assertTrue(o_testHelloAppRun1__17);
        boolean o_testHelloAppRun1__18 = countString.equals(myApp.getMyTraces().getData(0));
        Assert.assertTrue(o_testHelloAppRun1__18);
        fileContent = new MyStorage(myApp.getMyTracesName());
        Assert.assertEquals(0, ((int) (((MyStorage) (fileContent)).getDataSize())));
        Assert.assertEquals("myHelloApp.traces", ((MyStorage) (fileContent)).getFileName());
        fileContent.readData();
        boolean o_testHelloAppRun1__25 = fileContent.isEqual(myApp.getMyTraces());
        Assert.assertTrue(o_testHelloAppRun1__25);
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals("myHelloApp.traces", ((HelloApp) (myApp)).getMyTracesName());
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertEquals("myHelloApp.traces", ((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getFileName());
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
        Assert.assertEquals("myHelloApp.traces", ((MyStorage) (fileContent)).getFileName());
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals("myHelloApp.traces", ((HelloApp) (myApp)).getMyTracesName());
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertEquals("myHelloApp.traces", ((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getFileName());
        Assert.assertEquals("1", countString);
        Assert.assertTrue(o_testHelloAppRun1__17);
        Assert.assertTrue(o_testHelloAppRun1__18);
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
        Assert.assertEquals("myHelloApp.traces", ((MyStorage) (fileContent)).getFileName());
    }

    @Test(timeout = 10000)
    public void testHelloAppRun1_literalMutationNumber65() throws Exception {
        HelloApp myApp = null;
        Assert.assertNull(myApp);
        File theFile = null;
        MyStorage fileContent = null;
        Assert.assertNull(fileContent);
        String countString;
        myApp = new HelloApp();
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals("myHelloApp.traces", ((HelloApp) (myApp)).getMyTracesName());
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        myApp.run();
        theFile = new File(myApp.getMyTracesName());
        countString = Integer.toString(myApp.getMyPrintCount());
        Assert.assertEquals("1", countString);
        boolean o_testHelloAppRun1_literalMutationNumber65__17 = theFile.exists();
        Assert.assertTrue(o_testHelloAppRun1_literalMutationNumber65__17);
        boolean o_testHelloAppRun1_literalMutationNumber65__18 = countString.equals(myApp.getMyTraces().getData(1));
        Assert.assertFalse(o_testHelloAppRun1_literalMutationNumber65__18);
        fileContent = new MyStorage(myApp.getMyTracesName());
        Assert.assertEquals(0, ((int) (((MyStorage) (fileContent)).getDataSize())));
        Assert.assertEquals("myHelloApp.traces", ((MyStorage) (fileContent)).getFileName());
        fileContent.readData();
        boolean o_testHelloAppRun1_literalMutationNumber65__26 = fileContent.isEqual(myApp.getMyTraces());
        Assert.assertTrue(o_testHelloAppRun1_literalMutationNumber65__26);
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals("myHelloApp.traces", ((HelloApp) (myApp)).getMyTracesName());
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertEquals("myHelloApp.traces", ((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getFileName());
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
        Assert.assertEquals("myHelloApp.traces", ((MyStorage) (fileContent)).getFileName());
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(1, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals("myHelloApp.traces", ((HelloApp) (myApp)).getMyTracesName());
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertEquals("myHelloApp.traces", ((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getFileName());
        Assert.assertEquals("1", countString);
        Assert.assertTrue(o_testHelloAppRun1_literalMutationNumber65__17);
        Assert.assertFalse(o_testHelloAppRun1_literalMutationNumber65__18);
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
        Assert.assertEquals("myHelloApp.traces", ((MyStorage) (fileContent)).getFileName());
    }

    @Test(timeout = 10000)
    public void testHelloAppRun1_literalMutationNumber66_failAssert0() throws Exception {
        try {
            HelloApp myApp = null;
            File theFile = null;
            MyStorage fileContent = null;
            String countString;
            myApp = new HelloApp();
            myApp.run();
            theFile = new File(myApp.getMyTracesName());
            countString = Integer.toString(myApp.getMyPrintCount());
            theFile.exists();
            countString.equals(myApp.getMyTraces().getData(-1));
            fileContent = new MyStorage(myApp.getMyTracesName());
            fileContent.readData();
            fileContent.isEqual(myApp.getMyTraces());
            org.junit.Assert.fail("testHelloAppRun1_literalMutationNumber66 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("-1", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testHelloAppRun2() throws Exception {
        HelloApp myApp = null;
        Assert.assertNull(myApp);
        File theFile = null;
        MyStorage fileContent = null;
        Assert.assertNull(fileContent);
        int myCount = 8;
        String countString = Integer.toString(myCount);
        Assert.assertEquals("8", countString);
        String MyTracesName = "foo3.traces";
        Assert.assertEquals("foo3.traces", MyTracesName);
        myApp = new HelloApp(myCount, MyTracesName);
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(8, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals("foo3.traces", ((HelloApp) (myApp)).getMyTracesName());
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        myApp.run();
        theFile = new File(myApp.getMyTracesName());
        boolean o_testHelloAppRun2__17 = theFile.exists();
        Assert.assertTrue(o_testHelloAppRun2__17);
        boolean o_testHelloAppRun2__18 = countString.equals(myApp.getMyTraces().getData(0));
        Assert.assertTrue(o_testHelloAppRun2__18);
        fileContent = new MyStorage(myApp.getMyTracesName());
        Assert.assertEquals(0, ((int) (((MyStorage) (fileContent)).getDataSize())));
        Assert.assertEquals("foo3.traces", ((MyStorage) (fileContent)).getFileName());
        fileContent.readData();
        boolean o_testHelloAppRun2__25 = fileContent.isEqual(myApp.getMyTraces());
        Assert.assertTrue(o_testHelloAppRun2__25);
        boolean o_testHelloAppRun2__27 = countString.equals(fileContent.getData(0));
        Assert.assertTrue(o_testHelloAppRun2__27);
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(8, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals("foo3.traces", ((HelloApp) (myApp)).getMyTracesName());
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertEquals("foo3.traces", ((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getFileName());
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
        Assert.assertEquals("foo3.traces", ((MyStorage) (fileContent)).getFileName());
        Assert.assertEquals("8", countString);
        Assert.assertEquals("foo3.traces", MyTracesName);
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(8, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals("foo3.traces", ((HelloApp) (myApp)).getMyTracesName());
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertEquals("foo3.traces", ((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getFileName());
        Assert.assertTrue(o_testHelloAppRun2__17);
        Assert.assertTrue(o_testHelloAppRun2__18);
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
        Assert.assertEquals("foo3.traces", ((MyStorage) (fileContent)).getFileName());
        Assert.assertTrue(o_testHelloAppRun2__25);
    }

    @Test(timeout = 10000)
    public void testHelloAppRun2_literalMutationNumber80() throws Exception {
        HelloApp myApp = null;
        Assert.assertNull(myApp);
        File theFile = null;
        MyStorage fileContent = null;
        Assert.assertNull(fileContent);
        int myCount = 4;
        String countString = Integer.toString(myCount);
        Assert.assertEquals("4", countString);
        String MyTracesName = "foo3.traces";
        Assert.assertEquals("foo3.traces", MyTracesName);
        myApp = new HelloApp(myCount, MyTracesName);
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(4, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals("foo3.traces", ((HelloApp) (myApp)).getMyTracesName());
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        myApp.run();
        theFile = new File(myApp.getMyTracesName());
        boolean o_testHelloAppRun2_literalMutationNumber80__18 = theFile.exists();
        Assert.assertTrue(o_testHelloAppRun2_literalMutationNumber80__18);
        boolean o_testHelloAppRun2_literalMutationNumber80__19 = countString.equals(myApp.getMyTraces().getData(0));
        Assert.assertTrue(o_testHelloAppRun2_literalMutationNumber80__19);
        fileContent = new MyStorage(myApp.getMyTracesName());
        Assert.assertEquals(0, ((int) (((MyStorage) (fileContent)).getDataSize())));
        Assert.assertEquals("foo3.traces", ((MyStorage) (fileContent)).getFileName());
        fileContent.readData();
        boolean o_testHelloAppRun2_literalMutationNumber80__26 = fileContent.isEqual(myApp.getMyTraces());
        Assert.assertTrue(o_testHelloAppRun2_literalMutationNumber80__26);
        boolean o_testHelloAppRun2_literalMutationNumber80__28 = countString.equals(fileContent.getData(0));
        Assert.assertTrue(o_testHelloAppRun2_literalMutationNumber80__28);
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(4, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals("foo3.traces", ((HelloApp) (myApp)).getMyTracesName());
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertEquals("foo3.traces", ((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getFileName());
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
        Assert.assertEquals("foo3.traces", ((MyStorage) (fileContent)).getFileName());
        Assert.assertEquals("4", countString);
        Assert.assertEquals("foo3.traces", MyTracesName);
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(4, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals("foo3.traces", ((HelloApp) (myApp)).getMyTracesName());
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertEquals("foo3.traces", ((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getFileName());
        Assert.assertTrue(o_testHelloAppRun2_literalMutationNumber80__18);
        Assert.assertTrue(o_testHelloAppRun2_literalMutationNumber80__19);
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
        Assert.assertEquals("foo3.traces", ((MyStorage) (fileContent)).getFileName());
        Assert.assertTrue(o_testHelloAppRun2_literalMutationNumber80__26);
    }

    @Test(timeout = 10000)
    public void testHelloAppRun2_literalMutationNumber82() throws Exception {
        HelloApp myApp = null;
        Assert.assertNull(myApp);
        File theFile = null;
        MyStorage fileContent = null;
        Assert.assertNull(fileContent);
        int myCount = 0;
        String countString = Integer.toString(myCount);
        Assert.assertEquals("0", countString);
        String MyTracesName = "foo3.traces";
        Assert.assertEquals("foo3.traces", MyTracesName);
        myApp = new HelloApp(myCount, MyTracesName);
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(0, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals("foo3.traces", ((HelloApp) (myApp)).getMyTracesName());
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        myApp.run();
        theFile = new File(myApp.getMyTracesName());
        boolean o_testHelloAppRun2_literalMutationNumber82__18 = theFile.exists();
        Assert.assertTrue(o_testHelloAppRun2_literalMutationNumber82__18);
        boolean o_testHelloAppRun2_literalMutationNumber82__19 = countString.equals(myApp.getMyTraces().getData(0));
        Assert.assertTrue(o_testHelloAppRun2_literalMutationNumber82__19);
        fileContent = new MyStorage(myApp.getMyTracesName());
        Assert.assertEquals(0, ((int) (((MyStorage) (fileContent)).getDataSize())));
        Assert.assertEquals("foo3.traces", ((MyStorage) (fileContent)).getFileName());
        fileContent.readData();
        boolean o_testHelloAppRun2_literalMutationNumber82__26 = fileContent.isEqual(myApp.getMyTraces());
        Assert.assertTrue(o_testHelloAppRun2_literalMutationNumber82__26);
        boolean o_testHelloAppRun2_literalMutationNumber82__28 = countString.equals(fileContent.getData(0));
        Assert.assertTrue(o_testHelloAppRun2_literalMutationNumber82__28);
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(0, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals("foo3.traces", ((HelloApp) (myApp)).getMyTracesName());
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertEquals("foo3.traces", ((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getFileName());
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
        Assert.assertEquals("foo3.traces", ((MyStorage) (fileContent)).getFileName());
        Assert.assertEquals("0", countString);
        Assert.assertEquals("foo3.traces", MyTracesName);
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(0, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals("foo3.traces", ((HelloApp) (myApp)).getMyTracesName());
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertEquals("foo3.traces", ((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getFileName());
        Assert.assertTrue(o_testHelloAppRun2_literalMutationNumber82__18);
        Assert.assertTrue(o_testHelloAppRun2_literalMutationNumber82__19);
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
        Assert.assertEquals("foo3.traces", ((MyStorage) (fileContent)).getFileName());
        Assert.assertTrue(o_testHelloAppRun2_literalMutationNumber82__26);
    }

    @Test(timeout = 10000)
    public void testHelloAppRun2_literalMutationString85_failAssert1() throws Exception {
        try {
            HelloApp myApp = null;
            File theFile = null;
            MyStorage fileContent = null;
            int myCount = 8;
            String countString = Integer.toString(myCount);
            String MyTracesName = "";
            myApp = new HelloApp(myCount, MyTracesName);
            myApp.run();
            theFile = new File(myApp.getMyTracesName());
            theFile.exists();
            countString.equals(myApp.getMyTraces().getData(0));
            fileContent = new MyStorage(myApp.getMyTracesName());
            fileContent.readData();
            fileContent.isEqual(myApp.getMyTraces());
            countString.equals(fileContent.getData(0));
            org.junit.Assert.fail("testHelloAppRun2_literalMutationString85 should have thrown IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException expected) {
            Assert.assertEquals("Index: 0, Size: 0", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testHelloAppRun2_literalMutationNumber92_failAssert2() throws Exception {
        try {
            HelloApp myApp = null;
            File theFile = null;
            MyStorage fileContent = null;
            int myCount = 8;
            String countString = Integer.toString(myCount);
            String MyTracesName = "foo3.traces";
            myApp = new HelloApp(myCount, MyTracesName);
            myApp.run();
            theFile = new File(myApp.getMyTracesName());
            theFile.exists();
            countString.equals(myApp.getMyTraces().getData(-1));
            fileContent = new MyStorage(myApp.getMyTracesName());
            fileContent.readData();
            fileContent.isEqual(myApp.getMyTraces());
            countString.equals(fileContent.getData(0));
            org.junit.Assert.fail("testHelloAppRun2_literalMutationNumber92 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("-1", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testHelloAppRun2_literalMutationNumber96_failAssert3() throws Exception {
        try {
            HelloApp myApp = null;
            File theFile = null;
            MyStorage fileContent = null;
            int myCount = 8;
            String countString = Integer.toString(myCount);
            String MyTracesName = "foo3.traces";
            myApp = new HelloApp(myCount, MyTracesName);
            myApp.run();
            theFile = new File(myApp.getMyTracesName());
            theFile.exists();
            countString.equals(myApp.getMyTraces().getData(0));
            fileContent = new MyStorage(myApp.getMyTracesName());
            fileContent.readData();
            fileContent.isEqual(myApp.getMyTraces());
            countString.equals(fileContent.getData(-1));
            org.junit.Assert.fail("testHelloAppRun2_literalMutationNumber96 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("-1", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testHelloAppRun3_literalMutationNumber153() throws Exception {
        HelloApp myApp = null;
        Assert.assertNull(myApp);
        File theFile = null;
        MyStorage fileContent = null;
        Assert.assertNull(fileContent);
        int myCount = 0;
        String countString = Integer.toString(myCount);
        Assert.assertEquals("0", countString);
        String helloString = "---------------------- Hello World !";
        Assert.assertEquals("---------------------- Hello World !", helloString);
        String MyTracesName = "hello_run3.traces";
        Assert.assertEquals("hello_run3.traces", MyTracesName);
        myApp = new HelloApp(myCount, MyTracesName);
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(0, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals("hello_run3.traces", ((HelloApp) (myApp)).getMyTracesName());
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        myApp.run();
        fileContent = new MyStorage(myApp.getMyTracesName());
        Assert.assertEquals(0, ((int) (((MyStorage) (fileContent)).getDataSize())));
        Assert.assertEquals("hello_run3.traces", ((MyStorage) (fileContent)).getFileName());
        fileContent.readData();
        boolean o_testHelloAppRun3_literalMutationNumber153__20 = fileContent.isEqual(myApp.getMyTraces());
        Assert.assertTrue(o_testHelloAppRun3_literalMutationNumber153__20);
        boolean o_testHelloAppRun3_literalMutationNumber153__22 = countString.equals(fileContent.getData(0));
        Assert.assertTrue(o_testHelloAppRun3_literalMutationNumber153__22);
        boolean o_testHelloAppRun3_literalMutationNumber153__24 = helloString.equals(fileContent.getData(2));
        Assert.assertFalse(o_testHelloAppRun3_literalMutationNumber153__24);
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(0, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals("hello_run3.traces", ((HelloApp) (myApp)).getMyTracesName());
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertEquals("hello_run3.traces", ((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getFileName());
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
        Assert.assertEquals("hello_run3.traces", ((MyStorage) (fileContent)).getFileName());
        Assert.assertEquals("0", countString);
        Assert.assertEquals("---------------------- Hello World !", helloString);
        Assert.assertEquals("hello_run3.traces", MyTracesName);
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(0, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals("hello_run3.traces", ((HelloApp) (myApp)).getMyTracesName());
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertEquals("hello_run3.traces", ((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getFileName());
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
        Assert.assertEquals("hello_run3.traces", ((MyStorage) (fileContent)).getFileName());
        Assert.assertTrue(o_testHelloAppRun3_literalMutationNumber153__20);
        Assert.assertTrue(o_testHelloAppRun3_literalMutationNumber153__22);
    }

    @Test(timeout = 10000)
    public void testHelloAppRun3_literalMutationNumber154() throws Exception {
        HelloApp myApp = null;
        Assert.assertNull(myApp);
        File theFile = null;
        MyStorage fileContent = null;
        Assert.assertNull(fileContent);
        int myCount = 21;
        String countString = Integer.toString(myCount);
        Assert.assertEquals("21", countString);
        String helloString = "---------------------- Hello World !";
        Assert.assertEquals("---------------------- Hello World !", helloString);
        String MyTracesName = "hello_run3.traces";
        Assert.assertEquals("hello_run3.traces", MyTracesName);
        myApp = new HelloApp(myCount, MyTracesName);
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(21, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals("hello_run3.traces", ((HelloApp) (myApp)).getMyTracesName());
        Assert.assertNull(((HelloApp) (myApp)).getMyTraces());
        myApp.run();
        fileContent = new MyStorage(myApp.getMyTracesName());
        Assert.assertEquals(0, ((int) (((MyStorage) (fileContent)).getDataSize())));
        Assert.assertEquals("hello_run3.traces", ((MyStorage) (fileContent)).getFileName());
        fileContent.readData();
        boolean o_testHelloAppRun3_literalMutationNumber154__20 = fileContent.isEqual(myApp.getMyTraces());
        Assert.assertTrue(o_testHelloAppRun3_literalMutationNumber154__20);
        boolean o_testHelloAppRun3_literalMutationNumber154__22 = countString.equals(fileContent.getData(0));
        Assert.assertTrue(o_testHelloAppRun3_literalMutationNumber154__22);
        boolean o_testHelloAppRun3_literalMutationNumber154__24 = helloString.equals(fileContent.getData(2));
        Assert.assertFalse(o_testHelloAppRun3_literalMutationNumber154__24);
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(21, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals("hello_run3.traces", ((HelloApp) (myApp)).getMyTracesName());
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertEquals("hello_run3.traces", ((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getFileName());
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
        Assert.assertEquals("hello_run3.traces", ((MyStorage) (fileContent)).getFileName());
        Assert.assertEquals("21", countString);
        Assert.assertEquals("---------------------- Hello World !", helloString);
        Assert.assertEquals("hello_run3.traces", MyTracesName);
        Assert.assertTrue(((HelloApp) (myApp)).getShouldPrintOnStdout());
        Assert.assertEquals(21, ((int) (((HelloApp) (myApp)).getMyPrintCount())));
        Assert.assertEquals("hello_run3.traces", ((HelloApp) (myApp)).getMyTracesName());
        Assert.assertEquals(4, ((int) (((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getDataSize())));
        Assert.assertEquals("hello_run3.traces", ((MyStorage) (((HelloApp) (myApp)).getMyTraces())).getFileName());
        Assert.assertEquals(4, ((int) (((MyStorage) (fileContent)).getDataSize())));
        Assert.assertEquals("hello_run3.traces", ((MyStorage) (fileContent)).getFileName());
        Assert.assertTrue(o_testHelloAppRun3_literalMutationNumber154__20);
        Assert.assertTrue(o_testHelloAppRun3_literalMutationNumber154__22);
    }

    @Test(timeout = 10000)
    public void testHelloAppRun3_literalMutationString164_failAssert4() throws Exception {
        try {
            HelloApp myApp = null;
            File theFile = null;
            MyStorage fileContent = null;
            int myCount = 22;
            String countString = Integer.toString(myCount);
            String helloString = "---------------------- Hello World !";
            String MyTracesName = "";
            myApp = new HelloApp(myCount, MyTracesName);
            myApp.run();
            fileContent = new MyStorage(myApp.getMyTracesName());
            fileContent.readData();
            fileContent.isEqual(myApp.getMyTraces());
            countString.equals(fileContent.getData(0));
            helloString.equals(fileContent.getData(2));
            org.junit.Assert.fail("testHelloAppRun3_literalMutationString164 should have thrown IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException expected) {
            Assert.assertEquals("Index: 0, Size: 0", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testHelloAppRun3_literalMutationString167_failAssert5() throws Exception {
        try {
            HelloApp myApp = null;
            File theFile = null;
            MyStorage fileContent = null;
            int myCount = 22;
            String countString = Integer.toString(myCount);
            String helloString = "---------------------- Hello World !";
            String MyTracesName = "`_8;0L`A=SO/woO!O";
            myApp = new HelloApp(myCount, MyTracesName);
            myApp.run();
            fileContent = new MyStorage(myApp.getMyTracesName());
            fileContent.readData();
            fileContent.isEqual(myApp.getMyTraces());
            countString.equals(fileContent.getData(0));
            helloString.equals(fileContent.getData(2));
            org.junit.Assert.fail("testHelloAppRun3_literalMutationString167 should have thrown IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException expected) {
            Assert.assertEquals("Index: 0, Size: 0", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testHelloAppRun3_literalMutationNumber171_failAssert6() throws Exception {
        try {
            HelloApp myApp = null;
            File theFile = null;
            MyStorage fileContent = null;
            int myCount = 22;
            String countString = Integer.toString(myCount);
            String helloString = "---------------------- Hello World !";
            String MyTracesName = "hello_run3.traces";
            myApp = new HelloApp(myCount, MyTracesName);
            myApp.run();
            fileContent = new MyStorage(myApp.getMyTracesName());
            fileContent.readData();
            fileContent.isEqual(myApp.getMyTraces());
            countString.equals(fileContent.getData(-1));
            helloString.equals(fileContent.getData(2));
            org.junit.Assert.fail("testHelloAppRun3_literalMutationNumber171 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("-1", expected.getMessage());
        }
    }
}

