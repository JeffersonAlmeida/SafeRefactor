
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test1");


    java.util.TreeSet var0 = new java.util.TreeSet();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var1 = var0.last();
      fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }

  }

  public void test2() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test2");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var2 = java.util.Collections.nCopies((-1), (java.lang.Object)1.0f);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test3() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test3");


    java.util.TreeSet var0 = new java.util.TreeSet();
    var0.clear();
    java.util.TreeSet var2 = new java.util.TreeSet();
    boolean var3 = var0.addAll((java.util.Collection)var2);
    java.util.Enumeration var4 = java.util.Collections.enumeration((java.util.Collection)var0);
    java.util.Iterator var5 = var0.descendingIterator();
    java.util.List var6 = java.util.Collections.singletonList((java.lang.Object)var5);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Collections.<java.lang.Comparable>sort(var6);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test4() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test4");


    java.util.Set var0 = java.util.Collections.emptySet();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test5() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test5");


    java.util.TreeSet var0 = new java.util.TreeSet();
    var0.clear();
    java.util.TreeSet var2 = new java.util.TreeSet();
    var2.clear();
    java.util.TreeSet var4 = new java.util.TreeSet();
    boolean var5 = var2.addAll((java.util.Collection)var4);
    java.lang.Object var6 = var2.pollLast();
    java.util.TreeSet var7 = new java.util.TreeSet();
    java.lang.Object var8 = var2.floor((java.lang.Object)var7);
    boolean var9 = var0.containsAll((java.util.Collection)var7);
    boolean var11 = var7.add((java.lang.Object)10.0d);
    java.util.TreeSet var12 = new java.util.TreeSet();
    var12.clear();
    java.util.TreeSet var14 = new java.util.TreeSet();
    boolean var15 = var12.addAll((java.util.Collection)var14);
    java.util.Enumeration var16 = java.util.Collections.enumeration((java.util.Collection)var12);
    java.util.Iterator var17 = var12.descendingIterator();
    java.util.List var18 = java.util.Collections.singletonList((java.lang.Object)var17);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.NavigableSet var20 = var7.tailSet((java.lang.Object)var17, true);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);

  }

  public void test6() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test6");


    java.util.TreeSet var0 = new java.util.TreeSet();
    var0.clear();
    java.util.TreeSet var2 = new java.util.TreeSet();
    boolean var3 = var0.addAll((java.util.Collection)var2);
    java.util.Enumeration var4 = java.util.Collections.enumeration((java.util.Collection)var0);
    java.util.Iterator var5 = var0.descendingIterator();
    java.util.List var6 = java.util.Collections.singletonList((java.lang.Object)var5);
    java.util.List var7 = java.util.Collections.unmodifiableList(var6);
    java.util.List var8 = java.util.Collections.unmodifiableList(var6);
    java.util.TreeSet var9 = new java.util.TreeSet();
    var9.clear();
    java.util.TreeSet var11 = new java.util.TreeSet();
    boolean var12 = var9.addAll((java.util.Collection)var11);
    java.util.Enumeration var13 = java.util.Collections.enumeration((java.util.Collection)var9);
    java.util.TreeSet var14 = new java.util.TreeSet((java.util.Collection)var9);
    java.lang.Object var16 = var9.floor((java.lang.Object)false);
    java.lang.Object var18 = var9.floor((java.lang.Object)(short)(-1));
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var19 = java.util.Collections.binarySearch(var6, (java.lang.Object)var9);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);

  }

  public void test7() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test7");


    java.util.TreeSet var0 = new java.util.TreeSet();
    var0.clear();
    java.util.TreeSet var2 = new java.util.TreeSet();
    var2.clear();
    java.util.TreeSet var4 = new java.util.TreeSet();
    boolean var5 = var2.addAll((java.util.Collection)var4);
    java.lang.Object var6 = var2.pollLast();
    java.util.TreeSet var7 = new java.util.TreeSet();
    java.lang.Object var8 = var2.floor((java.lang.Object)var7);
    boolean var9 = var0.containsAll((java.util.Collection)var7);
    boolean var11 = var7.add((java.lang.Object)10.0d);
    java.util.Set var12 = java.util.Collections.synchronizedSet((java.util.Set)var7);
    java.lang.Object var13 = java.util.Collections.max((java.util.Collection)var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + 10.0d+ "'", var13.equals(10.0d));

  }

  public void test8() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test8");


    java.util.TreeSet var0 = new java.util.TreeSet();
    var0.clear();
    java.util.TreeSet var2 = new java.util.TreeSet();
    boolean var3 = var0.addAll((java.util.Collection)var2);
    java.util.Enumeration var4 = java.util.Collections.enumeration((java.util.Collection)var0);
    java.util.Iterator var5 = var0.descendingIterator();
    java.util.List var6 = java.util.Collections.singletonList((java.lang.Object)var5);
    java.util.List var7 = java.util.Collections.unmodifiableList(var6);
    java.util.List var8 = java.util.Collections.unmodifiableList(var6);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Collections.swap(var6, 100, (-1));
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test9() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test9");


    java.util.TreeSet var0 = new java.util.TreeSet();
    var0.clear();
    java.util.TreeSet var2 = new java.util.TreeSet();
    var2.clear();
    java.util.TreeSet var4 = new java.util.TreeSet();
    boolean var5 = var2.addAll((java.util.Collection)var4);
    java.lang.Object var6 = var2.pollLast();
    java.util.TreeSet var7 = new java.util.TreeSet();
    java.lang.Object var8 = var2.floor((java.lang.Object)var7);
    boolean var9 = var0.containsAll((java.util.Collection)var7);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var10 = java.util.Collections.min((java.util.Collection)var0);
      fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);

  }

  public void test10() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test10");


    java.util.TreeSet var0 = new java.util.TreeSet();
    var0.clear();
    java.util.TreeSet var2 = new java.util.TreeSet();
    boolean var3 = var0.addAll((java.util.Collection)var2);
    java.util.TreeSet var4 = new java.util.TreeSet();
    var4.clear();
    java.util.TreeSet var6 = new java.util.TreeSet();
    var6.clear();
    java.util.TreeSet var8 = new java.util.TreeSet();
    boolean var9 = var6.addAll((java.util.Collection)var8);
    java.lang.Object var10 = var6.pollLast();
    java.util.TreeSet var11 = new java.util.TreeSet();
    java.lang.Object var12 = var6.floor((java.lang.Object)var11);
    boolean var13 = var4.containsAll((java.util.Collection)var11);
    java.util.TreeSet var14 = new java.util.TreeSet();
    var14.clear();
    java.util.TreeSet var16 = new java.util.TreeSet();
    var16.clear();
    java.util.TreeSet var18 = new java.util.TreeSet();
    boolean var19 = var16.addAll((java.util.Collection)var18);
    java.lang.Object var20 = var16.pollLast();
    java.util.TreeSet var21 = new java.util.TreeSet();
    java.lang.Object var22 = var16.floor((java.lang.Object)var21);
    boolean var23 = var14.containsAll((java.util.Collection)var21);
    java.lang.Object[] var24 = new java.lang.Object[] { var23};
    java.lang.Object[] var25 = var11.toArray(var24);
    boolean var26 = java.util.Collections.addAll((java.util.Collection)var0, var25);

  }

  public void test11() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test11");


    java.util.TreeSet var0 = new java.util.TreeSet();
    var0.clear();
    java.util.TreeSet var2 = new java.util.TreeSet();
    boolean var3 = var0.addAll((java.util.Collection)var2);
    java.util.Enumeration var4 = java.util.Collections.enumeration((java.util.Collection)var0);
    java.util.Iterator var5 = var0.descendingIterator();
    java.util.List var6 = java.util.Collections.singletonList((java.lang.Object)var5);
    java.util.List var7 = java.util.Collections.unmodifiableList(var6);
    java.util.List var8 = java.util.Collections.unmodifiableList(var6);
    java.util.TreeSet var9 = new java.util.TreeSet();
    var9.clear();
    java.util.TreeSet var11 = new java.util.TreeSet();
    boolean var12 = var9.addAll((java.util.Collection)var11);
    java.util.Enumeration var13 = java.util.Collections.enumeration((java.util.Collection)var9);
    java.util.Iterator var14 = var9.descendingIterator();
    java.util.List var15 = java.util.Collections.singletonList((java.lang.Object)var14);
    java.util.TreeSet var16 = new java.util.TreeSet();
    var16.clear();
    java.util.TreeSet var18 = new java.util.TreeSet();
    boolean var19 = var16.addAll((java.util.Collection)var18);
    java.util.Enumeration var20 = java.util.Collections.enumeration((java.util.Collection)var16);
    java.util.ArrayList var21 = java.util.Collections.list(var20);
    java.util.Collections.copy(var15, (java.util.List)var21);
    java.util.TreeSet var24 = new java.util.TreeSet();
    var24.clear();
    java.util.TreeSet var26 = new java.util.TreeSet();
    boolean var27 = var24.addAll((java.util.Collection)var26);
    java.lang.Object var28 = var26.pollFirst();
    boolean var29 = java.util.Collections.replaceAll(var15, (java.lang.Object)1L, (java.lang.Object)var26);
    java.util.TreeSet var30 = new java.util.TreeSet();
    var30.clear();
    java.util.TreeSet var32 = new java.util.TreeSet();
    var32.clear();
    java.util.TreeSet var34 = new java.util.TreeSet();
    boolean var35 = var32.addAll((java.util.Collection)var34);
    java.lang.Object var36 = var32.pollLast();
    java.util.TreeSet var37 = new java.util.TreeSet();
    java.lang.Object var38 = var32.floor((java.lang.Object)var37);
    boolean var39 = var30.containsAll((java.util.Collection)var37);
    boolean var41 = var37.add((java.lang.Object)10.0d);
    java.util.Set var42 = java.util.Collections.synchronizedSet((java.util.Set)var37);
    boolean var43 = var26.containsAll((java.util.Collection)var42);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Collections.fill(var8, (java.lang.Object)var43);
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == false);

  }

  public void test12() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test12");


    java.util.TreeSet var0 = new java.util.TreeSet();
    var0.clear();
    java.util.TreeSet var2 = new java.util.TreeSet();
    boolean var3 = var0.addAll((java.util.Collection)var2);
    java.util.Enumeration var4 = java.util.Collections.enumeration((java.util.Collection)var0);
    java.util.TreeSet var5 = new java.util.TreeSet((java.util.Collection)var0);
    java.lang.Object var7 = var0.floor((java.lang.Object)false);
    java.util.TreeSet var8 = new java.util.TreeSet();
    var8.clear();
    java.util.TreeSet var10 = new java.util.TreeSet();
    boolean var11 = var8.addAll((java.util.Collection)var10);
    java.util.Enumeration var12 = java.util.Collections.enumeration((java.util.Collection)var8);
    java.util.NavigableSet var13 = var8.descendingSet();
    boolean var14 = var0.addAll((java.util.Collection)var13);
    java.util.Comparator var15 = java.util.Collections.reverseOrder();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var16 = java.util.Collections.min((java.util.Collection)var0, var15);
      fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test13() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test13");


    java.util.TreeSet var0 = new java.util.TreeSet();
    var0.clear();
    java.util.TreeSet var2 = new java.util.TreeSet();
    boolean var3 = var0.addAll((java.util.Collection)var2);
    java.util.Enumeration var4 = java.util.Collections.enumeration((java.util.Collection)var0);
    java.util.NavigableSet var5 = var0.descendingSet();
    java.util.TreeSet var6 = new java.util.TreeSet();
    var6.clear();
    java.util.TreeSet var8 = new java.util.TreeSet();
    var8.clear();
    java.util.TreeSet var10 = new java.util.TreeSet();
    boolean var11 = var8.addAll((java.util.Collection)var10);
    java.lang.Object var12 = var8.pollLast();
    java.util.TreeSet var13 = new java.util.TreeSet();
    java.lang.Object var14 = var8.floor((java.lang.Object)var13);
    boolean var15 = var6.containsAll((java.util.Collection)var13);
    java.util.TreeSet var16 = new java.util.TreeSet();
    var16.clear();
    java.util.TreeSet var18 = new java.util.TreeSet();
    var18.clear();
    java.util.TreeSet var20 = new java.util.TreeSet();
    boolean var21 = var18.addAll((java.util.Collection)var20);
    java.lang.Object var22 = var18.pollLast();
    java.util.TreeSet var23 = new java.util.TreeSet();
    java.lang.Object var24 = var18.floor((java.lang.Object)var23);
    boolean var25 = var16.containsAll((java.util.Collection)var23);
    java.lang.Object[] var26 = new java.lang.Object[] { var25};
    java.lang.Object[] var27 = var13.toArray(var26);
    boolean var28 = java.util.Collections.addAll((java.util.Collection)var5, var26);

  }

  public void test14() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test14");


    java.util.TreeSet var0 = new java.util.TreeSet();
    var0.clear();
    java.util.TreeSet var2 = new java.util.TreeSet();
    boolean var3 = var0.addAll((java.util.Collection)var2);
    java.lang.Object var4 = var2.pollFirst();
    java.util.TreeSet var5 = new java.util.TreeSet();
    var5.clear();
    java.util.TreeSet var7 = new java.util.TreeSet();
    boolean var8 = var5.addAll((java.util.Collection)var7);
    java.util.Map var9 = java.util.Collections.singletonMap((java.lang.Object)var2, (java.lang.Object)var5);
    java.util.Iterator var10 = var2.iterator();
    java.lang.Object var11 = var2.pollFirst();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var12 = java.util.Collections.min((java.util.Collection)var2);
      fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);

  }

  public void test15() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test15");


    java.util.TreeSet var0 = new java.util.TreeSet();
    var0.clear();
    java.util.TreeSet var2 = new java.util.TreeSet();
    boolean var3 = var0.addAll((java.util.Collection)var2);
    java.lang.Object var4 = var2.pollFirst();
    boolean var6 = var2.remove((java.lang.Object)'#');
    java.util.TreeSet var7 = new java.util.TreeSet();
    var7.clear();
    java.util.TreeSet var9 = new java.util.TreeSet();
    boolean var10 = var7.addAll((java.util.Collection)var9);
    java.util.Enumeration var11 = java.util.Collections.enumeration((java.util.Collection)var7);
    java.util.Iterator var12 = var7.descendingIterator();
    java.lang.Object var13 = var2.higher((java.lang.Object)var12);
    java.util.TreeSet var14 = new java.util.TreeSet();
    var14.clear();
    java.util.TreeSet var16 = new java.util.TreeSet();
    boolean var17 = var14.addAll((java.util.Collection)var16);
    java.util.Enumeration var18 = java.util.Collections.enumeration((java.util.Collection)var14);
    java.util.TreeSet var19 = new java.util.TreeSet((java.util.Collection)var14);
    java.lang.Object var21 = var14.floor((java.lang.Object)false);
    java.util.TreeSet var22 = new java.util.TreeSet();
    var22.clear();
    java.util.TreeSet var24 = new java.util.TreeSet();
    boolean var25 = var22.addAll((java.util.Collection)var24);
    java.util.Enumeration var26 = java.util.Collections.enumeration((java.util.Collection)var22);
    java.util.NavigableSet var27 = var22.descendingSet();
    boolean var28 = var14.addAll((java.util.Collection)var27);
    java.lang.Object var29 = var2.floor((java.lang.Object)var28);
    java.lang.Object var30 = var2.clone();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var31 = java.util.Collections.min((java.util.Collection)var2);
      fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);

  }

  public void test16() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test16");


    java.util.TreeSet var0 = new java.util.TreeSet();
    var0.clear();
    java.util.TreeSet var2 = new java.util.TreeSet();
    boolean var3 = var0.addAll((java.util.Collection)var2);
    java.lang.Object var4 = var0.pollLast();
    java.util.NavigableSet var5 = var0.descendingSet();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test17() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test17");


    java.util.TreeSet var0 = new java.util.TreeSet();
    var0.clear();
    java.util.TreeSet var2 = new java.util.TreeSet();
    boolean var3 = var0.addAll((java.util.Collection)var2);
    java.util.Enumeration var4 = java.util.Collections.enumeration((java.util.Collection)var0);
    java.util.Iterator var5 = var0.descendingIterator();
    java.util.List var6 = java.util.Collections.singletonList((java.lang.Object)var5);
    java.util.TreeSet var7 = new java.util.TreeSet();
    var7.clear();
    java.util.TreeSet var9 = new java.util.TreeSet();
    boolean var10 = var7.addAll((java.util.Collection)var9);
    java.util.Enumeration var11 = java.util.Collections.enumeration((java.util.Collection)var7);
    java.util.ArrayList var12 = java.util.Collections.list(var11);
    java.util.Collections.copy(var6, (java.util.List)var12);
    java.util.TreeSet var15 = new java.util.TreeSet();
    var15.clear();
    java.util.TreeSet var17 = new java.util.TreeSet();
    boolean var18 = var15.addAll((java.util.Collection)var17);
    java.lang.Object var19 = var17.pollFirst();
    boolean var20 = java.util.Collections.replaceAll(var6, (java.lang.Object)1L, (java.lang.Object)var17);
    java.util.List var21 = java.util.Collections.singletonList((java.lang.Object)var20);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Collections.<java.lang.Comparable>sort(var21);
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);

  }

  public void test18() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test18");


    java.util.TreeSet var0 = new java.util.TreeSet();
    var0.clear();
    java.util.TreeSet var2 = new java.util.TreeSet();
    boolean var3 = var0.addAll((java.util.Collection)var2);
    java.util.Enumeration var4 = java.util.Collections.enumeration((java.util.Collection)var0);
    java.util.ArrayList var5 = java.util.Collections.list(var4);
    java.util.ArrayList var6 = java.util.Collections.list(var4);
    java.util.Collection var7 = java.util.Collections.unmodifiableCollection((java.util.Collection)var6);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var8 = java.util.Collections.max(var7);
      fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test19() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test19");


    java.util.TreeSet var0 = new java.util.TreeSet();
    var0.clear();
    java.util.TreeSet var2 = new java.util.TreeSet();
    boolean var3 = var0.addAll((java.util.Collection)var2);
    java.lang.Object var4 = var2.pollFirst();
    boolean var6 = var2.remove((java.lang.Object)'#');
    java.util.TreeSet var7 = new java.util.TreeSet();
    var7.clear();
    java.util.TreeSet var9 = new java.util.TreeSet();
    boolean var10 = var7.addAll((java.util.Collection)var9);
    java.util.Enumeration var11 = java.util.Collections.enumeration((java.util.Collection)var7);
    java.util.Iterator var12 = var7.descendingIterator();
    java.lang.Object var13 = var2.higher((java.lang.Object)var12);
    java.lang.Object var15 = var2.lower((java.lang.Object)(short)(-1));
    java.util.TreeSet var16 = new java.util.TreeSet();
    var16.clear();
    java.util.TreeSet var18 = new java.util.TreeSet();
    boolean var19 = var16.addAll((java.util.Collection)var18);
    java.lang.Object var20 = var18.pollFirst();
    boolean var22 = var18.remove((java.lang.Object)'#');
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.SortedSet var23 = var2.headSet((java.lang.Object)var18);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);

  }

  public void test20() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test20");


    java.util.TreeSet var0 = new java.util.TreeSet();
    var0.clear();
    java.util.TreeSet var2 = new java.util.TreeSet();
    boolean var3 = var0.addAll((java.util.Collection)var2);
    java.util.Enumeration var4 = java.util.Collections.enumeration((java.util.Collection)var0);
    java.util.Iterator var5 = var0.descendingIterator();
    java.util.List var6 = java.util.Collections.singletonList((java.lang.Object)var5);
    java.util.TreeSet var7 = new java.util.TreeSet();
    var7.clear();
    java.util.TreeSet var9 = new java.util.TreeSet();
    boolean var10 = var7.addAll((java.util.Collection)var9);
    java.util.Enumeration var11 = java.util.Collections.enumeration((java.util.Collection)var7);
    java.util.ArrayList var12 = java.util.Collections.list(var11);
    java.util.Collections.copy(var6, (java.util.List)var12);
    java.util.TreeSet var15 = new java.util.TreeSet();
    var15.clear();
    java.util.TreeSet var17 = new java.util.TreeSet();
    boolean var18 = var15.addAll((java.util.Collection)var17);
    java.lang.Object var19 = var17.pollFirst();
    boolean var20 = java.util.Collections.replaceAll(var6, (java.lang.Object)1L, (java.lang.Object)var17);
    java.util.TreeSet var21 = new java.util.TreeSet();
    var21.clear();
    java.util.TreeSet var23 = new java.util.TreeSet();
    var23.clear();
    java.util.TreeSet var25 = new java.util.TreeSet();
    boolean var26 = var23.addAll((java.util.Collection)var25);
    java.lang.Object var27 = var23.pollLast();
    java.util.TreeSet var28 = new java.util.TreeSet();
    java.lang.Object var29 = var23.floor((java.lang.Object)var28);
    boolean var30 = var21.containsAll((java.util.Collection)var28);
    boolean var32 = var28.add((java.lang.Object)10.0d);
    java.util.Set var33 = java.util.Collections.synchronizedSet((java.util.Set)var28);
    boolean var34 = var17.containsAll((java.util.Collection)var33);
    java.util.Enumeration var35 = java.util.Collections.enumeration((java.util.Collection)var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);

  }

  public void test21() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test21");


    java.util.TreeSet var0 = new java.util.TreeSet();
    java.util.TreeSet var1 = new java.util.TreeSet();
    var1.clear();
    java.util.TreeSet var3 = new java.util.TreeSet();
    boolean var4 = var1.addAll((java.util.Collection)var3);
    java.util.Enumeration var5 = java.util.Collections.enumeration((java.util.Collection)var1);
    java.util.TreeSet var6 = new java.util.TreeSet((java.util.Collection)var1);
    java.lang.Object var8 = var1.floor((java.lang.Object)false);
    java.util.TreeSet var9 = new java.util.TreeSet();
    var9.clear();
    java.util.TreeSet var11 = new java.util.TreeSet();
    boolean var12 = var9.addAll((java.util.Collection)var11);
    java.util.Enumeration var13 = java.util.Collections.enumeration((java.util.Collection)var9);
    java.util.NavigableSet var14 = var9.descendingSet();
    boolean var15 = var1.addAll((java.util.Collection)var14);
    java.util.Map var16 = java.util.Collections.singletonMap((java.lang.Object)var0, (java.lang.Object)var1);
    java.util.SortedSet var17 = java.util.Collections.unmodifiableSortedSet((java.util.SortedSet)var0);
    java.util.TreeSet var18 = new java.util.TreeSet();
    var18.clear();
    java.util.TreeSet var20 = new java.util.TreeSet();
    boolean var21 = var18.addAll((java.util.Collection)var20);
    java.util.Enumeration var22 = java.util.Collections.enumeration((java.util.Collection)var18);
    java.util.ArrayList var23 = java.util.Collections.list(var22);
    java.util.ArrayList var24 = java.util.Collections.list(var22);
    java.util.Map var25 = java.util.Collections.singletonMap((java.lang.Object)var0, (java.lang.Object)var24);
    int var27 = java.util.Collections.frequency((java.util.Collection)var0, (java.lang.Object)10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 0);

  }

  public void test22() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test22");


    java.util.TreeSet var0 = new java.util.TreeSet();
    var0.clear();
    java.util.TreeSet var2 = new java.util.TreeSet();
    boolean var3 = var0.addAll((java.util.Collection)var2);
    java.util.Enumeration var4 = java.util.Collections.enumeration((java.util.Collection)var0);
    java.util.Iterator var5 = var0.descendingIterator();
    java.util.List var6 = java.util.Collections.singletonList((java.lang.Object)var5);
    java.util.List var7 = java.util.Collections.unmodifiableList(var6);
    java.util.List var8 = java.util.Collections.unmodifiableList(var6);
    java.util.TreeSet var9 = new java.util.TreeSet();
    var9.clear();
    java.util.TreeSet var11 = new java.util.TreeSet();
    boolean var12 = var9.addAll((java.util.Collection)var11);
    java.util.Enumeration var13 = java.util.Collections.enumeration((java.util.Collection)var9);
    java.util.TreeSet var14 = new java.util.TreeSet((java.util.Collection)var9);
    java.util.Iterator var15 = var14.descendingIterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var16 = java.util.Collections.binarySearch(var6, (java.lang.Object)var15);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test23() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test23");


    java.util.TreeSet var1 = new java.util.TreeSet();
    var1.clear();
    java.util.TreeSet var3 = new java.util.TreeSet();
    boolean var4 = var1.addAll((java.util.Collection)var3);
    java.lang.Object var5 = var3.pollFirst();
    java.util.TreeSet var6 = new java.util.TreeSet();
    var6.clear();
    java.util.TreeSet var8 = new java.util.TreeSet();
    boolean var9 = var6.addAll((java.util.Collection)var8);
    java.util.Map var10 = java.util.Collections.singletonMap((java.lang.Object)var3, (java.lang.Object)var6);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var11 = java.util.Collections.nCopies((-1), (java.lang.Object)var3);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test24() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test24");


    java.util.TreeSet var0 = new java.util.TreeSet();
    var0.clear();
    java.util.TreeSet var2 = new java.util.TreeSet();
    boolean var3 = var0.addAll((java.util.Collection)var2);
    java.util.Enumeration var4 = java.util.Collections.enumeration((java.util.Collection)var0);
    java.util.ArrayList var5 = java.util.Collections.list(var4);
    java.util.ArrayList var6 = java.util.Collections.list(var4);
    java.util.Collection var7 = java.util.Collections.unmodifiableCollection((java.util.Collection)var6);
    java.util.Comparator var8 = java.util.Collections.reverseOrder();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var9 = java.util.Collections.min(var7, var8);
      fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test25() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test25");


    java.util.TreeSet var0 = new java.util.TreeSet();
    var0.clear();
    java.util.TreeSet var2 = new java.util.TreeSet();
    boolean var3 = var0.addAll((java.util.Collection)var2);
    java.util.Enumeration var4 = java.util.Collections.enumeration((java.util.Collection)var0);
    java.util.ArrayList var5 = java.util.Collections.list(var4);
    java.util.ArrayList var6 = java.util.Collections.list(var4);
    java.util.ArrayList var7 = java.util.Collections.list(var4);
    java.util.TreeSet var8 = new java.util.TreeSet();
    var8.clear();
    java.util.TreeSet var10 = new java.util.TreeSet();
    var10.clear();
    java.util.TreeSet var12 = new java.util.TreeSet();
    boolean var13 = var10.addAll((java.util.Collection)var12);
    java.lang.Object var14 = var10.pollLast();
    java.util.TreeSet var15 = new java.util.TreeSet();
    java.lang.Object var16 = var10.floor((java.lang.Object)var15);
    boolean var17 = var8.containsAll((java.util.Collection)var15);
    java.util.TreeSet var18 = new java.util.TreeSet();
    var18.clear();
    java.util.TreeSet var20 = new java.util.TreeSet();
    var20.clear();
    java.util.TreeSet var22 = new java.util.TreeSet();
    boolean var23 = var20.addAll((java.util.Collection)var22);
    java.lang.Object var24 = var20.pollLast();
    java.util.TreeSet var25 = new java.util.TreeSet();
    java.lang.Object var26 = var20.floor((java.lang.Object)var25);
    boolean var27 = var18.containsAll((java.util.Collection)var25);
    java.lang.Object[] var28 = new java.lang.Object[] { var27};
    java.lang.Object[] var29 = var15.toArray(var28);
    java.lang.Object[] var30 = var7.toArray(var28);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Collections.swap((java.util.List)var7, 10, 10);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);

  }

  public void test26() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test26");


    java.util.TreeSet var0 = new java.util.TreeSet();
    var0.clear();
    java.util.TreeSet var2 = new java.util.TreeSet();
    boolean var3 = var0.addAll((java.util.Collection)var2);
    java.util.Enumeration var4 = java.util.Collections.enumeration((java.util.Collection)var0);
    java.util.TreeSet var5 = new java.util.TreeSet((java.util.Collection)var0);
    java.util.Set var6 = java.util.Collections.unmodifiableSet((java.util.Set)var5);
    java.util.TreeSet var7 = new java.util.TreeSet();
    var7.clear();
    java.util.TreeSet var9 = new java.util.TreeSet();
    boolean var10 = var7.addAll((java.util.Collection)var9);
    java.lang.Object var11 = var7.pollLast();
    java.util.TreeSet var12 = new java.util.TreeSet();
    java.lang.Object var13 = var7.floor((java.lang.Object)var12);
    java.lang.Object var15 = var12.floor((java.lang.Object)(byte)1);
    java.util.TreeSet var16 = new java.util.TreeSet();
    var16.clear();
    java.util.TreeSet var18 = new java.util.TreeSet();
    boolean var19 = var16.addAll((java.util.Collection)var18);
    boolean var20 = var12.removeAll((java.util.Collection)var16);
    boolean var21 = var5.addAll((java.util.Collection)var12);
    java.util.TreeSet var22 = new java.util.TreeSet();
    var22.clear();
    java.util.TreeSet var24 = new java.util.TreeSet();
    var24.clear();
    java.util.TreeSet var26 = new java.util.TreeSet();
    boolean var27 = var24.addAll((java.util.Collection)var26);
    java.lang.Object var28 = var24.pollLast();
    java.util.TreeSet var29 = new java.util.TreeSet();
    java.lang.Object var30 = var24.floor((java.lang.Object)var29);
    boolean var31 = var22.containsAll((java.util.Collection)var29);
    java.util.TreeSet var32 = new java.util.TreeSet();
    var32.clear();
    java.util.TreeSet var34 = new java.util.TreeSet();
    var34.clear();
    java.util.TreeSet var36 = new java.util.TreeSet();
    boolean var37 = var34.addAll((java.util.Collection)var36);
    java.lang.Object var38 = var34.pollLast();
    java.util.TreeSet var39 = new java.util.TreeSet();
    java.lang.Object var40 = var34.floor((java.lang.Object)var39);
    boolean var41 = var32.containsAll((java.util.Collection)var39);
    java.lang.Object[] var42 = new java.lang.Object[] { var41};
    java.lang.Object[] var43 = var29.toArray(var42);
    var29.clear();
    java.util.TreeSet var45 = new java.util.TreeSet();
    var45.clear();
    java.util.TreeSet var47 = new java.util.TreeSet();
    var47.clear();
    java.util.TreeSet var49 = new java.util.TreeSet();
    boolean var50 = var47.addAll((java.util.Collection)var49);
    java.lang.Object var51 = var47.pollLast();
    java.util.TreeSet var52 = new java.util.TreeSet();
    java.lang.Object var53 = var47.floor((java.lang.Object)var52);
    boolean var54 = var45.containsAll((java.util.Collection)var52);
    boolean var56 = var52.add((java.lang.Object)10.0d);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.SortedSet var57 = var5.subSet((java.lang.Object)var29, (java.lang.Object)var56);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == true);

  }

  public void test27() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test27");


    java.util.TreeSet var0 = new java.util.TreeSet();
    var0.clear();
    java.util.TreeSet var2 = new java.util.TreeSet();
    boolean var3 = var0.addAll((java.util.Collection)var2);
    java.util.Enumeration var4 = java.util.Collections.enumeration((java.util.Collection)var0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var5 = var0.first();
      fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test28() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test28");


    java.util.TreeSet var0 = new java.util.TreeSet();
    var0.clear();
    java.util.TreeSet var2 = new java.util.TreeSet();
    boolean var3 = var0.addAll((java.util.Collection)var2);
    java.util.Enumeration var4 = java.util.Collections.enumeration((java.util.Collection)var0);
    java.util.TreeSet var5 = new java.util.TreeSet((java.util.Collection)var0);
    java.util.Set var6 = java.util.Collections.unmodifiableSet((java.util.Set)var5);
    java.util.TreeSet var7 = new java.util.TreeSet();
    var7.clear();
    java.util.TreeSet var9 = new java.util.TreeSet();
    boolean var10 = var7.addAll((java.util.Collection)var9);
    java.lang.Object var11 = var7.pollLast();
    java.util.TreeSet var12 = new java.util.TreeSet();
    java.lang.Object var13 = var7.floor((java.lang.Object)var12);
    java.lang.Object var15 = var12.floor((java.lang.Object)(byte)1);
    java.util.Map var16 = java.util.Collections.singletonMap((java.lang.Object)var6, (java.lang.Object)(byte)1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Set var17 = java.util.Collections.newSetFromMap(var16);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test29() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test29");


    java.util.TreeSet var0 = new java.util.TreeSet();
    var0.clear();
    java.util.TreeSet var2 = new java.util.TreeSet();
    boolean var3 = var0.addAll((java.util.Collection)var2);
    java.util.Enumeration var4 = java.util.Collections.enumeration((java.util.Collection)var0);
    java.util.ArrayList var5 = java.util.Collections.list(var4);
    java.util.ArrayList var6 = java.util.Collections.list(var4);
    java.util.Collection var7 = java.util.Collections.unmodifiableCollection((java.util.Collection)var6);
    java.util.Comparator var8 = java.util.Collections.reverseOrder();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var9 = java.util.Collections.max((java.util.Collection)var6, var8);
      fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test30() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test30");


    java.util.TreeSet var0 = new java.util.TreeSet();
    java.util.NavigableSet var1 = var0.descendingSet();
    java.util.TreeSet var2 = new java.util.TreeSet((java.util.Collection)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test31() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test31");


    java.util.TreeSet var0 = new java.util.TreeSet();
    var0.clear();
    java.util.TreeSet var2 = new java.util.TreeSet();
    boolean var3 = var0.addAll((java.util.Collection)var2);
    java.util.Enumeration var4 = java.util.Collections.enumeration((java.util.Collection)var0);
    java.util.TreeSet var5 = new java.util.TreeSet((java.util.Collection)var0);
    java.lang.Object var7 = var0.floor((java.lang.Object)false);
    java.lang.Object var9 = var0.floor((java.lang.Object)(short)(-1));
    java.util.TreeSet var10 = new java.util.TreeSet();
    var10.clear();
    java.util.TreeSet var12 = new java.util.TreeSet();
    boolean var13 = var10.addAll((java.util.Collection)var12);
    java.lang.Object var14 = var12.pollFirst();
    java.lang.Object var16 = var12.higher((java.lang.Object)10.0f);
    java.util.NavigableSet var17 = var12.descendingSet();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var18 = var0.contains((java.lang.Object)var12);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test32() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test32");


    java.util.TreeSet var0 = new java.util.TreeSet();
    var0.clear();
    java.util.TreeSet var2 = new java.util.TreeSet();
    var2.clear();
    java.util.TreeSet var4 = new java.util.TreeSet();
    boolean var5 = var2.addAll((java.util.Collection)var4);
    java.lang.Object var6 = var2.pollLast();
    java.util.TreeSet var7 = new java.util.TreeSet();
    java.lang.Object var8 = var2.floor((java.lang.Object)var7);
    boolean var9 = var0.containsAll((java.util.Collection)var7);
    boolean var11 = var7.add((java.lang.Object)10.0d);
    java.util.Set var12 = java.util.Collections.synchronizedSet((java.util.Set)var7);
    java.lang.Object var13 = var7.last();
    java.util.TreeSet var14 = new java.util.TreeSet();
    var14.clear();
    java.util.TreeSet var16 = new java.util.TreeSet();
    boolean var17 = var14.addAll((java.util.Collection)var16);
    java.util.Enumeration var18 = java.util.Collections.enumeration((java.util.Collection)var14);
    java.util.Iterator var19 = var14.descendingIterator();
    java.util.List var20 = java.util.Collections.singletonList((java.lang.Object)var19);
    java.util.TreeSet var21 = new java.util.TreeSet();
    var21.clear();
    java.util.TreeSet var23 = new java.util.TreeSet();
    boolean var24 = var21.addAll((java.util.Collection)var23);
    java.util.Enumeration var25 = java.util.Collections.enumeration((java.util.Collection)var21);
    java.util.ArrayList var26 = java.util.Collections.list(var25);
    java.util.Collections.copy(var20, (java.util.List)var26);
    java.util.TreeSet var28 = new java.util.TreeSet();
    java.lang.Object var30 = var28.ceiling((java.lang.Object)false);
    java.lang.Object var31 = var28.clone();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.SortedSet var32 = var7.subSet((java.lang.Object)var20, var31);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + 10.0d+ "'", var13.equals(10.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);

  }

  public void test33() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test33");


    java.util.TreeSet var0 = new java.util.TreeSet();
    var0.clear();
    java.util.TreeSet var2 = new java.util.TreeSet();
    boolean var3 = var0.addAll((java.util.Collection)var2);
    java.lang.Object var4 = var2.pollFirst();
    boolean var6 = var2.remove((java.lang.Object)'#');
    java.util.TreeSet var7 = new java.util.TreeSet();
    var7.clear();
    java.util.TreeSet var9 = new java.util.TreeSet();
    boolean var10 = var7.addAll((java.util.Collection)var9);
    java.util.Enumeration var11 = java.util.Collections.enumeration((java.util.Collection)var7);
    java.util.Iterator var12 = var7.descendingIterator();
    java.lang.Object var13 = var2.higher((java.lang.Object)var12);
    java.lang.Object var15 = var2.lower((java.lang.Object)(short)(-1));
    java.util.Collection var16 = java.util.Collections.unmodifiableCollection((java.util.Collection)var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test34() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test34");


    java.util.TreeSet var0 = new java.util.TreeSet();
    var0.clear();
    java.util.TreeSet var2 = new java.util.TreeSet();
    boolean var3 = var0.addAll((java.util.Collection)var2);
    java.util.Enumeration var4 = java.util.Collections.enumeration((java.util.Collection)var0);
    java.util.Iterator var5 = var0.descendingIterator();
    java.util.List var6 = java.util.Collections.singletonList((java.lang.Object)var5);
    java.util.TreeSet var7 = new java.util.TreeSet();
    var7.clear();
    java.util.TreeSet var9 = new java.util.TreeSet();
    boolean var10 = var7.addAll((java.util.Collection)var9);
    java.util.Enumeration var11 = java.util.Collections.enumeration((java.util.Collection)var7);
    java.util.ArrayList var12 = java.util.Collections.list(var11);
    java.util.Collections.copy(var6, (java.util.List)var12);
    java.util.TreeSet var15 = new java.util.TreeSet();
    var15.clear();
    java.util.TreeSet var17 = new java.util.TreeSet();
    boolean var18 = var15.addAll((java.util.Collection)var17);
    java.lang.Object var19 = var17.pollFirst();
    boolean var20 = java.util.Collections.replaceAll(var6, (java.lang.Object)1L, (java.lang.Object)var17);
    java.util.TreeSet var21 = new java.util.TreeSet();
    var21.clear();
    java.util.TreeSet var23 = new java.util.TreeSet();
    boolean var24 = var21.addAll((java.util.Collection)var23);
    java.util.Enumeration var25 = java.util.Collections.enumeration((java.util.Collection)var21);
    java.util.TreeSet var26 = new java.util.TreeSet((java.util.Collection)var21);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var27 = var17.add((java.lang.Object)var26);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);

  }

  public void test35() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test35");


    java.util.Iterator var0 = java.util.Collections.emptyIterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test36() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test36");


    java.util.TreeSet var0 = new java.util.TreeSet();
    var0.clear();
    java.util.TreeSet var2 = new java.util.TreeSet();
    var2.clear();
    java.util.TreeSet var4 = new java.util.TreeSet();
    boolean var5 = var2.addAll((java.util.Collection)var4);
    java.lang.Object var6 = var2.pollLast();
    java.util.TreeSet var7 = new java.util.TreeSet();
    java.lang.Object var8 = var2.floor((java.lang.Object)var7);
    boolean var9 = var0.containsAll((java.util.Collection)var7);
    java.util.Set var10 = java.util.Collections.singleton((java.lang.Object)var0);
    java.util.Set var11 = java.util.Collections.synchronizedSet(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test37() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test37");


    java.util.Set var1 = java.util.Collections.singleton((java.lang.Object)0L);
    java.util.Collection var2 = java.util.Collections.synchronizedCollection((java.util.Collection)var1);
    java.util.Set var3 = java.util.Collections.singleton((java.lang.Object)var2);
    java.lang.Object var4 = java.util.Collections.min(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + 0L+ "'", var4.equals(0L));

  }

  public void test38() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test38");


    java.util.TreeSet var0 = new java.util.TreeSet();
    var0.clear();
    java.util.TreeSet var2 = new java.util.TreeSet();
    boolean var3 = var0.addAll((java.util.Collection)var2);
    java.util.Enumeration var4 = java.util.Collections.enumeration((java.util.Collection)var0);
    java.util.Iterator var5 = var0.descendingIterator();
    java.util.List var6 = java.util.Collections.singletonList((java.lang.Object)var5);
    java.util.List var7 = java.util.Collections.unmodifiableList(var6);
    java.util.List var8 = java.util.Collections.unmodifiableList(var6);
    java.util.TreeSet var9 = new java.util.TreeSet();
    java.util.TreeSet var10 = new java.util.TreeSet();
    var10.clear();
    java.util.TreeSet var12 = new java.util.TreeSet();
    boolean var13 = var10.addAll((java.util.Collection)var12);
    java.util.Enumeration var14 = java.util.Collections.enumeration((java.util.Collection)var10);
    java.util.TreeSet var15 = new java.util.TreeSet((java.util.Collection)var10);
    java.lang.Object var17 = var10.floor((java.lang.Object)false);
    java.util.TreeSet var18 = new java.util.TreeSet();
    var18.clear();
    java.util.TreeSet var20 = new java.util.TreeSet();
    boolean var21 = var18.addAll((java.util.Collection)var20);
    java.util.Enumeration var22 = java.util.Collections.enumeration((java.util.Collection)var18);
    java.util.NavigableSet var23 = var18.descendingSet();
    boolean var24 = var10.addAll((java.util.Collection)var23);
    java.util.Map var25 = java.util.Collections.singletonMap((java.lang.Object)var9, (java.lang.Object)var10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var26 = java.util.Collections.binarySearch(var8, (java.lang.Object)var10);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);

  }

  public void test39() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test39");


    java.util.TreeSet var0 = new java.util.TreeSet();
    var0.clear();
    java.util.TreeSet var2 = new java.util.TreeSet();
    boolean var3 = var0.addAll((java.util.Collection)var2);
    java.util.Enumeration var4 = java.util.Collections.enumeration((java.util.Collection)var0);
    java.util.TreeSet var5 = new java.util.TreeSet((java.util.Collection)var0);
    java.util.Iterator var6 = var5.descendingIterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var7 = var5.first();
      fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test40() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test40");


    java.util.TreeSet var0 = new java.util.TreeSet();
    var0.clear();
    java.util.TreeSet var2 = new java.util.TreeSet();
    boolean var3 = var0.addAll((java.util.Collection)var2);
    java.lang.Object var4 = var2.pollFirst();
    java.lang.Object var6 = var2.higher((java.lang.Object)10.0f);
    java.util.TreeSet var7 = new java.util.TreeSet();
    var7.clear();
    java.util.TreeSet var9 = new java.util.TreeSet();
    boolean var10 = var7.addAll((java.util.Collection)var9);
    java.util.Enumeration var11 = java.util.Collections.enumeration((java.util.Collection)var7);
    java.util.TreeSet var12 = new java.util.TreeSet((java.util.Collection)var7);
    java.lang.Object var14 = var7.floor((java.lang.Object)false);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var15 = var2.add((java.lang.Object)var7);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);

  }

  public void test41() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test41");


    java.util.TreeSet var0 = new java.util.TreeSet();
    var0.clear();
    java.util.TreeSet var2 = new java.util.TreeSet();
    boolean var3 = var0.addAll((java.util.Collection)var2);
    java.lang.Object var4 = var2.pollFirst();
    java.lang.Object var6 = var2.higher((java.lang.Object)10.0f);
    java.util.TreeSet var7 = new java.util.TreeSet();
    var7.clear();
    java.util.TreeSet var9 = new java.util.TreeSet();
    boolean var10 = var7.addAll((java.util.Collection)var9);
    java.util.Enumeration var11 = java.util.Collections.enumeration((java.util.Collection)var7);
    java.util.ArrayList var12 = java.util.Collections.list(var11);
    java.util.ArrayList var13 = java.util.Collections.list(var11);
    java.util.TreeSet var14 = new java.util.TreeSet();
    var14.clear();
    java.util.TreeSet var16 = new java.util.TreeSet();
    boolean var17 = var14.addAll((java.util.Collection)var16);
    java.util.Enumeration var18 = java.util.Collections.enumeration((java.util.Collection)var14);
    java.util.Iterator var19 = var14.descendingIterator();
    java.util.List var20 = java.util.Collections.singletonList((java.lang.Object)var19);
    java.util.TreeSet var21 = new java.util.TreeSet();
    var21.clear();
    java.util.TreeSet var23 = new java.util.TreeSet();
    boolean var24 = var21.addAll((java.util.Collection)var23);
    java.util.Enumeration var25 = java.util.Collections.enumeration((java.util.Collection)var21);
    java.util.ArrayList var26 = java.util.Collections.list(var25);
    java.util.Collections.copy(var20, (java.util.List)var26);
    java.util.TreeSet var29 = new java.util.TreeSet();
    var29.clear();
    java.util.TreeSet var31 = new java.util.TreeSet();
    boolean var32 = var29.addAll((java.util.Collection)var31);
    java.lang.Object var33 = var31.pollFirst();
    boolean var34 = java.util.Collections.replaceAll(var20, (java.lang.Object)1L, (java.lang.Object)var31);
    java.util.Collections.fill((java.util.List)var13, (java.lang.Object)var31);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.NavigableSet var37 = var2.headSet((java.lang.Object)var13, true);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);

  }

  public void test42() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test42");


    java.util.TreeSet var0 = new java.util.TreeSet();
    var0.clear();
    java.util.TreeSet var2 = new java.util.TreeSet();
    var2.clear();
    java.util.TreeSet var4 = new java.util.TreeSet();
    boolean var5 = var2.addAll((java.util.Collection)var4);
    java.lang.Object var6 = var2.pollLast();
    java.util.TreeSet var7 = new java.util.TreeSet();
    java.lang.Object var8 = var2.floor((java.lang.Object)var7);
    boolean var9 = var0.containsAll((java.util.Collection)var7);
    java.util.Set var10 = java.util.Collections.synchronizedSet((java.util.Set)var0);
    java.util.TreeSet var11 = new java.util.TreeSet();
    var11.clear();
    java.util.TreeSet var13 = new java.util.TreeSet();
    boolean var14 = var11.addAll((java.util.Collection)var13);
    java.util.TreeSet var15 = new java.util.TreeSet();
    var15.clear();
    java.util.TreeSet var17 = new java.util.TreeSet();
    boolean var18 = var15.addAll((java.util.Collection)var17);
    java.lang.Object var19 = var17.pollFirst();
    java.lang.Object var21 = var17.higher((java.lang.Object)10.0f);
    boolean var22 = java.util.Collections.disjoint((java.util.Collection)var11, (java.util.Collection)var17);
    boolean var23 = var0.remove((java.lang.Object)var22);
    java.util.Comparator var24 = java.util.Collections.reverseOrder();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var25 = java.util.Collections.max((java.util.Collection)var0, var24);
      fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);

  }

  public void test43() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test43");


    java.util.TreeSet var0 = new java.util.TreeSet();
    java.util.TreeSet var1 = new java.util.TreeSet();
    var1.clear();
    java.util.TreeSet var3 = new java.util.TreeSet();
    boolean var4 = var1.addAll((java.util.Collection)var3);
    java.util.Enumeration var5 = java.util.Collections.enumeration((java.util.Collection)var1);
    java.util.TreeSet var6 = new java.util.TreeSet((java.util.Collection)var1);
    java.lang.Object var8 = var1.floor((java.lang.Object)false);
    java.util.TreeSet var9 = new java.util.TreeSet();
    var9.clear();
    java.util.TreeSet var11 = new java.util.TreeSet();
    boolean var12 = var9.addAll((java.util.Collection)var11);
    java.util.Enumeration var13 = java.util.Collections.enumeration((java.util.Collection)var9);
    java.util.NavigableSet var14 = var9.descendingSet();
    boolean var15 = var1.addAll((java.util.Collection)var14);
    java.util.Map var16 = java.util.Collections.singletonMap((java.lang.Object)var0, (java.lang.Object)var1);
    java.util.SortedSet var17 = java.util.Collections.unmodifiableSortedSet((java.util.SortedSet)var0);
    java.util.TreeSet var18 = new java.util.TreeSet();
    var18.clear();
    java.util.TreeSet var20 = new java.util.TreeSet();
    boolean var21 = var18.addAll((java.util.Collection)var20);
    java.util.Enumeration var22 = java.util.Collections.enumeration((java.util.Collection)var18);
    java.util.ArrayList var23 = java.util.Collections.list(var22);
    java.util.ArrayList var24 = java.util.Collections.list(var22);
    java.util.Map var25 = java.util.Collections.singletonMap((java.lang.Object)var0, (java.lang.Object)var24);
    boolean var26 = var0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == true);

  }

  public void test44() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test44");


    java.util.TreeSet var0 = new java.util.TreeSet();
    var0.clear();
    java.util.TreeSet var2 = new java.util.TreeSet();
    boolean var3 = var0.addAll((java.util.Collection)var2);
    java.util.Enumeration var4 = java.util.Collections.enumeration((java.util.Collection)var0);
    java.util.ArrayList var5 = java.util.Collections.list(var4);
    java.util.ArrayList var6 = java.util.Collections.list(var4);
    java.util.ArrayList var7 = java.util.Collections.list(var4);
    java.util.TreeSet var8 = new java.util.TreeSet();
    var8.clear();
    java.util.TreeSet var10 = new java.util.TreeSet();
    var10.clear();
    java.util.TreeSet var12 = new java.util.TreeSet();
    boolean var13 = var10.addAll((java.util.Collection)var12);
    java.lang.Object var14 = var10.pollLast();
    java.util.TreeSet var15 = new java.util.TreeSet();
    java.lang.Object var16 = var10.floor((java.lang.Object)var15);
    boolean var17 = var8.containsAll((java.util.Collection)var15);
    java.util.Set var18 = java.util.Collections.singleton((java.lang.Object)var8);
    boolean var19 = var7.containsAll((java.util.Collection)var8);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var20 = java.util.Collections.min((java.util.Collection)var8);
      fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);

  }

  public void test45() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test45");


    java.util.TreeSet var0 = new java.util.TreeSet();
    var0.clear();
    java.util.TreeSet var2 = new java.util.TreeSet();
    var2.clear();
    java.util.TreeSet var4 = new java.util.TreeSet();
    boolean var5 = var2.addAll((java.util.Collection)var4);
    java.lang.Object var6 = var2.pollLast();
    java.util.TreeSet var7 = new java.util.TreeSet();
    java.lang.Object var8 = var2.floor((java.lang.Object)var7);
    boolean var9 = var0.containsAll((java.util.Collection)var7);
    java.util.Set var10 = java.util.Collections.singleton((java.lang.Object)var0);
    java.util.Comparator var11 = var0.comparator();
    boolean var13 = var0.add((java.lang.Object)100);
    java.lang.Object var14 = var0.pollLast();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var15 = java.util.Collections.min((java.util.Collection)var0);
      fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + 100+ "'", var14.equals(100));

  }

  public void test46() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test46");


    java.util.List var0 = java.util.Collections.emptyList();
    java.util.Collections.rotate(var0, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test47() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test47");


    java.util.TreeSet var0 = new java.util.TreeSet();
    var0.clear();
    java.util.TreeSet var2 = new java.util.TreeSet();
    boolean var3 = var0.addAll((java.util.Collection)var2);
    java.util.Enumeration var4 = java.util.Collections.enumeration((java.util.Collection)var0);
    java.util.Iterator var5 = var0.descendingIterator();
    java.util.List var6 = java.util.Collections.singletonList((java.lang.Object)var5);
    java.util.TreeSet var7 = new java.util.TreeSet();
    var7.clear();
    java.util.TreeSet var9 = new java.util.TreeSet();
    boolean var10 = var7.addAll((java.util.Collection)var9);
    java.util.Enumeration var11 = java.util.Collections.enumeration((java.util.Collection)var7);
    java.util.ArrayList var12 = java.util.Collections.list(var11);
    java.util.Collections.copy(var6, (java.util.List)var12);
    java.util.TreeSet var15 = new java.util.TreeSet();
    var15.clear();
    java.util.TreeSet var17 = new java.util.TreeSet();
    boolean var18 = var15.addAll((java.util.Collection)var17);
    java.lang.Object var19 = var17.pollFirst();
    boolean var20 = java.util.Collections.replaceAll(var6, (java.lang.Object)1L, (java.lang.Object)var17);
    java.util.TreeSet var21 = new java.util.TreeSet();
    var21.clear();
    java.util.TreeSet var23 = new java.util.TreeSet();
    boolean var24 = var21.addAll((java.util.Collection)var23);
    java.util.Enumeration var25 = java.util.Collections.enumeration((java.util.Collection)var21);
    java.util.ArrayList var26 = java.util.Collections.list(var25);
    java.util.ArrayList var27 = java.util.Collections.list(var25);
    java.util.ArrayList var28 = java.util.Collections.list(var25);
    java.util.TreeSet var29 = new java.util.TreeSet();
    var29.clear();
    java.util.TreeSet var31 = new java.util.TreeSet();
    var31.clear();
    java.util.TreeSet var33 = new java.util.TreeSet();
    boolean var34 = var31.addAll((java.util.Collection)var33);
    java.lang.Object var35 = var31.pollLast();
    java.util.TreeSet var36 = new java.util.TreeSet();
    java.lang.Object var37 = var31.floor((java.lang.Object)var36);
    boolean var38 = var29.containsAll((java.util.Collection)var36);
    java.util.TreeSet var39 = new java.util.TreeSet();
    var39.clear();
    java.util.TreeSet var41 = new java.util.TreeSet();
    var41.clear();
    java.util.TreeSet var43 = new java.util.TreeSet();
    boolean var44 = var41.addAll((java.util.Collection)var43);
    java.lang.Object var45 = var41.pollLast();
    java.util.TreeSet var46 = new java.util.TreeSet();
    java.lang.Object var47 = var41.floor((java.lang.Object)var46);
    boolean var48 = var39.containsAll((java.util.Collection)var46);
    java.lang.Object[] var49 = new java.lang.Object[] { var48};
    java.lang.Object[] var50 = var36.toArray(var49);
    java.lang.Object[] var51 = var28.toArray(var49);
    java.util.Collections.shuffle((java.util.List)var28);
    java.util.TreeSet var53 = new java.util.TreeSet();
    var53.clear();
    java.util.TreeSet var55 = new java.util.TreeSet();
    boolean var56 = var53.addAll((java.util.Collection)var55);
    java.util.Enumeration var57 = java.util.Collections.enumeration((java.util.Collection)var53);
    java.util.ArrayList var58 = java.util.Collections.list(var57);
    java.util.ArrayList var59 = java.util.Collections.list(var57);
    java.util.TreeSet var60 = new java.util.TreeSet();
    var60.clear();
    java.util.TreeSet var62 = new java.util.TreeSet();
    boolean var63 = var60.addAll((java.util.Collection)var62);
    java.lang.Object var64 = var62.pollFirst();
    boolean var66 = var62.remove((java.lang.Object)'#');
    java.util.Collections.fill((java.util.List)var59, (java.lang.Object)var66);
    int var68 = java.util.Collections.indexOfSubList((java.util.List)var28, (java.util.List)var59);
    java.util.Collections.copy(var6, (java.util.List)var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var66 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var68 == 0);

  }

  public void test48() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test48");


    java.util.TreeSet var0 = new java.util.TreeSet();
    var0.clear();
    java.util.TreeSet var2 = new java.util.TreeSet();
    boolean var3 = var0.addAll((java.util.Collection)var2);
    java.util.Enumeration var4 = java.util.Collections.enumeration((java.util.Collection)var0);
    java.util.TreeSet var5 = new java.util.TreeSet();
    var5.clear();
    java.util.TreeSet var7 = new java.util.TreeSet();
    boolean var8 = var5.addAll((java.util.Collection)var7);
    java.lang.Object var9 = var5.pollLast();
    java.util.TreeSet var10 = new java.util.TreeSet();
    java.lang.Object var11 = var5.floor((java.lang.Object)var10);
    java.lang.Object var13 = var10.floor((java.lang.Object)(byte)1);
    int var14 = java.util.Collections.frequency((java.util.Collection)var0, (java.lang.Object)var10);
    java.lang.Object[] var15 = var0.toArray();
    java.util.TreeSet var16 = new java.util.TreeSet((java.util.Collection)var0);
    java.util.TreeSet var17 = new java.util.TreeSet();
    var17.clear();
    java.util.TreeSet var19 = new java.util.TreeSet();
    boolean var20 = var17.addAll((java.util.Collection)var19);
    java.util.Enumeration var21 = java.util.Collections.enumeration((java.util.Collection)var17);
    java.util.ArrayList var22 = java.util.Collections.list(var21);
    boolean var23 = var0.equals((java.lang.Object)var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);

  }

  public void test49() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test49");


    java.util.TreeSet var0 = new java.util.TreeSet();
    var0.clear();
    java.util.TreeSet var2 = new java.util.TreeSet();
    boolean var3 = var0.addAll((java.util.Collection)var2);
    java.util.Enumeration var4 = java.util.Collections.enumeration((java.util.Collection)var0);
    java.util.TreeSet var5 = new java.util.TreeSet();
    var5.clear();
    java.util.TreeSet var7 = new java.util.TreeSet();
    var7.clear();
    java.util.TreeSet var9 = new java.util.TreeSet();
    boolean var10 = var7.addAll((java.util.Collection)var9);
    java.lang.Object var11 = var7.pollLast();
    java.util.TreeSet var12 = new java.util.TreeSet();
    java.lang.Object var13 = var7.floor((java.lang.Object)var12);
    boolean var14 = var5.containsAll((java.util.Collection)var12);
    boolean var16 = var12.add((java.lang.Object)10.0d);
    java.util.Set var17 = java.util.Collections.synchronizedSet((java.util.Set)var12);
    java.util.TreeSet var18 = new java.util.TreeSet();
    var18.clear();
    java.util.TreeSet var20 = new java.util.TreeSet();
    boolean var21 = var18.addAll((java.util.Collection)var20);
    java.util.Enumeration var22 = java.util.Collections.enumeration((java.util.Collection)var18);
    java.util.ArrayList var23 = java.util.Collections.list(var22);
    java.util.ArrayList var24 = java.util.Collections.list(var22);
    java.util.Comparator var25 = java.util.Collections.reverseOrder();
    java.util.Collections.sort((java.util.List)var24, var25);
    java.lang.Object var27 = java.util.Collections.min((java.util.Collection)var12, var25);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var28 = java.util.Collections.max((java.util.Collection)var0, var25);
      fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + 10.0d+ "'", var27.equals(10.0d));

  }

  public void test50() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test50");


    java.util.TreeSet var0 = new java.util.TreeSet();
    var0.clear();
    java.util.TreeSet var2 = new java.util.TreeSet();
    boolean var3 = var0.addAll((java.util.Collection)var2);
    java.util.Enumeration var4 = java.util.Collections.enumeration((java.util.Collection)var0);
    java.util.ArrayList var5 = java.util.Collections.list(var4);
    java.util.ArrayList var6 = java.util.Collections.list(var4);
    java.util.ArrayList var7 = java.util.Collections.list(var4);
    java.util.TreeSet var8 = new java.util.TreeSet();
    var8.clear();
    java.util.TreeSet var10 = new java.util.TreeSet();
    var10.clear();
    java.util.TreeSet var12 = new java.util.TreeSet();
    boolean var13 = var10.addAll((java.util.Collection)var12);
    java.lang.Object var14 = var10.pollLast();
    java.util.TreeSet var15 = new java.util.TreeSet();
    java.lang.Object var16 = var10.floor((java.lang.Object)var15);
    boolean var17 = var8.containsAll((java.util.Collection)var15);
    java.util.TreeSet var18 = new java.util.TreeSet();
    var18.clear();
    java.util.TreeSet var20 = new java.util.TreeSet();
    var20.clear();
    java.util.TreeSet var22 = new java.util.TreeSet();
    boolean var23 = var20.addAll((java.util.Collection)var22);
    java.lang.Object var24 = var20.pollLast();
    java.util.TreeSet var25 = new java.util.TreeSet();
    java.lang.Object var26 = var20.floor((java.lang.Object)var25);
    boolean var27 = var18.containsAll((java.util.Collection)var25);
    java.lang.Object[] var28 = new java.lang.Object[] { var27};
    java.lang.Object[] var29 = var15.toArray(var28);
    java.lang.Object[] var30 = var7.toArray(var28);
    java.util.Collections.shuffle((java.util.List)var7);
    java.util.TreeSet var32 = new java.util.TreeSet();
    var32.clear();
    java.util.TreeSet var34 = new java.util.TreeSet();
    boolean var35 = var32.addAll((java.util.Collection)var34);
    java.util.Enumeration var36 = java.util.Collections.enumeration((java.util.Collection)var32);
    java.util.ArrayList var37 = java.util.Collections.list(var36);
    java.util.ArrayList var38 = java.util.Collections.list(var36);
    java.util.TreeSet var39 = new java.util.TreeSet();
    var39.clear();
    java.util.TreeSet var41 = new java.util.TreeSet();
    boolean var42 = var39.addAll((java.util.Collection)var41);
    java.lang.Object var43 = var41.pollFirst();
    boolean var45 = var41.remove((java.lang.Object)'#');
    java.util.Collections.fill((java.util.List)var38, (java.lang.Object)var45);
    int var47 = java.util.Collections.indexOfSubList((java.util.List)var7, (java.util.List)var38);
    java.util.Collections.<java.lang.Comparable>sort((java.util.List)var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == 0);

  }

  public void test51() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test51");


    java.util.TreeSet var1 = new java.util.TreeSet();
    var1.clear();
    java.util.TreeSet var3 = new java.util.TreeSet();
    boolean var4 = var1.addAll((java.util.Collection)var3);
    java.util.Enumeration var5 = java.util.Collections.enumeration((java.util.Collection)var1);
    java.util.ArrayList var6 = java.util.Collections.list(var5);
    java.util.ArrayList var7 = java.util.Collections.list(var5);
    java.util.TreeSet var8 = new java.util.TreeSet();
    var8.clear();
    java.util.TreeSet var10 = new java.util.TreeSet();
    boolean var11 = var8.addAll((java.util.Collection)var10);
    java.util.Enumeration var12 = java.util.Collections.enumeration((java.util.Collection)var8);
    java.util.Iterator var13 = var8.descendingIterator();
    java.util.List var14 = java.util.Collections.singletonList((java.lang.Object)var13);
    java.util.TreeSet var15 = new java.util.TreeSet();
    var15.clear();
    java.util.TreeSet var17 = new java.util.TreeSet();
    boolean var18 = var15.addAll((java.util.Collection)var17);
    java.util.Enumeration var19 = java.util.Collections.enumeration((java.util.Collection)var15);
    java.util.ArrayList var20 = java.util.Collections.list(var19);
    java.util.Collections.copy(var14, (java.util.List)var20);
    java.util.TreeSet var23 = new java.util.TreeSet();
    var23.clear();
    java.util.TreeSet var25 = new java.util.TreeSet();
    boolean var26 = var23.addAll((java.util.Collection)var25);
    java.lang.Object var27 = var25.pollFirst();
    boolean var28 = java.util.Collections.replaceAll(var14, (java.lang.Object)1L, (java.lang.Object)var25);
    java.util.Collections.fill((java.util.List)var7, (java.lang.Object)var25);
    java.util.List var30 = java.util.Collections.nCopies(10, (java.lang.Object)var7);
    java.util.Collections.reverse((java.util.List)var7);
    java.util.Set var32 = java.util.Collections.singleton((java.lang.Object)var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);

  }

  public void test52() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test52");


    java.util.TreeSet var0 = new java.util.TreeSet();
    var0.clear();
    java.util.TreeSet var2 = new java.util.TreeSet();
    boolean var3 = var0.addAll((java.util.Collection)var2);
    java.util.Enumeration var4 = java.util.Collections.enumeration((java.util.Collection)var0);
    java.util.ArrayList var5 = java.util.Collections.list(var4);
    java.util.ArrayList var6 = java.util.Collections.list(var4);
    java.util.Comparator var7 = java.util.Collections.reverseOrder();
    java.util.Collections.sort((java.util.List)var6, var7);
    java.util.TreeSet var9 = new java.util.TreeSet(var7);
    java.util.TreeSet var10 = new java.util.TreeSet();
    var10.clear();
    java.util.TreeSet var12 = new java.util.TreeSet();
    var12.clear();
    java.util.TreeSet var14 = new java.util.TreeSet();
    boolean var15 = var12.addAll((java.util.Collection)var14);
    java.lang.Object var16 = var12.pollLast();
    java.util.TreeSet var17 = new java.util.TreeSet();
    java.lang.Object var18 = var12.floor((java.lang.Object)var17);
    boolean var19 = var10.containsAll((java.util.Collection)var17);
    boolean var21 = var17.add((java.lang.Object)10.0d);
    java.util.Set var22 = java.util.Collections.synchronizedSet((java.util.Set)var17);
    java.util.TreeSet var23 = new java.util.TreeSet();
    var23.clear();
    java.util.TreeSet var25 = new java.util.TreeSet();
    boolean var26 = var23.addAll((java.util.Collection)var25);
    java.util.Enumeration var27 = java.util.Collections.enumeration((java.util.Collection)var23);
    java.util.ArrayList var28 = java.util.Collections.list(var27);
    java.util.ArrayList var29 = java.util.Collections.list(var27);
    java.util.Comparator var30 = java.util.Collections.reverseOrder();
    java.util.Collections.sort((java.util.List)var29, var30);
    java.lang.Object var32 = java.util.Collections.min((java.util.Collection)var17, var30);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var33 = java.util.Collections.max((java.util.Collection)var9, var30);
      fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var32 + "' != '" + 10.0d+ "'", var32.equals(10.0d));

  }

  public void test53() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test53");


    java.util.TreeSet var0 = new java.util.TreeSet();
    var0.clear();
    java.util.TreeSet var2 = new java.util.TreeSet();
    boolean var3 = var0.addAll((java.util.Collection)var2);
    java.util.Enumeration var4 = java.util.Collections.enumeration((java.util.Collection)var0);
    java.util.List var5 = java.util.Collections.singletonList((java.lang.Object)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test54() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test54");


    java.util.TreeSet var0 = new java.util.TreeSet();
    var0.clear();
    java.util.TreeSet var2 = new java.util.TreeSet();
    boolean var3 = var0.addAll((java.util.Collection)var2);
    java.util.TreeSet var4 = new java.util.TreeSet();
    var4.clear();
    java.util.TreeSet var6 = new java.util.TreeSet();
    boolean var7 = var4.addAll((java.util.Collection)var6);
    java.lang.Object var8 = var6.pollFirst();
    java.lang.Object var10 = var6.higher((java.lang.Object)10.0f);
    boolean var11 = java.util.Collections.disjoint((java.util.Collection)var0, (java.util.Collection)var6);
    java.util.TreeSet var13 = new java.util.TreeSet();
    var13.clear();
    java.util.TreeSet var15 = new java.util.TreeSet();
    boolean var16 = var13.addAll((java.util.Collection)var15);
    java.util.Enumeration var17 = java.util.Collections.enumeration((java.util.Collection)var13);
    java.util.ArrayList var18 = java.util.Collections.list(var17);
    java.util.ArrayList var19 = java.util.Collections.list(var17);
    java.util.TreeSet var20 = new java.util.TreeSet();
    var20.clear();
    java.util.TreeSet var22 = new java.util.TreeSet();
    boolean var23 = var20.addAll((java.util.Collection)var22);
    java.util.Enumeration var24 = java.util.Collections.enumeration((java.util.Collection)var20);
    java.util.Iterator var25 = var20.descendingIterator();
    java.util.List var26 = java.util.Collections.singletonList((java.lang.Object)var25);
    java.util.TreeSet var27 = new java.util.TreeSet();
    var27.clear();
    java.util.TreeSet var29 = new java.util.TreeSet();
    boolean var30 = var27.addAll((java.util.Collection)var29);
    java.util.Enumeration var31 = java.util.Collections.enumeration((java.util.Collection)var27);
    java.util.ArrayList var32 = java.util.Collections.list(var31);
    java.util.Collections.copy(var26, (java.util.List)var32);
    java.util.TreeSet var35 = new java.util.TreeSet();
    var35.clear();
    java.util.TreeSet var37 = new java.util.TreeSet();
    boolean var38 = var35.addAll((java.util.Collection)var37);
    java.lang.Object var39 = var37.pollFirst();
    boolean var40 = java.util.Collections.replaceAll(var26, (java.lang.Object)1L, (java.lang.Object)var37);
    java.util.Collections.fill((java.util.List)var19, (java.lang.Object)var37);
    java.util.List var42 = java.util.Collections.nCopies(10, (java.lang.Object)var19);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var43 = var6.remove((java.lang.Object)var42);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);

  }

  public void test55() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test55");


    java.util.TreeSet var0 = new java.util.TreeSet();
    var0.clear();
    java.util.TreeSet var2 = new java.util.TreeSet();
    var2.clear();
    java.util.TreeSet var4 = new java.util.TreeSet();
    boolean var5 = var2.addAll((java.util.Collection)var4);
    java.lang.Object var6 = var2.pollLast();
    java.util.TreeSet var7 = new java.util.TreeSet();
    java.lang.Object var8 = var2.floor((java.lang.Object)var7);
    boolean var9 = var0.containsAll((java.util.Collection)var7);
    boolean var11 = var7.add((java.lang.Object)10.0d);
    java.util.Set var12 = java.util.Collections.synchronizedSet((java.util.Set)var7);
    java.util.TreeSet var13 = new java.util.TreeSet();
    var13.clear();
    java.util.TreeSet var15 = new java.util.TreeSet();
    boolean var16 = var13.addAll((java.util.Collection)var15);
    java.lang.Object var17 = var15.pollFirst();
    java.lang.Object var19 = var15.higher((java.lang.Object)10.0f);
    java.util.NavigableSet var20 = var15.descendingSet();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.SortedSet var21 = var7.tailSet((java.lang.Object)var15);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);

  }

  public void test56() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test56");


    java.util.TreeSet var0 = new java.util.TreeSet();
    var0.clear();
    java.util.TreeSet var2 = new java.util.TreeSet();
    boolean var3 = var0.addAll((java.util.Collection)var2);
    java.util.TreeSet var4 = new java.util.TreeSet();
    var4.clear();
    java.util.TreeSet var6 = new java.util.TreeSet();
    boolean var7 = var4.addAll((java.util.Collection)var6);
    java.lang.Object var8 = var6.pollFirst();
    java.lang.Object var10 = var6.higher((java.lang.Object)10.0f);
    boolean var11 = java.util.Collections.disjoint((java.util.Collection)var0, (java.util.Collection)var6);
    java.lang.Object var12 = var0.clone();
    java.lang.String var13 = var0.toString();
    java.lang.Object var14 = var0.pollFirst();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "[]"+ "'", var13.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);

  }

  public void test57() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test57");


    java.util.TreeSet var0 = new java.util.TreeSet();
    var0.clear();
    java.util.TreeSet var2 = new java.util.TreeSet();
    boolean var3 = var0.addAll((java.util.Collection)var2);
    java.util.Enumeration var4 = java.util.Collections.enumeration((java.util.Collection)var0);
    java.util.Iterator var5 = var0.descendingIterator();
    java.util.List var6 = java.util.Collections.singletonList((java.lang.Object)var5);
    java.util.List var7 = java.util.Collections.unmodifiableList(var6);
    java.util.TreeSet var8 = new java.util.TreeSet();
    var8.clear();
    java.util.TreeSet var10 = new java.util.TreeSet();
    boolean var11 = var8.addAll((java.util.Collection)var10);
    java.util.Enumeration var12 = java.util.Collections.enumeration((java.util.Collection)var8);
    java.util.Iterator var13 = var8.descendingIterator();
    java.util.List var14 = java.util.Collections.singletonList((java.lang.Object)var13);
    java.util.List var15 = java.util.Collections.unmodifiableList(var14);
    java.util.List var16 = java.util.Collections.unmodifiableList(var14);
    java.util.Collections.reverse(var16);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Collections.copy(var6, var16);
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test58() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test58");


    java.util.TreeSet var0 = new java.util.TreeSet();
    var0.clear();
    java.util.TreeSet var2 = new java.util.TreeSet();
    var2.clear();
    java.util.TreeSet var4 = new java.util.TreeSet();
    boolean var5 = var2.addAll((java.util.Collection)var4);
    java.lang.Object var6 = var2.pollLast();
    java.util.TreeSet var7 = new java.util.TreeSet();
    java.lang.Object var8 = var2.floor((java.lang.Object)var7);
    boolean var9 = var0.containsAll((java.util.Collection)var7);
    java.util.Set var10 = java.util.Collections.singleton((java.lang.Object)var0);
    boolean var11 = var0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);

  }

  public void test59() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test59");


    java.util.TreeSet var0 = new java.util.TreeSet();
    var0.clear();
    java.util.TreeSet var2 = new java.util.TreeSet();
    boolean var3 = var0.addAll((java.util.Collection)var2);
    java.util.Enumeration var4 = java.util.Collections.enumeration((java.util.Collection)var0);
    java.util.TreeSet var5 = new java.util.TreeSet((java.util.Collection)var0);
    java.util.Set var6 = java.util.Collections.unmodifiableSet((java.util.Set)var5);
    java.util.TreeSet var7 = new java.util.TreeSet();
    var7.clear();
    java.util.TreeSet var9 = new java.util.TreeSet();
    boolean var10 = var7.addAll((java.util.Collection)var9);
    java.lang.Object var11 = var7.pollLast();
    java.util.TreeSet var12 = new java.util.TreeSet();
    java.lang.Object var13 = var7.floor((java.lang.Object)var12);
    java.lang.Object var15 = var12.floor((java.lang.Object)(byte)1);
    java.util.Map var16 = java.util.Collections.singletonMap((java.lang.Object)var6, (java.lang.Object)(byte)1);
    java.util.Map var17 = java.util.Collections.synchronizedMap(var16);
    java.util.Map var18 = java.util.Collections.unmodifiableMap(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);

  }

  public void test60() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test60");


    java.util.TreeSet var0 = new java.util.TreeSet();
    java.util.TreeSet var1 = new java.util.TreeSet();
    var1.clear();
    java.util.TreeSet var3 = new java.util.TreeSet();
    boolean var4 = var1.addAll((java.util.Collection)var3);
    java.util.Enumeration var5 = java.util.Collections.enumeration((java.util.Collection)var1);
    java.util.TreeSet var6 = new java.util.TreeSet((java.util.Collection)var1);
    java.lang.Object var8 = var1.floor((java.lang.Object)false);
    java.util.TreeSet var9 = new java.util.TreeSet();
    var9.clear();
    java.util.TreeSet var11 = new java.util.TreeSet();
    boolean var12 = var9.addAll((java.util.Collection)var11);
    java.util.Enumeration var13 = java.util.Collections.enumeration((java.util.Collection)var9);
    java.util.NavigableSet var14 = var9.descendingSet();
    boolean var15 = var1.addAll((java.util.Collection)var14);
    java.util.Map var16 = java.util.Collections.singletonMap((java.lang.Object)var0, (java.lang.Object)var1);
    java.util.TreeSet var17 = new java.util.TreeSet();
    var17.clear();
    java.util.TreeSet var19 = new java.util.TreeSet();
    boolean var20 = var17.addAll((java.util.Collection)var19);
    java.util.TreeSet var21 = new java.util.TreeSet();
    var21.clear();
    java.util.TreeSet var23 = new java.util.TreeSet();
    boolean var24 = var21.addAll((java.util.Collection)var23);
    java.lang.Object var25 = var23.pollFirst();
    java.lang.Object var27 = var23.higher((java.lang.Object)10.0f);
    boolean var28 = java.util.Collections.disjoint((java.util.Collection)var17, (java.util.Collection)var23);
    java.lang.Object var29 = var17.clone();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var30 = var0.contains((java.lang.Object)var17);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);

  }

  public void test61() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test61");


    java.util.TreeSet var0 = new java.util.TreeSet();
    java.util.TreeSet var1 = new java.util.TreeSet();
    var1.clear();
    java.util.TreeSet var3 = new java.util.TreeSet();
    boolean var4 = var1.addAll((java.util.Collection)var3);
    java.util.Enumeration var5 = java.util.Collections.enumeration((java.util.Collection)var1);
    java.util.TreeSet var6 = new java.util.TreeSet((java.util.Collection)var1);
    java.util.Iterator var7 = var6.descendingIterator();
    boolean var8 = var0.addAll((java.util.Collection)var6);
    var6.clear();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test62() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test62");


    java.util.TreeSet var0 = new java.util.TreeSet();
    var0.clear();
    java.util.TreeSet var2 = new java.util.TreeSet();
    boolean var3 = var0.addAll((java.util.Collection)var2);
    java.lang.Object var4 = var2.pollFirst();
    boolean var6 = var2.remove((java.lang.Object)'#');
    java.util.TreeSet var7 = new java.util.TreeSet();
    var7.clear();
    java.util.TreeSet var9 = new java.util.TreeSet();
    boolean var10 = var7.addAll((java.util.Collection)var9);
    java.util.Enumeration var11 = java.util.Collections.enumeration((java.util.Collection)var7);
    java.util.Iterator var12 = var7.descendingIterator();
    java.lang.Object var13 = var2.higher((java.lang.Object)var12);
    java.util.TreeSet var14 = new java.util.TreeSet();
    var14.clear();
    java.util.TreeSet var16 = new java.util.TreeSet();
    boolean var17 = var14.addAll((java.util.Collection)var16);
    java.util.Enumeration var18 = java.util.Collections.enumeration((java.util.Collection)var14);
    java.util.TreeSet var19 = new java.util.TreeSet((java.util.Collection)var14);
    java.lang.Object var21 = var14.floor((java.lang.Object)false);
    java.util.TreeSet var22 = new java.util.TreeSet();
    var22.clear();
    java.util.TreeSet var24 = new java.util.TreeSet();
    boolean var25 = var22.addAll((java.util.Collection)var24);
    java.util.Enumeration var26 = java.util.Collections.enumeration((java.util.Collection)var22);
    java.util.NavigableSet var27 = var22.descendingSet();
    boolean var28 = var14.addAll((java.util.Collection)var27);
    java.lang.Object var29 = var2.floor((java.lang.Object)var28);
    java.util.TreeSet var30 = new java.util.TreeSet();
    var30.clear();
    java.util.TreeSet var32 = new java.util.TreeSet();
    boolean var33 = var30.addAll((java.util.Collection)var32);
    java.util.Enumeration var34 = java.util.Collections.enumeration((java.util.Collection)var30);
    java.util.Iterator var35 = var30.descendingIterator();
    java.util.List var36 = java.util.Collections.singletonList((java.lang.Object)var35);
    java.util.TreeSet var37 = new java.util.TreeSet();
    var37.clear();
    java.util.TreeSet var39 = new java.util.TreeSet();
    boolean var40 = var37.addAll((java.util.Collection)var39);
    java.util.Enumeration var41 = java.util.Collections.enumeration((java.util.Collection)var37);
    java.util.ArrayList var42 = java.util.Collections.list(var41);
    java.util.Collections.copy(var36, (java.util.List)var42);
    java.lang.Object var44 = var2.higher((java.lang.Object)var36);
    java.lang.Object var45 = var2.clone();
    java.util.TreeSet var46 = new java.util.TreeSet();
    var46.clear();
    java.util.TreeSet var48 = new java.util.TreeSet();
    boolean var49 = var46.addAll((java.util.Collection)var48);
    java.lang.Object var50 = var48.pollFirst();
    java.lang.Object var52 = var48.higher((java.lang.Object)10.0f);
    java.util.NavigableSet var53 = var48.descendingSet();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.NavigableSet var55 = var2.headSet((java.lang.Object)var53, true);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);

  }

  public void test63() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test63");


    java.util.TreeSet var0 = new java.util.TreeSet();
    var0.clear();
    java.util.TreeSet var2 = new java.util.TreeSet();
    boolean var3 = var0.addAll((java.util.Collection)var2);
    java.util.Enumeration var4 = java.util.Collections.enumeration((java.util.Collection)var0);
    java.util.TreeSet var5 = new java.util.TreeSet();
    var5.clear();
    java.util.TreeSet var7 = new java.util.TreeSet();
    boolean var8 = var5.addAll((java.util.Collection)var7);
    java.lang.Object var9 = var5.pollLast();
    java.util.TreeSet var10 = new java.util.TreeSet();
    java.lang.Object var11 = var5.floor((java.lang.Object)var10);
    java.lang.Object var13 = var10.floor((java.lang.Object)(byte)1);
    int var14 = java.util.Collections.frequency((java.util.Collection)var0, (java.lang.Object)var10);
    java.lang.Object[] var15 = var0.toArray();
    java.util.TreeSet var16 = new java.util.TreeSet((java.util.Collection)var0);
    java.util.Iterator var17 = var16.descendingIterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test64() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test64");


    java.util.TreeSet var0 = new java.util.TreeSet();
    var0.clear();
    java.util.TreeSet var2 = new java.util.TreeSet();
    boolean var3 = var0.addAll((java.util.Collection)var2);
    java.lang.Object var4 = var0.pollLast();
    java.util.TreeSet var5 = new java.util.TreeSet();
    java.lang.Object var6 = var0.floor((java.lang.Object)var5);
    java.lang.Object var7 = var5.pollLast();
    java.util.TreeSet var8 = new java.util.TreeSet();
    var8.clear();
    java.util.TreeSet var10 = new java.util.TreeSet();
    boolean var11 = var8.addAll((java.util.Collection)var10);
    java.util.Enumeration var12 = java.util.Collections.enumeration((java.util.Collection)var8);
    java.util.ArrayList var13 = java.util.Collections.list(var12);
    java.util.ArrayList var14 = java.util.Collections.list(var12);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.SortedSet var15 = var5.headSet((java.lang.Object)var12);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test65() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test65");


    java.util.TreeSet var0 = new java.util.TreeSet();
    var0.clear();
    java.util.TreeSet var2 = new java.util.TreeSet();
    boolean var3 = var0.addAll((java.util.Collection)var2);
    java.util.TreeSet var4 = new java.util.TreeSet();
    var4.clear();
    java.util.TreeSet var6 = new java.util.TreeSet();
    boolean var7 = var4.addAll((java.util.Collection)var6);
    java.lang.Object var8 = var6.pollFirst();
    java.lang.Object var10 = var6.higher((java.lang.Object)10.0f);
    boolean var11 = java.util.Collections.disjoint((java.util.Collection)var0, (java.util.Collection)var6);
    java.lang.Object var12 = var0.clone();
    java.lang.String var13 = var0.toString();
    java.util.TreeSet var14 = new java.util.TreeSet();
    var14.clear();
    java.util.TreeSet var16 = new java.util.TreeSet();
    boolean var17 = var14.addAll((java.util.Collection)var16);
    java.util.Enumeration var18 = java.util.Collections.enumeration((java.util.Collection)var14);
    java.util.TreeSet var19 = new java.util.TreeSet();
    var19.clear();
    java.util.TreeSet var21 = new java.util.TreeSet();
    boolean var22 = var19.addAll((java.util.Collection)var21);
    java.lang.Object var23 = var19.pollLast();
    java.util.TreeSet var24 = new java.util.TreeSet();
    java.lang.Object var25 = var19.floor((java.lang.Object)var24);
    java.lang.Object var27 = var24.floor((java.lang.Object)(byte)1);
    int var28 = java.util.Collections.frequency((java.util.Collection)var14, (java.lang.Object)var24);
    java.util.TreeSet var29 = new java.util.TreeSet();
    var29.clear();
    java.util.TreeSet var31 = new java.util.TreeSet();
    boolean var32 = var29.addAll((java.util.Collection)var31);
    java.lang.Object var33 = var31.clone();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.SortedSet var34 = var0.subSet((java.lang.Object)var14, var33);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "[]"+ "'", var13.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);

  }

  public void test66() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test66");


    java.util.TreeSet var0 = new java.util.TreeSet();
    var0.clear();
    java.util.TreeSet var2 = new java.util.TreeSet();
    var2.clear();
    java.util.TreeSet var4 = new java.util.TreeSet();
    boolean var5 = var2.addAll((java.util.Collection)var4);
    java.lang.Object var6 = var2.pollLast();
    java.util.TreeSet var7 = new java.util.TreeSet();
    java.lang.Object var8 = var2.floor((java.lang.Object)var7);
    boolean var9 = var0.containsAll((java.util.Collection)var7);
    java.util.TreeSet var10 = new java.util.TreeSet();
    var10.clear();
    java.util.TreeSet var12 = new java.util.TreeSet();
    boolean var13 = var10.addAll((java.util.Collection)var12);
    java.util.Enumeration var14 = java.util.Collections.enumeration((java.util.Collection)var10);
    java.util.NavigableSet var15 = var10.descendingSet();
    boolean var16 = var0.retainAll((java.util.Collection)var10);
    java.util.TreeSet var17 = new java.util.TreeSet();
    var17.clear();
    java.util.TreeSet var19 = new java.util.TreeSet();
    boolean var20 = var17.addAll((java.util.Collection)var19);
    java.util.TreeSet var21 = new java.util.TreeSet();
    var21.clear();
    java.util.TreeSet var23 = new java.util.TreeSet();
    boolean var24 = var21.addAll((java.util.Collection)var23);
    java.util.Enumeration var25 = java.util.Collections.enumeration((java.util.Collection)var21);
    java.util.Map var26 = java.util.Collections.singletonMap((java.lang.Object)var17, (java.lang.Object)var25);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.NavigableSet var28 = var10.headSet((java.lang.Object)var26, true);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);

  }

  public void test67() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test67");


    java.util.TreeSet var0 = new java.util.TreeSet();
    var0.clear();
    java.util.TreeSet var2 = new java.util.TreeSet();
    boolean var3 = var0.addAll((java.util.Collection)var2);
    java.lang.Object var4 = var0.pollLast();
    java.util.TreeSet var5 = new java.util.TreeSet();
    java.lang.Object var6 = var0.floor((java.lang.Object)var5);
    java.util.TreeSet var7 = new java.util.TreeSet();
    var7.clear();
    java.util.TreeSet var9 = new java.util.TreeSet();
    boolean var10 = var7.addAll((java.util.Collection)var9);
    java.util.Enumeration var11 = java.util.Collections.enumeration((java.util.Collection)var7);
    java.util.TreeSet var12 = new java.util.TreeSet((java.util.Collection)var7);
    java.util.Iterator var13 = var12.descendingIterator();
    java.lang.Object var14 = var5.higher((java.lang.Object)var13);
    java.util.TreeSet var15 = new java.util.TreeSet((java.util.SortedSet)var5);
    java.util.TreeSet var16 = new java.util.TreeSet();
    var16.clear();
    java.util.TreeSet var18 = new java.util.TreeSet();
    boolean var19 = var16.addAll((java.util.Collection)var18);
    java.util.Enumeration var20 = java.util.Collections.enumeration((java.util.Collection)var16);
    java.util.TreeSet var21 = new java.util.TreeSet((java.util.Collection)var16);
    java.util.Set var22 = java.util.Collections.unmodifiableSet((java.util.Set)var21);
    java.util.TreeSet var23 = new java.util.TreeSet();
    var23.clear();
    java.util.TreeSet var25 = new java.util.TreeSet();
    boolean var26 = var23.addAll((java.util.Collection)var25);
    java.lang.Object var27 = var23.pollLast();
    java.util.TreeSet var28 = new java.util.TreeSet();
    java.lang.Object var29 = var23.floor((java.lang.Object)var28);
    java.lang.Object var31 = var28.floor((java.lang.Object)(byte)1);
    java.util.TreeSet var32 = new java.util.TreeSet();
    var32.clear();
    java.util.TreeSet var34 = new java.util.TreeSet();
    boolean var35 = var32.addAll((java.util.Collection)var34);
    boolean var36 = var28.removeAll((java.util.Collection)var32);
    boolean var37 = var21.addAll((java.util.Collection)var28);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.SortedSet var38 = var15.headSet((java.lang.Object)var21);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);

  }

  public void test68() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test68");


    java.util.TreeSet var0 = new java.util.TreeSet();
    var0.clear();
    java.util.TreeSet var2 = new java.util.TreeSet();
    boolean var3 = var0.addAll((java.util.Collection)var2);
    java.lang.Object var4 = var0.pollLast();
    java.util.TreeSet var5 = new java.util.TreeSet();
    java.lang.Object var6 = var0.floor((java.lang.Object)var5);
    java.lang.Object var8 = var5.floor((java.lang.Object)(byte)1);
    java.util.TreeSet var9 = new java.util.TreeSet();
    var9.clear();
    java.util.TreeSet var11 = new java.util.TreeSet();
    boolean var12 = var9.addAll((java.util.Collection)var11);
    boolean var13 = var5.removeAll((java.util.Collection)var9);
    var5.clear();
    java.util.TreeSet var15 = new java.util.TreeSet();
    var15.clear();
    java.util.TreeSet var17 = new java.util.TreeSet();
    var17.clear();
    java.util.TreeSet var19 = new java.util.TreeSet();
    boolean var20 = var17.addAll((java.util.Collection)var19);
    java.lang.Object var21 = var17.pollLast();
    java.util.TreeSet var22 = new java.util.TreeSet();
    java.lang.Object var23 = var17.floor((java.lang.Object)var22);
    boolean var24 = var15.containsAll((java.util.Collection)var22);
    boolean var26 = var22.add((java.lang.Object)10.0d);
    java.util.Set var27 = java.util.Collections.synchronizedSet((java.util.Set)var22);
    java.util.TreeSet var28 = new java.util.TreeSet();
    var28.clear();
    java.util.TreeSet var30 = new java.util.TreeSet();
    boolean var31 = var28.addAll((java.util.Collection)var30);
    java.util.Enumeration var32 = java.util.Collections.enumeration((java.util.Collection)var28);
    java.util.ArrayList var33 = java.util.Collections.list(var32);
    java.util.ArrayList var34 = java.util.Collections.list(var32);
    java.util.Comparator var35 = java.util.Collections.reverseOrder();
    java.util.Collections.sort((java.util.List)var34, var35);
    java.lang.Object var37 = java.util.Collections.min((java.util.Collection)var22, var35);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var38 = java.util.Collections.min((java.util.Collection)var5, var35);
      fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var37 + "' != '" + 10.0d+ "'", var37.equals(10.0d));

  }

  public void test69() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test69");


    java.util.TreeSet var0 = new java.util.TreeSet();
    var0.clear();
    java.util.TreeSet var2 = new java.util.TreeSet();
    var2.clear();
    java.util.TreeSet var4 = new java.util.TreeSet();
    boolean var5 = var2.addAll((java.util.Collection)var4);
    java.lang.Object var6 = var2.pollLast();
    java.util.TreeSet var7 = new java.util.TreeSet();
    java.lang.Object var8 = var2.floor((java.lang.Object)var7);
    boolean var9 = var0.containsAll((java.util.Collection)var7);
    java.util.TreeSet var10 = new java.util.TreeSet();
    var10.clear();
    java.util.TreeSet var12 = new java.util.TreeSet();
    boolean var13 = var10.addAll((java.util.Collection)var12);
    java.util.Enumeration var14 = java.util.Collections.enumeration((java.util.Collection)var10);
    java.util.NavigableSet var15 = var10.descendingSet();
    boolean var16 = var0.retainAll((java.util.Collection)var10);
    java.util.Iterator var17 = var0.descendingIterator();
    boolean var18 = var0.isEmpty();
    java.lang.String var19 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "[]"+ "'", var19.equals("[]"));

  }

  public void test70() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test70");


    java.util.TreeSet var0 = new java.util.TreeSet();
    var0.clear();
    java.util.TreeSet var2 = new java.util.TreeSet();
    boolean var3 = var0.addAll((java.util.Collection)var2);
    java.util.Enumeration var4 = java.util.Collections.enumeration((java.util.Collection)var0);
    java.util.Iterator var5 = var0.descendingIterator();
    java.util.List var6 = java.util.Collections.singletonList((java.lang.Object)var5);
    java.util.TreeSet var7 = new java.util.TreeSet();
    var7.clear();
    java.util.TreeSet var9 = new java.util.TreeSet();
    boolean var10 = var7.addAll((java.util.Collection)var9);
    java.util.Enumeration var11 = java.util.Collections.enumeration((java.util.Collection)var7);
    java.util.ArrayList var12 = java.util.Collections.list(var11);
    java.util.Collections.copy(var6, (java.util.List)var12);
    java.util.TreeSet var15 = new java.util.TreeSet();
    var15.clear();
    java.util.TreeSet var17 = new java.util.TreeSet();
    boolean var18 = var15.addAll((java.util.Collection)var17);
    java.lang.Object var19 = var17.pollFirst();
    boolean var20 = java.util.Collections.replaceAll(var6, (java.lang.Object)1L, (java.lang.Object)var17);
    java.util.TreeSet var21 = new java.util.TreeSet();
    var21.clear();
    java.util.TreeSet var23 = new java.util.TreeSet();
    var23.clear();
    java.util.TreeSet var25 = new java.util.TreeSet();
    boolean var26 = var23.addAll((java.util.Collection)var25);
    java.lang.Object var27 = var23.pollLast();
    java.util.TreeSet var28 = new java.util.TreeSet();
    java.lang.Object var29 = var23.floor((java.lang.Object)var28);
    boolean var30 = var21.containsAll((java.util.Collection)var28);
    boolean var32 = var28.add((java.lang.Object)10.0d);
    java.util.Set var33 = java.util.Collections.synchronizedSet((java.util.Set)var28);
    boolean var34 = var17.containsAll((java.util.Collection)var33);
    java.util.TreeSet var35 = new java.util.TreeSet();
    var35.clear();
    java.util.TreeSet var37 = new java.util.TreeSet();
    boolean var38 = var35.addAll((java.util.Collection)var37);
    java.util.TreeSet var39 = new java.util.TreeSet();
    var39.clear();
    java.util.TreeSet var41 = new java.util.TreeSet();
    boolean var42 = var39.addAll((java.util.Collection)var41);
    java.lang.Object var43 = var41.pollFirst();
    java.lang.Object var45 = var41.higher((java.lang.Object)10.0f);
    boolean var46 = java.util.Collections.disjoint((java.util.Collection)var35, (java.util.Collection)var41);
    java.lang.Object var47 = var35.clone();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.NavigableSet var51 = var17.subSet((java.lang.Object)var35, false, (java.lang.Object)(short)(-1), false);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);

  }

  public void test71() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test71");


    java.util.TreeSet var1 = new java.util.TreeSet();
    java.util.TreeSet var2 = new java.util.TreeSet();
    var2.clear();
    java.util.TreeSet var4 = new java.util.TreeSet();
    boolean var5 = var2.addAll((java.util.Collection)var4);
    java.util.Enumeration var6 = java.util.Collections.enumeration((java.util.Collection)var2);
    java.util.TreeSet var7 = new java.util.TreeSet((java.util.Collection)var2);
    java.lang.Object var9 = var2.floor((java.lang.Object)false);
    java.util.TreeSet var10 = new java.util.TreeSet();
    var10.clear();
    java.util.TreeSet var12 = new java.util.TreeSet();
    boolean var13 = var10.addAll((java.util.Collection)var12);
    java.util.Enumeration var14 = java.util.Collections.enumeration((java.util.Collection)var10);
    java.util.NavigableSet var15 = var10.descendingSet();
    boolean var16 = var2.addAll((java.util.Collection)var15);
    java.util.Map var17 = java.util.Collections.singletonMap((java.lang.Object)var1, (java.lang.Object)var2);
    java.util.SortedSet var18 = java.util.Collections.unmodifiableSortedSet((java.util.SortedSet)var1);
    java.util.TreeSet var19 = new java.util.TreeSet();
    var19.clear();
    java.util.TreeSet var21 = new java.util.TreeSet();
    boolean var22 = var19.addAll((java.util.Collection)var21);
    java.util.Enumeration var23 = java.util.Collections.enumeration((java.util.Collection)var19);
    java.util.ArrayList var24 = java.util.Collections.list(var23);
    java.util.ArrayList var25 = java.util.Collections.list(var23);
    java.util.Map var26 = java.util.Collections.singletonMap((java.lang.Object)var1, (java.lang.Object)var25);
    java.util.List var27 = java.util.Collections.nCopies(1, (java.lang.Object)var25);
    java.util.List var28 = java.util.Collections.unmodifiableList(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);

  }

  public void test72() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test72");


    java.util.TreeSet var0 = new java.util.TreeSet();
    var0.clear();
    java.util.TreeSet var2 = new java.util.TreeSet();
    boolean var3 = var0.addAll((java.util.Collection)var2);
    java.lang.Object var4 = var0.pollLast();
    java.util.TreeSet var5 = new java.util.TreeSet();
    java.lang.Object var6 = var0.floor((java.lang.Object)var5);
    java.util.TreeSet var7 = new java.util.TreeSet();
    var7.clear();
    java.util.TreeSet var9 = new java.util.TreeSet();
    boolean var10 = var7.addAll((java.util.Collection)var9);
    java.util.Enumeration var11 = java.util.Collections.enumeration((java.util.Collection)var7);
    java.util.TreeSet var12 = new java.util.TreeSet((java.util.Collection)var7);
    java.util.Iterator var13 = var12.descendingIterator();
    java.lang.Object var14 = var5.higher((java.lang.Object)var13);
    java.util.TreeSet var15 = new java.util.TreeSet((java.util.SortedSet)var5);
    java.util.TreeSet var16 = new java.util.TreeSet();
    var16.clear();
    java.util.TreeSet var18 = new java.util.TreeSet();
    boolean var19 = var16.addAll((java.util.Collection)var18);
    java.util.Enumeration var20 = java.util.Collections.enumeration((java.util.Collection)var16);
    java.util.TreeSet var21 = new java.util.TreeSet((java.util.Collection)var16);
    java.util.Set var22 = java.util.Collections.unmodifiableSet((java.util.Set)var21);
    java.util.TreeSet var23 = new java.util.TreeSet();
    var23.clear();
    java.util.TreeSet var25 = new java.util.TreeSet();
    boolean var26 = var23.addAll((java.util.Collection)var25);
    java.lang.Object var27 = var23.pollLast();
    java.util.TreeSet var28 = new java.util.TreeSet();
    java.lang.Object var29 = var23.floor((java.lang.Object)var28);
    java.lang.Object var31 = var28.floor((java.lang.Object)(byte)1);
    java.util.TreeSet var32 = new java.util.TreeSet();
    var32.clear();
    java.util.TreeSet var34 = new java.util.TreeSet();
    boolean var35 = var32.addAll((java.util.Collection)var34);
    boolean var36 = var28.removeAll((java.util.Collection)var32);
    boolean var37 = var21.addAll((java.util.Collection)var28);
    java.lang.Object var38 = var21.pollLast();
    java.util.Collection var39 = java.util.Collections.unmodifiableCollection((java.util.Collection)var21);
    java.util.TreeSet var40 = new java.util.TreeSet();
    var40.clear();
    java.util.TreeSet var42 = new java.util.TreeSet();
    boolean var43 = var40.addAll((java.util.Collection)var42);
    java.lang.Object var44 = var40.pollLast();
    java.util.TreeSet var45 = new java.util.TreeSet();
    java.lang.Object var46 = var40.floor((java.lang.Object)var45);
    java.util.TreeSet var47 = new java.util.TreeSet();
    var47.clear();
    java.util.TreeSet var49 = new java.util.TreeSet();
    boolean var50 = var47.addAll((java.util.Collection)var49);
    java.util.Enumeration var51 = java.util.Collections.enumeration((java.util.Collection)var47);
    java.util.TreeSet var52 = new java.util.TreeSet((java.util.Collection)var47);
    java.util.Iterator var53 = var52.descendingIterator();
    boolean var54 = var52.isEmpty();
    java.util.NavigableSet var56 = var40.headSet((java.lang.Object)var54, false);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.SortedSet var57 = var15.subSet((java.lang.Object)var21, (java.lang.Object)var54);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);

  }

  public void test73() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test73");


    java.util.TreeSet var0 = new java.util.TreeSet();
    var0.clear();
    java.util.TreeSet var2 = new java.util.TreeSet();
    boolean var3 = var0.addAll((java.util.Collection)var2);
    java.util.TreeSet var4 = new java.util.TreeSet();
    var4.clear();
    java.util.TreeSet var6 = new java.util.TreeSet();
    boolean var7 = var4.addAll((java.util.Collection)var6);
    java.util.Enumeration var8 = java.util.Collections.enumeration((java.util.Collection)var4);
    java.util.Map var9 = java.util.Collections.singletonMap((java.lang.Object)var0, (java.lang.Object)var8);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var10 = var0.first();
      fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test74() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test74");


    java.util.TreeSet var0 = new java.util.TreeSet();
    var0.clear();
    java.util.TreeSet var2 = new java.util.TreeSet();
    boolean var3 = var0.addAll((java.util.Collection)var2);
    java.lang.Object var4 = var2.pollFirst();
    boolean var6 = var2.remove((java.lang.Object)'#');
    java.util.TreeSet var7 = new java.util.TreeSet();
    var7.clear();
    java.util.TreeSet var9 = new java.util.TreeSet();
    boolean var10 = var7.addAll((java.util.Collection)var9);
    java.util.Enumeration var11 = java.util.Collections.enumeration((java.util.Collection)var7);
    java.util.Iterator var12 = var7.descendingIterator();
    java.lang.Object var13 = var2.higher((java.lang.Object)var12);
    java.util.TreeSet var14 = new java.util.TreeSet();
    var14.clear();
    java.util.TreeSet var16 = new java.util.TreeSet();
    boolean var17 = var14.addAll((java.util.Collection)var16);
    java.util.Enumeration var18 = java.util.Collections.enumeration((java.util.Collection)var14);
    java.util.TreeSet var19 = new java.util.TreeSet((java.util.Collection)var14);
    java.lang.Object var21 = var14.floor((java.lang.Object)false);
    java.util.TreeSet var22 = new java.util.TreeSet();
    var22.clear();
    java.util.TreeSet var24 = new java.util.TreeSet();
    boolean var25 = var22.addAll((java.util.Collection)var24);
    java.util.Enumeration var26 = java.util.Collections.enumeration((java.util.Collection)var22);
    java.util.NavigableSet var27 = var22.descendingSet();
    boolean var28 = var14.addAll((java.util.Collection)var27);
    java.lang.Object var29 = var2.floor((java.lang.Object)var28);
    java.lang.Object var30 = var2.clone();
    var2.clear();
    java.lang.Object var32 = var2.pollLast();
    java.util.TreeSet var33 = new java.util.TreeSet();
    var33.clear();
    java.util.TreeSet var35 = new java.util.TreeSet();
    boolean var36 = var33.addAll((java.util.Collection)var35);
    java.lang.Object var37 = var35.pollFirst();
    java.lang.Object var39 = var35.higher((java.lang.Object)10.0f);
    java.util.Iterator var40 = var35.descendingIterator();
    java.util.TreeSet var41 = new java.util.TreeSet();
    var41.clear();
    java.util.TreeSet var43 = new java.util.TreeSet();
    boolean var44 = var41.addAll((java.util.Collection)var43);
    java.util.Enumeration var45 = java.util.Collections.enumeration((java.util.Collection)var41);
    java.util.TreeSet var46 = new java.util.TreeSet((java.util.Collection)var41);
    java.lang.Object var48 = var41.floor((java.lang.Object)false);
    java.lang.Object var50 = var41.floor((java.lang.Object)(short)(-1));
    java.util.TreeSet var51 = new java.util.TreeSet();
    var51.clear();
    java.util.TreeSet var53 = new java.util.TreeSet();
    boolean var54 = var51.addAll((java.util.Collection)var53);
    java.util.Enumeration var55 = java.util.Collections.enumeration((java.util.Collection)var51);
    java.util.TreeSet var56 = new java.util.TreeSet((java.util.Collection)var51);
    java.lang.Object var58 = var51.floor((java.lang.Object)false);
    java.util.TreeSet var59 = new java.util.TreeSet();
    var59.clear();
    java.util.TreeSet var61 = new java.util.TreeSet();
    boolean var62 = var59.addAll((java.util.Collection)var61);
    java.util.Enumeration var63 = java.util.Collections.enumeration((java.util.Collection)var59);
    java.util.NavigableSet var64 = var59.descendingSet();
    boolean var65 = var51.addAll((java.util.Collection)var64);
    java.lang.Object[] var66 = new java.lang.Object[] { var65};
    boolean var67 = java.util.Collections.addAll((java.util.Collection)var41, var66);
    java.lang.Object[] var68 = var35.toArray(var66);
    boolean var69 = java.util.Collections.addAll((java.util.Collection)var2, var68);

  }

  public void test75() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test75");


    java.util.TreeSet var0 = new java.util.TreeSet();
    var0.clear();
    java.util.TreeSet var2 = new java.util.TreeSet();
    boolean var3 = var0.addAll((java.util.Collection)var2);
    java.util.Enumeration var4 = java.util.Collections.enumeration((java.util.Collection)var0);
    java.util.Iterator var5 = var0.descendingIterator();
    java.util.List var6 = java.util.Collections.singletonList((java.lang.Object)var5);
    java.util.Collections.rotate(var6, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test76() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test76");


    java.util.TreeSet var0 = new java.util.TreeSet();
    var0.clear();
    java.util.TreeSet var2 = new java.util.TreeSet();
    boolean var3 = var0.addAll((java.util.Collection)var2);
    java.lang.Object var4 = var2.pollFirst();
    java.util.TreeSet var5 = new java.util.TreeSet();
    var5.clear();
    java.util.TreeSet var7 = new java.util.TreeSet();
    boolean var8 = var5.addAll((java.util.Collection)var7);
    java.util.Map var9 = java.util.Collections.singletonMap((java.lang.Object)var2, (java.lang.Object)var5);
    java.util.TreeSet var10 = new java.util.TreeSet();
    var10.clear();
    java.util.TreeSet var12 = new java.util.TreeSet();
    boolean var13 = var10.addAll((java.util.Collection)var12);
    java.util.Enumeration var14 = java.util.Collections.enumeration((java.util.Collection)var10);
    java.util.Iterator var15 = var10.descendingIterator();
    java.util.List var16 = java.util.Collections.singletonList((java.lang.Object)var15);
    java.lang.Object var17 = var2.ceiling((java.lang.Object)var15);
    java.util.TreeSet var18 = new java.util.TreeSet();
    var18.clear();
    java.util.TreeSet var20 = new java.util.TreeSet();
    boolean var21 = var18.addAll((java.util.Collection)var20);
    java.lang.Object var22 = var20.pollFirst();
    java.lang.Object var24 = var20.higher((java.lang.Object)10.0f);
    java.util.Iterator var25 = var20.descendingIterator();
    java.util.TreeSet var26 = new java.util.TreeSet();
    var26.clear();
    java.util.TreeSet var28 = new java.util.TreeSet();
    boolean var29 = var26.addAll((java.util.Collection)var28);
    java.util.Enumeration var30 = java.util.Collections.enumeration((java.util.Collection)var26);
    java.util.TreeSet var31 = new java.util.TreeSet((java.util.Collection)var26);
    java.lang.Object var33 = var26.floor((java.lang.Object)false);
    java.lang.Object var35 = var26.floor((java.lang.Object)(short)(-1));
    java.util.TreeSet var36 = new java.util.TreeSet();
    var36.clear();
    java.util.TreeSet var38 = new java.util.TreeSet();
    boolean var39 = var36.addAll((java.util.Collection)var38);
    java.util.Enumeration var40 = java.util.Collections.enumeration((java.util.Collection)var36);
    java.util.TreeSet var41 = new java.util.TreeSet((java.util.Collection)var36);
    java.lang.Object var43 = var36.floor((java.lang.Object)false);
    java.util.TreeSet var44 = new java.util.TreeSet();
    var44.clear();
    java.util.TreeSet var46 = new java.util.TreeSet();
    boolean var47 = var44.addAll((java.util.Collection)var46);
    java.util.Enumeration var48 = java.util.Collections.enumeration((java.util.Collection)var44);
    java.util.NavigableSet var49 = var44.descendingSet();
    boolean var50 = var36.addAll((java.util.Collection)var49);
    java.lang.Object[] var51 = new java.lang.Object[] { var50};
    boolean var52 = java.util.Collections.addAll((java.util.Collection)var26, var51);
    java.lang.Object[] var53 = var20.toArray(var51);
    java.util.Set var54 = java.util.Collections.synchronizedSet((java.util.Set)var20);
    boolean var55 = var2.addAll((java.util.Collection)var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == false);

  }

  public void test77() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test77");


    java.util.ListIterator var0 = java.util.Collections.emptyListIterator();
    java.util.Set var1 = java.util.Collections.singleton((java.lang.Object)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test78() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test78");


    java.util.TreeSet var0 = new java.util.TreeSet();
    var0.clear();
    java.util.TreeSet var2 = new java.util.TreeSet();
    boolean var3 = var0.addAll((java.util.Collection)var2);
    java.lang.Object var4 = var2.pollFirst();
    java.lang.Object var6 = var2.higher((java.lang.Object)10.0f);
    java.util.TreeSet var7 = new java.util.TreeSet();
    var7.clear();
    java.util.TreeSet var9 = new java.util.TreeSet();
    boolean var10 = var7.addAll((java.util.Collection)var9);
    java.util.TreeSet var11 = new java.util.TreeSet();
    var11.clear();
    java.util.TreeSet var13 = new java.util.TreeSet();
    boolean var14 = var11.addAll((java.util.Collection)var13);
    java.util.Enumeration var15 = java.util.Collections.enumeration((java.util.Collection)var11);
    java.util.Map var16 = java.util.Collections.singletonMap((java.lang.Object)var7, (java.lang.Object)var15);
    java.util.TreeSet var19 = new java.util.TreeSet();
    var19.clear();
    java.util.TreeSet var21 = new java.util.TreeSet();
    boolean var22 = var19.addAll((java.util.Collection)var21);
    java.util.Enumeration var23 = java.util.Collections.enumeration((java.util.Collection)var19);
    java.util.ArrayList var24 = java.util.Collections.list(var23);
    java.util.ArrayList var25 = java.util.Collections.list(var23);
    java.util.TreeSet var26 = new java.util.TreeSet();
    var26.clear();
    java.util.TreeSet var28 = new java.util.TreeSet();
    boolean var29 = var26.addAll((java.util.Collection)var28);
    java.util.Enumeration var30 = java.util.Collections.enumeration((java.util.Collection)var26);
    java.util.Iterator var31 = var26.descendingIterator();
    java.util.List var32 = java.util.Collections.singletonList((java.lang.Object)var31);
    java.util.TreeSet var33 = new java.util.TreeSet();
    var33.clear();
    java.util.TreeSet var35 = new java.util.TreeSet();
    boolean var36 = var33.addAll((java.util.Collection)var35);
    java.util.Enumeration var37 = java.util.Collections.enumeration((java.util.Collection)var33);
    java.util.ArrayList var38 = java.util.Collections.list(var37);
    java.util.Collections.copy(var32, (java.util.List)var38);
    java.util.TreeSet var41 = new java.util.TreeSet();
    var41.clear();
    java.util.TreeSet var43 = new java.util.TreeSet();
    boolean var44 = var41.addAll((java.util.Collection)var43);
    java.lang.Object var45 = var43.pollFirst();
    boolean var46 = java.util.Collections.replaceAll(var32, (java.lang.Object)1L, (java.lang.Object)var43);
    java.util.Collections.fill((java.util.List)var25, (java.lang.Object)var43);
    java.util.List var48 = java.util.Collections.nCopies(10, (java.lang.Object)var25);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.NavigableSet var50 = var2.subSet((java.lang.Object)var16, true, (java.lang.Object)10, false);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);

  }

  public void test79() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test79");


    java.util.TreeSet var0 = new java.util.TreeSet();
    var0.clear();
    java.util.TreeSet var2 = new java.util.TreeSet();
    var2.clear();
    java.util.TreeSet var4 = new java.util.TreeSet();
    boolean var5 = var2.addAll((java.util.Collection)var4);
    java.lang.Object var6 = var2.pollLast();
    java.util.TreeSet var7 = new java.util.TreeSet();
    java.lang.Object var8 = var2.floor((java.lang.Object)var7);
    boolean var9 = var0.containsAll((java.util.Collection)var7);
    boolean var11 = var7.add((java.lang.Object)10.0d);
    java.util.Set var12 = java.util.Collections.synchronizedSet((java.util.Set)var7);
    java.util.TreeSet var13 = new java.util.TreeSet();
    var13.clear();
    java.util.TreeSet var15 = new java.util.TreeSet();
    boolean var16 = var13.addAll((java.util.Collection)var15);
    java.lang.Object var17 = var15.pollFirst();
    java.util.TreeSet var18 = new java.util.TreeSet();
    var18.clear();
    java.util.TreeSet var20 = new java.util.TreeSet();
    boolean var21 = var18.addAll((java.util.Collection)var20);
    java.util.Map var22 = java.util.Collections.singletonMap((java.lang.Object)var15, (java.lang.Object)var18);
    java.util.Iterator var23 = var15.iterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var24 = var7.add((java.lang.Object)var23);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);

  }

  public void test80() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test80");


    java.util.TreeSet var0 = new java.util.TreeSet();
    var0.clear();
    java.util.TreeSet var2 = new java.util.TreeSet();
    boolean var3 = var0.addAll((java.util.Collection)var2);
    java.util.Enumeration var4 = java.util.Collections.enumeration((java.util.Collection)var0);
    java.util.Iterator var5 = var0.descendingIterator();
    java.util.List var6 = java.util.Collections.singletonList((java.lang.Object)var5);
    java.util.List var7 = java.util.Collections.unmodifiableList(var6);
    java.util.Collections.rotate(var7, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test81() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test81");


    java.util.TreeSet var0 = new java.util.TreeSet();
    var0.clear();
    java.util.TreeSet var2 = new java.util.TreeSet();
    boolean var3 = var0.addAll((java.util.Collection)var2);
    java.lang.Object var4 = var0.pollLast();
    java.util.TreeSet var5 = new java.util.TreeSet();
    java.lang.Object var6 = var0.floor((java.lang.Object)var5);
    java.util.TreeSet var7 = new java.util.TreeSet();
    var7.clear();
    java.util.TreeSet var9 = new java.util.TreeSet();
    boolean var10 = var7.addAll((java.util.Collection)var9);
    java.util.Enumeration var11 = java.util.Collections.enumeration((java.util.Collection)var7);
    java.util.TreeSet var12 = new java.util.TreeSet((java.util.Collection)var7);
    java.util.Iterator var13 = var12.descendingIterator();
    boolean var14 = var12.isEmpty();
    java.util.NavigableSet var16 = var0.headSet((java.lang.Object)var14, false);
    java.util.SortedSet var17 = java.util.Collections.synchronizedSortedSet((java.util.SortedSet)var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test82() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test82");


    java.util.TreeSet var0 = new java.util.TreeSet();
    var0.clear();
    java.util.TreeSet var2 = new java.util.TreeSet();
    boolean var3 = var0.addAll((java.util.Collection)var2);
    java.util.Enumeration var4 = java.util.Collections.enumeration((java.util.Collection)var0);
    java.util.ArrayList var5 = java.util.Collections.list(var4);
    java.util.ArrayList var6 = java.util.Collections.list(var4);
    java.util.ArrayList var7 = java.util.Collections.list(var4);
    java.lang.Object[] var8 = var7.toArray();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test83() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test83");


    java.util.TreeSet var0 = new java.util.TreeSet();
    var0.clear();
    java.util.TreeSet var2 = new java.util.TreeSet();
    var2.clear();
    java.util.TreeSet var4 = new java.util.TreeSet();
    boolean var5 = var2.addAll((java.util.Collection)var4);
    java.lang.Object var6 = var2.pollLast();
    java.util.TreeSet var7 = new java.util.TreeSet();
    java.lang.Object var8 = var2.floor((java.lang.Object)var7);
    boolean var9 = var0.containsAll((java.util.Collection)var7);
    boolean var11 = var7.add((java.lang.Object)10.0d);
    java.util.Set var13 = java.util.Collections.singleton((java.lang.Object)0L);
    java.util.Collection var14 = java.util.Collections.synchronizedCollection((java.util.Collection)var13);
    java.util.Set var15 = java.util.Collections.singleton((java.lang.Object)var14);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var16 = var7.contains((java.lang.Object)var15);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test84() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test84");


    java.util.TreeSet var0 = new java.util.TreeSet();
    var0.clear();
    java.util.TreeSet var2 = new java.util.TreeSet();
    boolean var3 = var0.addAll((java.util.Collection)var2);
    java.lang.Object var4 = var0.pollLast();
    java.util.TreeSet var5 = new java.util.TreeSet();
    java.lang.Object var6 = var0.floor((java.lang.Object)var5);
    java.util.TreeSet var7 = new java.util.TreeSet();
    var7.clear();
    java.util.TreeSet var9 = new java.util.TreeSet();
    boolean var10 = var7.addAll((java.util.Collection)var9);
    java.util.Enumeration var11 = java.util.Collections.enumeration((java.util.Collection)var7);
    java.util.TreeSet var12 = new java.util.TreeSet((java.util.Collection)var7);
    java.util.Iterator var13 = var12.descendingIterator();
    java.lang.Object var14 = var5.higher((java.lang.Object)var13);
    java.util.TreeSet var15 = new java.util.TreeSet((java.util.SortedSet)var5);
    java.util.List var16 = java.util.Collections.singletonList((java.lang.Object)var5);
    java.util.List var17 = java.util.Collections.singletonList((java.lang.Object)var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test85() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test85");


    java.util.TreeSet var0 = new java.util.TreeSet();
    var0.clear();
    java.util.TreeSet var2 = new java.util.TreeSet();
    boolean var3 = var0.addAll((java.util.Collection)var2);
    java.util.Enumeration var4 = java.util.Collections.enumeration((java.util.Collection)var0);
    java.util.ArrayList var5 = java.util.Collections.list(var4);
    java.util.ArrayList var6 = java.util.Collections.list(var4);
    java.lang.String var7 = var6.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "[]"+ "'", var7.equals("[]"));

  }

  public void test86() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test86");


    java.util.TreeSet var0 = new java.util.TreeSet();
    var0.clear();
    java.util.TreeSet var2 = new java.util.TreeSet();
    var2.clear();
    java.util.TreeSet var4 = new java.util.TreeSet();
    boolean var5 = var2.addAll((java.util.Collection)var4);
    java.lang.Object var6 = var2.pollLast();
    java.util.TreeSet var7 = new java.util.TreeSet();
    java.lang.Object var8 = var2.floor((java.lang.Object)var7);
    boolean var9 = var0.containsAll((java.util.Collection)var7);
    java.util.Set var10 = java.util.Collections.synchronizedSet((java.util.Set)var0);
    java.lang.Object var11 = var0.clone();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var12 = var0.first();
      fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test87() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test87");


    java.util.TreeSet var0 = new java.util.TreeSet();
    var0.clear();
    java.util.TreeSet var2 = new java.util.TreeSet();
    boolean var3 = var0.addAll((java.util.Collection)var2);
    java.util.Enumeration var4 = java.util.Collections.enumeration((java.util.Collection)var0);
    java.util.TreeSet var5 = new java.util.TreeSet((java.util.Collection)var0);
    java.util.Set var6 = java.util.Collections.unmodifiableSet((java.util.Set)var5);
    var5.clear();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test88() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test88");


    java.util.TreeSet var0 = new java.util.TreeSet();
    var0.clear();
    java.util.TreeSet var2 = new java.util.TreeSet();
    boolean var3 = var0.addAll((java.util.Collection)var2);
    java.lang.Object var4 = var0.pollLast();
    java.util.TreeSet var5 = new java.util.TreeSet();
    java.lang.Object var6 = var0.floor((java.lang.Object)var5);
    java.util.TreeSet var7 = new java.util.TreeSet();
    var7.clear();
    java.util.TreeSet var9 = new java.util.TreeSet();
    boolean var10 = var7.addAll((java.util.Collection)var9);
    java.util.Enumeration var11 = java.util.Collections.enumeration((java.util.Collection)var7);
    java.lang.String var12 = var7.toString();
    boolean var13 = java.util.Collections.disjoint((java.util.Collection)var0, (java.util.Collection)var7);
    java.util.TreeSet var14 = new java.util.TreeSet();
    var14.clear();
    java.util.TreeSet var16 = new java.util.TreeSet();
    boolean var17 = var14.addAll((java.util.Collection)var16);
    java.lang.Object var18 = var16.pollFirst();
    boolean var20 = var16.remove((java.lang.Object)'#');
    java.util.TreeSet var21 = new java.util.TreeSet();
    var21.clear();
    java.util.TreeSet var23 = new java.util.TreeSet();
    boolean var24 = var21.addAll((java.util.Collection)var23);
    java.util.Enumeration var25 = java.util.Collections.enumeration((java.util.Collection)var21);
    java.util.Iterator var26 = var21.descendingIterator();
    java.lang.Object var27 = var16.higher((java.lang.Object)var26);
    java.util.TreeSet var28 = new java.util.TreeSet();
    var28.clear();
    java.util.TreeSet var30 = new java.util.TreeSet();
    boolean var31 = var28.addAll((java.util.Collection)var30);
    java.util.Enumeration var32 = java.util.Collections.enumeration((java.util.Collection)var28);
    java.util.TreeSet var33 = new java.util.TreeSet((java.util.Collection)var28);
    java.lang.Object var35 = var28.floor((java.lang.Object)false);
    java.util.TreeSet var36 = new java.util.TreeSet();
    var36.clear();
    java.util.TreeSet var38 = new java.util.TreeSet();
    boolean var39 = var36.addAll((java.util.Collection)var38);
    java.util.Enumeration var40 = java.util.Collections.enumeration((java.util.Collection)var36);
    java.util.NavigableSet var41 = var36.descendingSet();
    boolean var42 = var28.addAll((java.util.Collection)var41);
    java.lang.Object var43 = var16.floor((java.lang.Object)var42);
    java.util.TreeSet var44 = new java.util.TreeSet();
    var44.clear();
    java.util.TreeSet var46 = new java.util.TreeSet();
    boolean var47 = var44.addAll((java.util.Collection)var46);
    java.util.Enumeration var48 = java.util.Collections.enumeration((java.util.Collection)var44);
    java.util.Iterator var49 = var44.descendingIterator();
    java.util.List var50 = java.util.Collections.singletonList((java.lang.Object)var49);
    java.util.TreeSet var51 = new java.util.TreeSet();
    var51.clear();
    java.util.TreeSet var53 = new java.util.TreeSet();
    boolean var54 = var51.addAll((java.util.Collection)var53);
    java.util.Enumeration var55 = java.util.Collections.enumeration((java.util.Collection)var51);
    java.util.ArrayList var56 = java.util.Collections.list(var55);
    java.util.Collections.copy(var50, (java.util.List)var56);
    java.lang.Object var58 = var16.higher((java.lang.Object)var50);
    java.lang.Object var59 = var16.clone();
    boolean var60 = var0.retainAll((java.util.Collection)var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "[]"+ "'", var12.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == false);

  }

  public void test89() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test89");


    java.util.TreeSet var0 = new java.util.TreeSet();
    var0.clear();
    java.util.TreeSet var2 = new java.util.TreeSet();
    var2.clear();
    java.util.TreeSet var4 = new java.util.TreeSet();
    boolean var5 = var2.addAll((java.util.Collection)var4);
    java.lang.Object var6 = var2.pollLast();
    java.util.TreeSet var7 = new java.util.TreeSet();
    java.lang.Object var8 = var2.floor((java.lang.Object)var7);
    boolean var9 = var0.containsAll((java.util.Collection)var7);
    java.util.Set var10 = java.util.Collections.synchronizedSet((java.util.Set)var0);
    java.lang.Object var11 = var0.clone();
    java.util.TreeSet var12 = new java.util.TreeSet();
    var12.clear();
    java.util.TreeSet var14 = new java.util.TreeSet();
    var14.clear();
    java.util.TreeSet var16 = new java.util.TreeSet();
    boolean var17 = var14.addAll((java.util.Collection)var16);
    java.lang.Object var18 = var14.pollLast();
    java.util.TreeSet var19 = new java.util.TreeSet();
    java.lang.Object var20 = var14.floor((java.lang.Object)var19);
    boolean var21 = var12.containsAll((java.util.Collection)var19);
    java.util.Set var22 = java.util.Collections.synchronizedSet((java.util.Set)var12);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.NavigableSet var24 = var0.tailSet((java.lang.Object)var12, true);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);

  }

  public void test90() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test90");


    java.util.TreeSet var0 = new java.util.TreeSet();
    var0.clear();
    java.util.TreeSet var2 = new java.util.TreeSet();
    boolean var3 = var0.addAll((java.util.Collection)var2);
    java.util.Enumeration var4 = java.util.Collections.enumeration((java.util.Collection)var0);
    java.util.Iterator var5 = var0.descendingIterator();
    java.util.List var6 = java.util.Collections.singletonList((java.lang.Object)var5);
    java.util.List var7 = java.util.Collections.unmodifiableList(var6);
    java.util.List var8 = java.util.Collections.unmodifiableList(var6);
    java.util.Collections.reverse(var8);
    java.util.TreeSet var10 = new java.util.TreeSet();
    var10.clear();
    java.util.TreeSet var12 = new java.util.TreeSet();
    boolean var13 = var10.addAll((java.util.Collection)var12);
    java.util.Enumeration var14 = java.util.Collections.enumeration((java.util.Collection)var10);
    java.util.Iterator var15 = var10.descendingIterator();
    java.util.List var16 = java.util.Collections.singletonList((java.lang.Object)var15);
    java.util.List var17 = java.util.Collections.unmodifiableList(var16);
    java.util.List var18 = java.util.Collections.unmodifiableList(var16);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var19 = java.util.Collections.binarySearch(var8, (java.lang.Object)var16);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);

  }

  public void test91() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test91");


    java.util.TreeSet var0 = new java.util.TreeSet();
    var0.clear();
    java.util.TreeSet var2 = new java.util.TreeSet();
    boolean var3 = var0.addAll((java.util.Collection)var2);
    java.lang.Object var4 = var2.pollFirst();
    java.lang.Object var6 = var2.higher((java.lang.Object)10.0f);
    java.util.Iterator var7 = var2.descendingIterator();
    java.util.TreeSet var8 = new java.util.TreeSet();
    var8.clear();
    java.util.TreeSet var10 = new java.util.TreeSet();
    boolean var11 = var8.addAll((java.util.Collection)var10);
    java.util.Enumeration var12 = java.util.Collections.enumeration((java.util.Collection)var8);
    java.util.TreeSet var13 = new java.util.TreeSet((java.util.Collection)var8);
    java.lang.Object var15 = var8.floor((java.lang.Object)false);
    java.lang.Object var17 = var8.floor((java.lang.Object)(short)(-1));
    java.util.TreeSet var18 = new java.util.TreeSet();
    var18.clear();
    java.util.TreeSet var20 = new java.util.TreeSet();
    boolean var21 = var18.addAll((java.util.Collection)var20);
    java.util.Enumeration var22 = java.util.Collections.enumeration((java.util.Collection)var18);
    java.util.TreeSet var23 = new java.util.TreeSet((java.util.Collection)var18);
    java.lang.Object var25 = var18.floor((java.lang.Object)false);
    java.util.TreeSet var26 = new java.util.TreeSet();
    var26.clear();
    java.util.TreeSet var28 = new java.util.TreeSet();
    boolean var29 = var26.addAll((java.util.Collection)var28);
    java.util.Enumeration var30 = java.util.Collections.enumeration((java.util.Collection)var26);
    java.util.NavigableSet var31 = var26.descendingSet();
    boolean var32 = var18.addAll((java.util.Collection)var31);
    java.lang.Object[] var33 = new java.lang.Object[] { var32};
    boolean var34 = java.util.Collections.addAll((java.util.Collection)var8, var33);
    java.lang.Object[] var35 = var2.toArray(var33);
    java.util.Set var36 = java.util.Collections.synchronizedSet((java.util.Set)var2);
    java.util.Collection var37 = java.util.Collections.unmodifiableCollection((java.util.Collection)var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);

  }

  public void test92() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test92");


    java.util.TreeSet var0 = new java.util.TreeSet();
    var0.clear();
    java.util.TreeSet var2 = new java.util.TreeSet();
    boolean var3 = var0.addAll((java.util.Collection)var2);
    java.util.TreeSet var4 = new java.util.TreeSet();
    var4.clear();
    java.util.TreeSet var6 = new java.util.TreeSet();
    boolean var7 = var4.addAll((java.util.Collection)var6);
    java.util.Enumeration var8 = java.util.Collections.enumeration((java.util.Collection)var4);
    java.util.Map var9 = java.util.Collections.singletonMap((java.lang.Object)var0, (java.lang.Object)var8);
    java.util.TreeSet var10 = new java.util.TreeSet();
    var10.clear();
    java.util.TreeSet var12 = new java.util.TreeSet();
    var12.clear();
    java.util.TreeSet var14 = new java.util.TreeSet();
    boolean var15 = var12.addAll((java.util.Collection)var14);
    java.lang.Object var16 = var12.pollLast();
    java.util.TreeSet var17 = new java.util.TreeSet();
    java.lang.Object var18 = var12.floor((java.lang.Object)var17);
    boolean var19 = var10.containsAll((java.util.Collection)var17);
    java.util.Set var20 = java.util.Collections.singleton((java.lang.Object)var10);
    boolean var21 = var0.equals((java.lang.Object)var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);

  }

  public void test93() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test93");


    java.util.TreeSet var0 = new java.util.TreeSet();
    var0.clear();
    java.util.TreeSet var2 = new java.util.TreeSet();
    boolean var3 = var0.addAll((java.util.Collection)var2);
    java.lang.Object var4 = var0.pollLast();
    java.util.TreeSet var5 = new java.util.TreeSet();
    java.lang.Object var6 = var0.floor((java.lang.Object)var5);
    java.util.TreeSet var7 = new java.util.TreeSet();
    var7.clear();
    java.util.TreeSet var9 = new java.util.TreeSet();
    boolean var10 = var7.addAll((java.util.Collection)var9);
    java.util.Enumeration var11 = java.util.Collections.enumeration((java.util.Collection)var7);
    java.util.TreeSet var12 = new java.util.TreeSet((java.util.Collection)var7);
    java.util.Iterator var13 = var12.descendingIterator();
    java.lang.Object var14 = var5.higher((java.lang.Object)var13);
    java.util.TreeSet var15 = new java.util.TreeSet((java.util.SortedSet)var5);
    java.util.List var16 = java.util.Collections.singletonList((java.lang.Object)var5);
    java.lang.Object var17 = var5.pollFirst();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);

  }

  public void test94() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test94");


    java.util.TreeSet var0 = new java.util.TreeSet();
    var0.clear();
    java.util.TreeSet var2 = new java.util.TreeSet();
    boolean var3 = var0.addAll((java.util.Collection)var2);
    java.util.Enumeration var4 = java.util.Collections.enumeration((java.util.Collection)var0);
    java.util.ArrayList var5 = java.util.Collections.list(var4);
    java.util.ArrayList var6 = java.util.Collections.list(var4);
    java.util.ArrayList var7 = java.util.Collections.list(var4);
    java.util.TreeSet var8 = new java.util.TreeSet();
    var8.clear();
    java.util.TreeSet var10 = new java.util.TreeSet();
    var10.clear();
    java.util.TreeSet var12 = new java.util.TreeSet();
    boolean var13 = var10.addAll((java.util.Collection)var12);
    java.lang.Object var14 = var10.pollLast();
    java.util.TreeSet var15 = new java.util.TreeSet();
    java.lang.Object var16 = var10.floor((java.lang.Object)var15);
    boolean var17 = var8.containsAll((java.util.Collection)var15);
    java.util.TreeSet var18 = new java.util.TreeSet();
    var18.clear();
    java.util.TreeSet var20 = new java.util.TreeSet();
    var20.clear();
    java.util.TreeSet var22 = new java.util.TreeSet();
    boolean var23 = var20.addAll((java.util.Collection)var22);
    java.lang.Object var24 = var20.pollLast();
    java.util.TreeSet var25 = new java.util.TreeSet();
    java.lang.Object var26 = var20.floor((java.lang.Object)var25);
    boolean var27 = var18.containsAll((java.util.Collection)var25);
    java.lang.Object[] var28 = new java.lang.Object[] { var27};
    java.lang.Object[] var29 = var15.toArray(var28);
    java.lang.Object[] var30 = var7.toArray(var28);
    java.util.Collections.shuffle((java.util.List)var7);
    java.util.TreeSet var32 = new java.util.TreeSet();
    var32.clear();
    java.util.TreeSet var34 = new java.util.TreeSet();
    boolean var35 = var32.addAll((java.util.Collection)var34);
    java.util.Enumeration var36 = java.util.Collections.enumeration((java.util.Collection)var32);
    java.util.ArrayList var37 = java.util.Collections.list(var36);
    java.util.ArrayList var38 = java.util.Collections.list(var36);
    java.util.TreeSet var39 = new java.util.TreeSet();
    var39.clear();
    java.util.TreeSet var41 = new java.util.TreeSet();
    boolean var42 = var39.addAll((java.util.Collection)var41);
    java.lang.Object var43 = var41.pollFirst();
    boolean var45 = var41.remove((java.lang.Object)'#');
    java.util.Collections.fill((java.util.List)var38, (java.lang.Object)var45);
    int var47 = java.util.Collections.indexOfSubList((java.util.List)var7, (java.util.List)var38);
    java.util.List var48 = java.util.Collections.unmodifiableList((java.util.List)var7);
    java.util.Collections.reverse(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);

  }

  public void test95() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test95");


    java.util.TreeSet var0 = new java.util.TreeSet();
    var0.clear();
    java.util.TreeSet var2 = new java.util.TreeSet();
    boolean var3 = var0.addAll((java.util.Collection)var2);
    java.lang.Object var4 = var2.pollFirst();
    boolean var6 = var2.remove((java.lang.Object)'#');
    java.util.TreeSet var7 = new java.util.TreeSet();
    var7.clear();
    java.util.TreeSet var9 = new java.util.TreeSet();
    boolean var10 = var7.addAll((java.util.Collection)var9);
    java.util.Enumeration var11 = java.util.Collections.enumeration((java.util.Collection)var7);
    java.util.Iterator var12 = var7.descendingIterator();
    java.lang.Object var13 = var2.higher((java.lang.Object)var12);
    java.util.TreeSet var14 = new java.util.TreeSet();
    var14.clear();
    java.util.TreeSet var16 = new java.util.TreeSet();
    boolean var17 = var14.addAll((java.util.Collection)var16);
    java.util.Enumeration var18 = java.util.Collections.enumeration((java.util.Collection)var14);
    java.util.TreeSet var19 = new java.util.TreeSet((java.util.Collection)var14);
    java.lang.Object var21 = var14.floor((java.lang.Object)false);
    java.util.TreeSet var22 = new java.util.TreeSet();
    var22.clear();
    java.util.TreeSet var24 = new java.util.TreeSet();
    boolean var25 = var22.addAll((java.util.Collection)var24);
    java.util.Enumeration var26 = java.util.Collections.enumeration((java.util.Collection)var22);
    java.util.NavigableSet var27 = var22.descendingSet();
    boolean var28 = var14.addAll((java.util.Collection)var27);
    java.lang.Object var29 = var2.floor((java.lang.Object)var28);
    java.util.TreeSet var30 = new java.util.TreeSet();
    var30.clear();
    java.util.TreeSet var32 = new java.util.TreeSet();
    boolean var33 = var30.addAll((java.util.Collection)var32);
    java.util.Enumeration var34 = java.util.Collections.enumeration((java.util.Collection)var30);
    java.util.Iterator var35 = var30.descendingIterator();
    java.util.List var36 = java.util.Collections.singletonList((java.lang.Object)var35);
    java.util.TreeSet var37 = new java.util.TreeSet();
    var37.clear();
    java.util.TreeSet var39 = new java.util.TreeSet();
    boolean var40 = var37.addAll((java.util.Collection)var39);
    java.util.Enumeration var41 = java.util.Collections.enumeration((java.util.Collection)var37);
    java.util.ArrayList var42 = java.util.Collections.list(var41);
    java.util.Collections.copy(var36, (java.util.List)var42);
    java.lang.Object var44 = var2.higher((java.lang.Object)var36);
    java.util.List var45 = java.util.Collections.synchronizedList(var36);
    java.util.TreeSet var46 = new java.util.TreeSet();
    var46.clear();
    java.util.TreeSet var48 = new java.util.TreeSet();
    boolean var49 = var46.addAll((java.util.Collection)var48);
    java.util.Enumeration var50 = java.util.Collections.enumeration((java.util.Collection)var46);
    java.util.ArrayList var51 = java.util.Collections.list(var50);
    java.util.Collections.fill((java.util.List)var51, (java.lang.Object)(-1L));
    java.util.TreeSet var54 = new java.util.TreeSet();
    var54.clear();
    java.util.TreeSet var56 = new java.util.TreeSet();
    boolean var57 = var54.addAll((java.util.Collection)var56);
    java.util.Enumeration var58 = java.util.Collections.enumeration((java.util.Collection)var54);
    java.util.ArrayList var59 = java.util.Collections.list(var58);
    java.util.ArrayList var60 = java.util.Collections.list(var58);
    java.util.TreeSet var61 = new java.util.TreeSet();
    var61.clear();
    java.util.TreeSet var63 = new java.util.TreeSet();
    boolean var64 = var61.addAll((java.util.Collection)var63);
    java.lang.Object var65 = var63.pollFirst();
    boolean var67 = var63.remove((java.lang.Object)'#');
    java.util.Collections.fill((java.util.List)var60, (java.lang.Object)var67);
    java.util.Collection var69 = java.util.Collections.unmodifiableCollection((java.util.Collection)var60);
    int var70 = java.util.Collections.lastIndexOfSubList((java.util.List)var51, (java.util.List)var60);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var71 = java.util.Collections.binarySearch(var45, (java.lang.Object)var60);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var67 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var70 == 0);

  }

  public void test96() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test96");


    java.util.TreeSet var0 = new java.util.TreeSet();
    var0.clear();
    java.util.TreeSet var2 = new java.util.TreeSet();
    boolean var3 = var0.addAll((java.util.Collection)var2);
    java.lang.Object var4 = var2.pollFirst();
    java.lang.Object var6 = var2.higher((java.lang.Object)10.0f);
    java.util.TreeSet var7 = new java.util.TreeSet();
    var7.clear();
    java.util.TreeSet var9 = new java.util.TreeSet();
    var9.clear();
    java.util.TreeSet var11 = new java.util.TreeSet();
    boolean var12 = var9.addAll((java.util.Collection)var11);
    java.lang.Object var13 = var9.pollLast();
    java.util.TreeSet var14 = new java.util.TreeSet();
    java.lang.Object var15 = var9.floor((java.lang.Object)var14);
    boolean var16 = var7.containsAll((java.util.Collection)var14);
    boolean var18 = var14.add((java.lang.Object)10.0d);
    java.util.Set var19 = java.util.Collections.synchronizedSet((java.util.Set)var14);
    boolean var20 = var2.addAll((java.util.Collection)var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);

  }

  public void test97() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test97");


    java.util.TreeSet var0 = new java.util.TreeSet();
    var0.clear();
    java.util.TreeSet var2 = new java.util.TreeSet();
    boolean var3 = var0.addAll((java.util.Collection)var2);
    java.lang.Object var4 = var2.pollFirst();
    boolean var6 = var2.remove((java.lang.Object)'#');
    java.util.TreeSet var7 = new java.util.TreeSet();
    var7.clear();
    java.util.TreeSet var9 = new java.util.TreeSet();
    boolean var10 = var7.addAll((java.util.Collection)var9);
    java.util.Enumeration var11 = java.util.Collections.enumeration((java.util.Collection)var7);
    java.util.Iterator var12 = var7.descendingIterator();
    java.lang.Object var13 = var2.higher((java.lang.Object)var12);
    java.util.TreeSet var14 = new java.util.TreeSet();
    var14.clear();
    java.util.TreeSet var16 = new java.util.TreeSet();
    boolean var17 = var14.addAll((java.util.Collection)var16);
    java.util.Enumeration var18 = java.util.Collections.enumeration((java.util.Collection)var14);
    java.util.TreeSet var19 = new java.util.TreeSet((java.util.Collection)var14);
    java.lang.Object var21 = var14.floor((java.lang.Object)false);
    java.util.TreeSet var22 = new java.util.TreeSet();
    var22.clear();
    java.util.TreeSet var24 = new java.util.TreeSet();
    boolean var25 = var22.addAll((java.util.Collection)var24);
    java.util.Enumeration var26 = java.util.Collections.enumeration((java.util.Collection)var22);
    java.util.NavigableSet var27 = var22.descendingSet();
    boolean var28 = var14.addAll((java.util.Collection)var27);
    java.lang.Object var29 = var2.floor((java.lang.Object)var28);
    java.util.TreeSet var30 = new java.util.TreeSet();
    var30.clear();
    java.util.TreeSet var32 = new java.util.TreeSet();
    boolean var33 = var30.addAll((java.util.Collection)var32);
    java.util.Enumeration var34 = java.util.Collections.enumeration((java.util.Collection)var30);
    java.util.Iterator var35 = var30.descendingIterator();
    java.util.List var36 = java.util.Collections.singletonList((java.lang.Object)var35);
    java.util.TreeSet var37 = new java.util.TreeSet();
    var37.clear();
    java.util.TreeSet var39 = new java.util.TreeSet();
    boolean var40 = var37.addAll((java.util.Collection)var39);
    java.util.Enumeration var41 = java.util.Collections.enumeration((java.util.Collection)var37);
    java.util.ArrayList var42 = java.util.Collections.list(var41);
    java.util.Collections.copy(var36, (java.util.List)var42);
    java.lang.Object var44 = var2.higher((java.lang.Object)var36);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Collections.swap(var36, 0, 0);
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var44);

  }

  public void test98() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test98");


    java.util.TreeSet var0 = new java.util.TreeSet();
    var0.clear();
    java.util.TreeSet var2 = new java.util.TreeSet();
    boolean var3 = var0.addAll((java.util.Collection)var2);
    java.util.Enumeration var4 = java.util.Collections.enumeration((java.util.Collection)var0);
    java.util.NavigableSet var5 = var0.descendingSet();
    java.util.TreeSet var6 = new java.util.TreeSet();
    var6.clear();
    java.util.TreeSet var8 = new java.util.TreeSet();
    boolean var9 = var6.addAll((java.util.Collection)var8);
    java.util.Enumeration var10 = java.util.Collections.enumeration((java.util.Collection)var6);
    java.util.TreeSet var11 = new java.util.TreeSet((java.util.Collection)var6);
    java.lang.Object var13 = var6.floor((java.lang.Object)false);
    java.lang.Object var15 = var6.floor((java.lang.Object)(short)(-1));
    java.util.TreeSet var16 = new java.util.TreeSet();
    var16.clear();
    java.util.TreeSet var18 = new java.util.TreeSet();
    boolean var19 = var16.addAll((java.util.Collection)var18);
    java.util.Enumeration var20 = java.util.Collections.enumeration((java.util.Collection)var16);
    java.util.TreeSet var21 = new java.util.TreeSet((java.util.Collection)var16);
    java.lang.Object var23 = var16.floor((java.lang.Object)false);
    java.util.TreeSet var24 = new java.util.TreeSet();
    var24.clear();
    java.util.TreeSet var26 = new java.util.TreeSet();
    boolean var27 = var24.addAll((java.util.Collection)var26);
    java.util.Enumeration var28 = java.util.Collections.enumeration((java.util.Collection)var24);
    java.util.NavigableSet var29 = var24.descendingSet();
    boolean var30 = var16.addAll((java.util.Collection)var29);
    java.lang.Object[] var31 = new java.lang.Object[] { var30};
    boolean var32 = java.util.Collections.addAll((java.util.Collection)var6, var31);
    java.util.Map var33 = java.util.Collections.singletonMap((java.lang.Object)var5, (java.lang.Object)var6);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Set var34 = java.util.Collections.newSetFromMap(var33);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);

  }

  public void test99() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test99");


    java.util.TreeSet var0 = new java.util.TreeSet();
    var0.clear();
    java.util.TreeSet var2 = new java.util.TreeSet();
    boolean var3 = var0.addAll((java.util.Collection)var2);
    java.util.Enumeration var4 = java.util.Collections.enumeration((java.util.Collection)var0);
    java.util.TreeSet var5 = new java.util.TreeSet();
    var5.clear();
    java.util.TreeSet var7 = new java.util.TreeSet();
    boolean var8 = var5.addAll((java.util.Collection)var7);
    java.lang.Object var9 = var5.pollLast();
    java.util.TreeSet var10 = new java.util.TreeSet();
    java.lang.Object var11 = var5.floor((java.lang.Object)var10);
    java.lang.Object var13 = var10.floor((java.lang.Object)(byte)1);
    int var14 = java.util.Collections.frequency((java.util.Collection)var0, (java.lang.Object)var10);
    java.util.TreeSet var15 = new java.util.TreeSet();
    java.util.TreeSet var16 = new java.util.TreeSet();
    var16.clear();
    java.util.TreeSet var18 = new java.util.TreeSet();
    boolean var19 = var16.addAll((java.util.Collection)var18);
    java.util.Enumeration var20 = java.util.Collections.enumeration((java.util.Collection)var16);
    java.util.TreeSet var21 = new java.util.TreeSet((java.util.Collection)var16);
    java.util.Iterator var22 = var21.descendingIterator();
    boolean var23 = var15.addAll((java.util.Collection)var21);
    var15.clear();
    boolean var25 = var10.retainAll((java.util.Collection)var15);
    java.util.TreeSet var26 = new java.util.TreeSet();
    java.util.TreeSet var27 = new java.util.TreeSet();
    var27.clear();
    java.util.TreeSet var29 = new java.util.TreeSet();
    boolean var30 = var27.addAll((java.util.Collection)var29);
    java.util.Enumeration var31 = java.util.Collections.enumeration((java.util.Collection)var27);
    java.util.TreeSet var32 = new java.util.TreeSet((java.util.Collection)var27);
    java.util.Iterator var33 = var32.descendingIterator();
    boolean var34 = var26.addAll((java.util.Collection)var32);
    java.util.TreeSet var35 = new java.util.TreeSet();
    var35.clear();
    java.util.TreeSet var37 = new java.util.TreeSet();
    boolean var38 = var35.addAll((java.util.Collection)var37);
    java.util.TreeSet var39 = new java.util.TreeSet();
    var39.clear();
    java.util.TreeSet var41 = new java.util.TreeSet();
    boolean var42 = var39.addAll((java.util.Collection)var41);
    java.util.Enumeration var43 = java.util.Collections.enumeration((java.util.Collection)var39);
    java.util.Map var44 = java.util.Collections.singletonMap((java.lang.Object)var35, (java.lang.Object)var43);
    java.util.TreeSet var45 = new java.util.TreeSet();
    var45.clear();
    java.util.TreeSet var47 = new java.util.TreeSet();
    boolean var48 = var45.addAll((java.util.Collection)var47);
    java.util.Enumeration var49 = java.util.Collections.enumeration((java.util.Collection)var45);
    java.util.ArrayList var50 = java.util.Collections.list(var49);
    java.util.TreeSet var51 = new java.util.TreeSet();
    var51.clear();
    java.util.TreeSet var53 = new java.util.TreeSet();
    boolean var54 = var51.addAll((java.util.Collection)var53);
    java.util.Enumeration var55 = java.util.Collections.enumeration((java.util.Collection)var51);
    java.util.Iterator var56 = var51.descendingIterator();
    java.util.List var57 = java.util.Collections.singletonList((java.lang.Object)var56);
    java.util.TreeSet var58 = new java.util.TreeSet();
    var58.clear();
    java.util.TreeSet var60 = new java.util.TreeSet();
    boolean var61 = var58.addAll((java.util.Collection)var60);
    java.util.Enumeration var62 = java.util.Collections.enumeration((java.util.Collection)var58);
    java.util.ArrayList var63 = java.util.Collections.list(var62);
    java.util.Collections.copy(var57, (java.util.List)var63);
    int var65 = java.util.Collections.lastIndexOfSubList((java.util.List)var50, (java.util.List)var63);
    java.util.TreeSet var67 = new java.util.TreeSet();
    var67.clear();
    java.util.TreeSet var69 = new java.util.TreeSet();
    var69.clear();
    java.util.TreeSet var71 = new java.util.TreeSet();
    boolean var72 = var69.addAll((java.util.Collection)var71);
    java.lang.Object var73 = var69.pollLast();
    java.util.TreeSet var74 = new java.util.TreeSet();
    java.lang.Object var75 = var69.floor((java.lang.Object)var74);
    boolean var76 = var67.containsAll((java.util.Collection)var74);
    boolean var77 = java.util.Collections.replaceAll((java.util.List)var50, (java.lang.Object)"hi!", (java.lang.Object)var67);
    boolean var78 = var35.addAll((java.util.Collection)var67);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.SortedSet var79 = var10.subSet((java.lang.Object)var34, (java.lang.Object)var35);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var72 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var76 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var77 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var78 == false);

  }

  public void test100() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test100");


    java.util.TreeSet var0 = new java.util.TreeSet();
    java.lang.Object var2 = var0.ceiling((java.lang.Object)false);
    java.lang.Object var3 = var0.clone();
    java.util.TreeSet var4 = new java.util.TreeSet();
    var4.clear();
    java.util.TreeSet var6 = new java.util.TreeSet();
    boolean var7 = var4.addAll((java.util.Collection)var6);
    java.util.Enumeration var8 = java.util.Collections.enumeration((java.util.Collection)var4);
    java.util.TreeSet var9 = new java.util.TreeSet();
    var9.clear();
    java.util.TreeSet var11 = new java.util.TreeSet();
    boolean var12 = var9.addAll((java.util.Collection)var11);
    java.lang.Object var13 = var9.pollLast();
    java.util.TreeSet var14 = new java.util.TreeSet();
    java.lang.Object var15 = var9.floor((java.lang.Object)var14);
    java.lang.Object var17 = var14.floor((java.lang.Object)(byte)1);
    int var18 = java.util.Collections.frequency((java.util.Collection)var4, (java.lang.Object)var14);
    java.lang.Object[] var19 = var4.toArray();
    boolean var20 = java.util.Collections.addAll((java.util.Collection)var0, var19);
    java.util.TreeSet var21 = new java.util.TreeSet();
    var21.clear();
    java.util.TreeSet var23 = new java.util.TreeSet();
    boolean var24 = var21.addAll((java.util.Collection)var23);
    java.util.Enumeration var25 = java.util.Collections.enumeration((java.util.Collection)var21);
    java.util.ArrayList var26 = java.util.Collections.list(var25);
    java.util.ArrayList var27 = java.util.Collections.list(var25);
    java.util.TreeSet var28 = new java.util.TreeSet();
    var28.clear();
    java.util.TreeSet var30 = new java.util.TreeSet();
    boolean var31 = var28.addAll((java.util.Collection)var30);
    java.util.Enumeration var32 = java.util.Collections.enumeration((java.util.Collection)var28);
    java.util.Iterator var33 = var28.descendingIterator();
    java.util.List var34 = java.util.Collections.singletonList((java.lang.Object)var33);
    java.util.TreeSet var35 = new java.util.TreeSet();
    var35.clear();
    java.util.TreeSet var37 = new java.util.TreeSet();
    boolean var38 = var35.addAll((java.util.Collection)var37);
    java.util.Enumeration var39 = java.util.Collections.enumeration((java.util.Collection)var35);
    java.util.ArrayList var40 = java.util.Collections.list(var39);
    java.util.Collections.copy(var34, (java.util.List)var40);
    java.util.TreeSet var43 = new java.util.TreeSet();
    var43.clear();
    java.util.TreeSet var45 = new java.util.TreeSet();
    boolean var46 = var43.addAll((java.util.Collection)var45);
    java.lang.Object var47 = var45.pollFirst();
    boolean var48 = java.util.Collections.replaceAll(var34, (java.lang.Object)1L, (java.lang.Object)var45);
    java.util.Collections.fill((java.util.List)var27, (java.lang.Object)var45);
    boolean var50 = var0.retainAll((java.util.Collection)var27);
    java.util.Collections.shuffle((java.util.List)var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == false);

  }

  public void test101() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test101");


    java.util.TreeSet var0 = new java.util.TreeSet();
    var0.clear();
    java.util.TreeSet var2 = new java.util.TreeSet();
    boolean var3 = var0.addAll((java.util.Collection)var2);
    java.util.Enumeration var4 = java.util.Collections.enumeration((java.util.Collection)var0);
    java.util.TreeSet var5 = new java.util.TreeSet((java.util.Collection)var0);
    java.lang.Object var7 = var0.floor((java.lang.Object)false);
    java.util.TreeSet var8 = new java.util.TreeSet();
    var8.clear();
    java.util.TreeSet var10 = new java.util.TreeSet();
    boolean var11 = var8.addAll((java.util.Collection)var10);
    java.util.Enumeration var12 = java.util.Collections.enumeration((java.util.Collection)var8);
    java.util.NavigableSet var13 = var8.descendingSet();
    boolean var14 = var0.addAll((java.util.Collection)var13);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var15 = var0.last();
      fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test102() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test102");


    java.util.TreeSet var1 = new java.util.TreeSet();
    java.util.TreeSet var2 = new java.util.TreeSet();
    var2.clear();
    java.util.TreeSet var4 = new java.util.TreeSet();
    boolean var5 = var2.addAll((java.util.Collection)var4);
    java.util.Enumeration var6 = java.util.Collections.enumeration((java.util.Collection)var2);
    java.util.TreeSet var7 = new java.util.TreeSet((java.util.Collection)var2);
    java.lang.Object var9 = var2.floor((java.lang.Object)false);
    java.util.TreeSet var10 = new java.util.TreeSet();
    var10.clear();
    java.util.TreeSet var12 = new java.util.TreeSet();
    boolean var13 = var10.addAll((java.util.Collection)var12);
    java.util.Enumeration var14 = java.util.Collections.enumeration((java.util.Collection)var10);
    java.util.NavigableSet var15 = var10.descendingSet();
    boolean var16 = var2.addAll((java.util.Collection)var15);
    java.util.Map var17 = java.util.Collections.singletonMap((java.lang.Object)var1, (java.lang.Object)var2);
    java.util.SortedSet var18 = java.util.Collections.unmodifiableSortedSet((java.util.SortedSet)var1);
    java.util.TreeSet var19 = new java.util.TreeSet();
    var19.clear();
    java.util.TreeSet var21 = new java.util.TreeSet();
    boolean var22 = var19.addAll((java.util.Collection)var21);
    java.util.Enumeration var23 = java.util.Collections.enumeration((java.util.Collection)var19);
    java.util.ArrayList var24 = java.util.Collections.list(var23);
    java.util.ArrayList var25 = java.util.Collections.list(var23);
    java.util.Map var26 = java.util.Collections.singletonMap((java.lang.Object)var1, (java.lang.Object)var25);
    java.util.List var27 = java.util.Collections.nCopies(1, (java.lang.Object)var25);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.TreeSet var28 = new java.util.TreeSet((java.util.Collection)var27);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);

  }

  public void test103() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test103");


    java.util.TreeSet var0 = new java.util.TreeSet();
    var0.clear();
    java.util.TreeSet var2 = new java.util.TreeSet();
    boolean var3 = var0.addAll((java.util.Collection)var2);
    java.lang.Object var4 = var2.pollFirst();
    boolean var6 = var2.remove((java.lang.Object)'#');
    java.util.TreeSet var7 = new java.util.TreeSet();
    var7.clear();
    java.util.TreeSet var9 = new java.util.TreeSet();
    boolean var10 = var7.addAll((java.util.Collection)var9);
    java.util.Enumeration var11 = java.util.Collections.enumeration((java.util.Collection)var7);
    java.util.Iterator var12 = var7.descendingIterator();
    java.lang.Object var13 = var2.higher((java.lang.Object)var12);
    java.util.TreeSet var14 = new java.util.TreeSet();
    var14.clear();
    java.util.TreeSet var16 = new java.util.TreeSet();
    boolean var17 = var14.addAll((java.util.Collection)var16);
    java.util.Enumeration var18 = java.util.Collections.enumeration((java.util.Collection)var14);
    java.util.TreeSet var19 = new java.util.TreeSet((java.util.Collection)var14);
    java.lang.Object var21 = var14.floor((java.lang.Object)false);
    java.util.TreeSet var22 = new java.util.TreeSet();
    var22.clear();
    java.util.TreeSet var24 = new java.util.TreeSet();
    boolean var25 = var22.addAll((java.util.Collection)var24);
    java.util.Enumeration var26 = java.util.Collections.enumeration((java.util.Collection)var22);
    java.util.NavigableSet var27 = var22.descendingSet();
    boolean var28 = var14.addAll((java.util.Collection)var27);
    java.lang.Object var29 = var2.floor((java.lang.Object)var28);
    java.util.TreeSet var30 = new java.util.TreeSet();
    var30.clear();
    java.util.TreeSet var32 = new java.util.TreeSet();
    boolean var33 = var30.addAll((java.util.Collection)var32);
    java.util.Enumeration var34 = java.util.Collections.enumeration((java.util.Collection)var30);
    java.util.Iterator var35 = var30.descendingIterator();
    java.util.List var36 = java.util.Collections.singletonList((java.lang.Object)var35);
    java.util.TreeSet var37 = new java.util.TreeSet();
    var37.clear();
    java.util.TreeSet var39 = new java.util.TreeSet();
    boolean var40 = var37.addAll((java.util.Collection)var39);
    java.util.Enumeration var41 = java.util.Collections.enumeration((java.util.Collection)var37);
    java.util.ArrayList var42 = java.util.Collections.list(var41);
    java.util.Collections.copy(var36, (java.util.List)var42);
    java.lang.Object var44 = var2.higher((java.lang.Object)var36);
    java.util.TreeSet var45 = new java.util.TreeSet();
    var45.clear();
    java.util.TreeSet var47 = new java.util.TreeSet();
    boolean var48 = var45.addAll((java.util.Collection)var47);
    java.lang.Object var49 = var47.pollFirst();
    boolean var51 = var47.remove((java.lang.Object)'#');
    java.util.TreeSet var52 = new java.util.TreeSet();
    var52.clear();
    java.util.TreeSet var54 = new java.util.TreeSet();
    boolean var55 = var52.addAll((java.util.Collection)var54);
    java.util.Enumeration var56 = java.util.Collections.enumeration((java.util.Collection)var52);
    java.util.Iterator var57 = var52.descendingIterator();
    java.lang.Object var58 = var47.higher((java.lang.Object)var57);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.NavigableSet var60 = var2.tailSet((java.lang.Object)var57, false);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var58);

  }

  public void test104() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test104");


    java.util.TreeSet var0 = new java.util.TreeSet();
    var0.clear();
    java.util.TreeSet var2 = new java.util.TreeSet();
    boolean var3 = var0.addAll((java.util.Collection)var2);
    java.util.Enumeration var4 = java.util.Collections.enumeration((java.util.Collection)var0);
    java.util.TreeSet var5 = new java.util.TreeSet((java.util.Collection)var0);
    java.lang.Object var7 = var0.floor((java.lang.Object)false);
    java.lang.Object var9 = var0.floor((java.lang.Object)(short)(-1));
    java.util.TreeSet var10 = new java.util.TreeSet();
    var10.clear();
    java.util.TreeSet var12 = new java.util.TreeSet();
    boolean var13 = var10.addAll((java.util.Collection)var12);
    java.lang.Object var14 = var10.pollLast();
    java.util.TreeSet var15 = new java.util.TreeSet();
    java.lang.Object var16 = var10.floor((java.lang.Object)var15);
    java.lang.Object var18 = var15.floor((java.lang.Object)(byte)1);
    java.util.NavigableSet var19 = var15.descendingSet();
    java.lang.String var20 = var15.toString();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.NavigableSet var22 = var0.tailSet((java.lang.Object)var15, false);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "[]"+ "'", var20.equals("[]"));

  }

  public void test105() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test105");


    java.util.TreeSet var0 = new java.util.TreeSet();
    var0.clear();
    java.util.TreeSet var2 = new java.util.TreeSet();
    boolean var3 = var0.addAll((java.util.Collection)var2);
    java.lang.Object var4 = var2.pollFirst();
    boolean var6 = var2.remove((java.lang.Object)'#');
    java.util.TreeSet var7 = new java.util.TreeSet();
    var7.clear();
    java.util.TreeSet var9 = new java.util.TreeSet();
    boolean var10 = var7.addAll((java.util.Collection)var9);
    java.util.Enumeration var11 = java.util.Collections.enumeration((java.util.Collection)var7);
    java.util.Iterator var12 = var7.descendingIterator();
    java.lang.Object var13 = var2.higher((java.lang.Object)var12);
    java.util.TreeSet var14 = new java.util.TreeSet();
    var14.clear();
    java.util.TreeSet var16 = new java.util.TreeSet();
    boolean var17 = var14.addAll((java.util.Collection)var16);
    java.util.Enumeration var18 = java.util.Collections.enumeration((java.util.Collection)var14);
    java.util.TreeSet var19 = new java.util.TreeSet((java.util.Collection)var14);
    java.lang.Object var21 = var14.floor((java.lang.Object)false);
    java.util.TreeSet var22 = new java.util.TreeSet();
    var22.clear();
    java.util.TreeSet var24 = new java.util.TreeSet();
    boolean var25 = var22.addAll((java.util.Collection)var24);
    java.util.Enumeration var26 = java.util.Collections.enumeration((java.util.Collection)var22);
    java.util.NavigableSet var27 = var22.descendingSet();
    boolean var28 = var14.addAll((java.util.Collection)var27);
    java.lang.Object var29 = var2.floor((java.lang.Object)var28);
    java.util.TreeSet var30 = new java.util.TreeSet();
    var30.clear();
    java.util.TreeSet var32 = new java.util.TreeSet();
    boolean var33 = var30.addAll((java.util.Collection)var32);
    java.util.Enumeration var34 = java.util.Collections.enumeration((java.util.Collection)var30);
    java.util.Iterator var35 = var30.descendingIterator();
    java.util.List var36 = java.util.Collections.singletonList((java.lang.Object)var35);
    java.util.TreeSet var37 = new java.util.TreeSet();
    var37.clear();
    java.util.TreeSet var39 = new java.util.TreeSet();
    boolean var40 = var37.addAll((java.util.Collection)var39);
    java.util.Enumeration var41 = java.util.Collections.enumeration((java.util.Collection)var37);
    java.util.ArrayList var42 = java.util.Collections.list(var41);
    java.util.Collections.copy(var36, (java.util.List)var42);
    java.lang.Object var44 = var2.higher((java.lang.Object)var36);
    java.util.List var45 = java.util.Collections.synchronizedList(var36);
    java.util.TreeSet var46 = new java.util.TreeSet();
    var46.clear();
    java.util.TreeSet var48 = new java.util.TreeSet();
    var48.clear();
    java.util.TreeSet var50 = new java.util.TreeSet();
    boolean var51 = var48.addAll((java.util.Collection)var50);
    java.lang.Object var52 = var48.pollLast();
    java.util.TreeSet var53 = new java.util.TreeSet();
    java.lang.Object var54 = var48.floor((java.lang.Object)var53);
    boolean var55 = var46.containsAll((java.util.Collection)var53);
    boolean var57 = var53.add((java.lang.Object)10.0d);
    java.util.Set var58 = java.util.Collections.synchronizedSet((java.util.Set)var53);
    java.util.TreeSet var59 = new java.util.TreeSet();
    var59.clear();
    java.util.TreeSet var61 = new java.util.TreeSet();
    boolean var62 = var59.addAll((java.util.Collection)var61);
    java.util.Enumeration var63 = java.util.Collections.enumeration((java.util.Collection)var59);
    java.util.ArrayList var64 = java.util.Collections.list(var63);
    java.util.ArrayList var65 = java.util.Collections.list(var63);
    java.util.Comparator var66 = java.util.Collections.reverseOrder();
    java.util.Collections.sort((java.util.List)var65, var66);
    java.lang.Object var68 = java.util.Collections.min((java.util.Collection)var53, var66);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Collections.sort(var36, var66);
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var68 + "' != '" + 10.0d+ "'", var68.equals(10.0d));

  }

  public void test106() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test106");


    java.util.TreeSet var0 = new java.util.TreeSet();
    var0.clear();
    java.util.TreeSet var2 = new java.util.TreeSet();
    boolean var3 = var0.addAll((java.util.Collection)var2);
    java.util.Enumeration var4 = java.util.Collections.enumeration((java.util.Collection)var0);
    java.util.NavigableSet var5 = var0.descendingSet();
    boolean var7 = var0.add((java.lang.Object)10.0f);
    java.util.TreeSet var9 = new java.util.TreeSet();
    java.util.TreeSet var10 = new java.util.TreeSet();
    var10.clear();
    java.util.TreeSet var12 = new java.util.TreeSet();
    boolean var13 = var10.addAll((java.util.Collection)var12);
    java.util.Enumeration var14 = java.util.Collections.enumeration((java.util.Collection)var10);
    java.util.TreeSet var15 = new java.util.TreeSet((java.util.Collection)var10);
    java.lang.Object var17 = var10.floor((java.lang.Object)false);
    java.util.TreeSet var18 = new java.util.TreeSet();
    var18.clear();
    java.util.TreeSet var20 = new java.util.TreeSet();
    boolean var21 = var18.addAll((java.util.Collection)var20);
    java.util.Enumeration var22 = java.util.Collections.enumeration((java.util.Collection)var18);
    java.util.NavigableSet var23 = var18.descendingSet();
    boolean var24 = var10.addAll((java.util.Collection)var23);
    java.util.Map var25 = java.util.Collections.singletonMap((java.lang.Object)var9, (java.lang.Object)var10);
    java.util.SortedSet var26 = java.util.Collections.unmodifiableSortedSet((java.util.SortedSet)var9);
    java.util.TreeSet var27 = new java.util.TreeSet();
    var27.clear();
    java.util.TreeSet var29 = new java.util.TreeSet();
    boolean var30 = var27.addAll((java.util.Collection)var29);
    java.util.Enumeration var31 = java.util.Collections.enumeration((java.util.Collection)var27);
    java.util.ArrayList var32 = java.util.Collections.list(var31);
    java.util.ArrayList var33 = java.util.Collections.list(var31);
    java.util.Map var34 = java.util.Collections.singletonMap((java.lang.Object)var9, (java.lang.Object)var33);
    java.util.List var35 = java.util.Collections.nCopies(1, (java.lang.Object)var33);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var36 = var0.remove((java.lang.Object)var33);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);

  }

  public void test107() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test107");


    java.util.TreeSet var0 = new java.util.TreeSet();
    var0.clear();
    java.util.TreeSet var2 = new java.util.TreeSet();
    boolean var3 = var0.addAll((java.util.Collection)var2);
    java.lang.Object var4 = var2.pollFirst();
    boolean var6 = var2.remove((java.lang.Object)'#');
    java.util.TreeSet var7 = new java.util.TreeSet();
    var7.clear();
    java.util.TreeSet var9 = new java.util.TreeSet();
    boolean var10 = var7.addAll((java.util.Collection)var9);
    java.util.Enumeration var11 = java.util.Collections.enumeration((java.util.Collection)var7);
    java.util.Iterator var12 = var7.descendingIterator();
    java.lang.Object var13 = var2.higher((java.lang.Object)var12);
    java.util.TreeSet var14 = new java.util.TreeSet();
    var14.clear();
    java.util.TreeSet var16 = new java.util.TreeSet();
    boolean var17 = var14.addAll((java.util.Collection)var16);
    java.lang.Object var18 = var14.pollLast();
    java.util.TreeSet var19 = new java.util.TreeSet();
    java.lang.Object var20 = var14.floor((java.lang.Object)var19);
    java.lang.Object var21 = var2.floor((java.lang.Object)var14);
    java.util.TreeSet var22 = new java.util.TreeSet();
    var22.clear();
    java.util.TreeSet var24 = new java.util.TreeSet();
    var24.clear();
    java.util.TreeSet var26 = new java.util.TreeSet();
    boolean var27 = var24.addAll((java.util.Collection)var26);
    java.lang.Object var28 = var24.pollLast();
    java.util.TreeSet var29 = new java.util.TreeSet();
    java.lang.Object var30 = var24.floor((java.lang.Object)var29);
    boolean var31 = var22.containsAll((java.util.Collection)var29);
    java.util.Set var32 = java.util.Collections.singleton((java.lang.Object)var22);
    java.util.Comparator var33 = var22.comparator();
    boolean var35 = var22.add((java.lang.Object)100);
    java.lang.Object var36 = var2.higher((java.lang.Object)100);
    java.lang.String var37 = var2.toString();
    java.lang.Object var39 = var2.lower((java.lang.Object)(byte)10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var37 + "' != '" + "[]"+ "'", var37.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var39);

  }

  public void test108() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test108");


    java.util.TreeSet var0 = new java.util.TreeSet();
    var0.clear();
    java.util.TreeSet var2 = new java.util.TreeSet();
    boolean var3 = var0.addAll((java.util.Collection)var2);
    java.util.Enumeration var4 = java.util.Collections.enumeration((java.util.Collection)var0);
    java.util.ArrayList var5 = java.util.Collections.list(var4);
    java.util.ArrayList var6 = java.util.Collections.list(var4);
    java.util.ArrayList var7 = java.util.Collections.list(var4);
    java.util.TreeSet var8 = new java.util.TreeSet();
    var8.clear();
    java.util.TreeSet var10 = new java.util.TreeSet();
    var10.clear();
    java.util.TreeSet var12 = new java.util.TreeSet();
    boolean var13 = var10.addAll((java.util.Collection)var12);
    java.lang.Object var14 = var10.pollLast();
    java.util.TreeSet var15 = new java.util.TreeSet();
    java.lang.Object var16 = var10.floor((java.lang.Object)var15);
    boolean var17 = var8.containsAll((java.util.Collection)var15);
    java.util.Set var18 = java.util.Collections.singleton((java.lang.Object)var8);
    boolean var19 = var7.containsAll((java.util.Collection)var8);
    java.util.TreeSet var20 = new java.util.TreeSet();
    var20.clear();
    java.util.TreeSet var22 = new java.util.TreeSet();
    var22.clear();
    java.util.TreeSet var24 = new java.util.TreeSet();
    boolean var25 = var22.addAll((java.util.Collection)var24);
    java.lang.Object var26 = var22.pollLast();
    java.util.TreeSet var27 = new java.util.TreeSet();
    java.lang.Object var28 = var22.floor((java.lang.Object)var27);
    boolean var29 = var20.containsAll((java.util.Collection)var27);
    boolean var31 = var27.add((java.lang.Object)10.0d);
    java.util.Set var32 = java.util.Collections.synchronizedSet((java.util.Set)var27);
    java.util.TreeSet var33 = new java.util.TreeSet();
    var33.clear();
    java.util.TreeSet var35 = new java.util.TreeSet();
    boolean var36 = var33.addAll((java.util.Collection)var35);
    java.util.Enumeration var37 = java.util.Collections.enumeration((java.util.Collection)var33);
    java.util.ArrayList var38 = java.util.Collections.list(var37);
    java.util.ArrayList var39 = java.util.Collections.list(var37);
    java.util.Comparator var40 = java.util.Collections.reverseOrder();
    java.util.Collections.sort((java.util.List)var39, var40);
    java.lang.Object var42 = java.util.Collections.min((java.util.Collection)var27, var40);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var43 = java.util.Collections.max((java.util.Collection)var8, var40);
      fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var42 + "' != '" + 10.0d+ "'", var42.equals(10.0d));

  }

  public void test109() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test109");


    java.util.TreeSet var0 = new java.util.TreeSet();
    var0.clear();
    java.util.TreeSet var2 = new java.util.TreeSet();
    boolean var3 = var0.addAll((java.util.Collection)var2);
    java.util.Enumeration var4 = java.util.Collections.enumeration((java.util.Collection)var0);
    java.util.TreeSet var5 = new java.util.TreeSet((java.util.Collection)var0);
    java.lang.Object var7 = var0.floor((java.lang.Object)false);
    java.util.Iterator var8 = var0.descendingIterator();
    var0.clear();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test110() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test110");


    java.util.TreeSet var0 = new java.util.TreeSet();
    var0.clear();
    java.util.TreeSet var2 = new java.util.TreeSet();
    boolean var3 = var0.addAll((java.util.Collection)var2);
    java.util.Enumeration var4 = java.util.Collections.enumeration((java.util.Collection)var0);
    java.util.ArrayList var5 = java.util.Collections.list(var4);
    java.util.ArrayList var6 = java.util.Collections.list(var4);
    java.util.ArrayList var7 = java.util.Collections.list(var4);
    java.util.TreeSet var8 = new java.util.TreeSet();
    var8.clear();
    java.util.TreeSet var10 = new java.util.TreeSet();
    var10.clear();
    java.util.TreeSet var12 = new java.util.TreeSet();
    boolean var13 = var10.addAll((java.util.Collection)var12);
    java.lang.Object var14 = var10.pollLast();
    java.util.TreeSet var15 = new java.util.TreeSet();
    java.lang.Object var16 = var10.floor((java.lang.Object)var15);
    boolean var17 = var8.containsAll((java.util.Collection)var15);
    java.util.TreeSet var18 = new java.util.TreeSet();
    var18.clear();
    java.util.TreeSet var20 = new java.util.TreeSet();
    var20.clear();
    java.util.TreeSet var22 = new java.util.TreeSet();
    boolean var23 = var20.addAll((java.util.Collection)var22);
    java.lang.Object var24 = var20.pollLast();
    java.util.TreeSet var25 = new java.util.TreeSet();
    java.lang.Object var26 = var20.floor((java.lang.Object)var25);
    boolean var27 = var18.containsAll((java.util.Collection)var25);
    java.lang.Object[] var28 = new java.lang.Object[] { var27};
    java.lang.Object[] var29 = var15.toArray(var28);
    java.lang.Object[] var30 = var7.toArray(var28);
    java.util.Collections.shuffle((java.util.List)var7);
    java.util.TreeSet var32 = new java.util.TreeSet();
    var32.clear();
    java.util.TreeSet var34 = new java.util.TreeSet();
    boolean var35 = var32.addAll((java.util.Collection)var34);
    java.util.Enumeration var36 = java.util.Collections.enumeration((java.util.Collection)var32);
    java.util.ArrayList var37 = java.util.Collections.list(var36);
    java.util.ArrayList var38 = java.util.Collections.list(var36);
    java.util.TreeSet var39 = new java.util.TreeSet();
    var39.clear();
    java.util.TreeSet var41 = new java.util.TreeSet();
    boolean var42 = var39.addAll((java.util.Collection)var41);
    java.lang.Object var43 = var41.pollFirst();
    boolean var45 = var41.remove((java.lang.Object)'#');
    java.util.Collections.fill((java.util.List)var38, (java.lang.Object)var45);
    int var47 = java.util.Collections.indexOfSubList((java.util.List)var7, (java.util.List)var38);
    java.util.List var48 = java.util.Collections.unmodifiableList((java.util.List)var7);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Collections.swap((java.util.List)var7, 100, 1);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);

  }

  public void test111() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test111");


    java.util.TreeSet var1 = new java.util.TreeSet();
    var1.clear();
    java.util.TreeSet var3 = new java.util.TreeSet();
    boolean var4 = var1.addAll((java.util.Collection)var3);
    java.util.Enumeration var5 = java.util.Collections.enumeration((java.util.Collection)var1);
    java.util.Iterator var6 = var1.descendingIterator();
    java.util.List var7 = java.util.Collections.singletonList((java.lang.Object)var6);
    java.util.TreeSet var8 = new java.util.TreeSet();
    var8.clear();
    java.util.TreeSet var10 = new java.util.TreeSet();
    boolean var11 = var8.addAll((java.util.Collection)var10);
    java.util.Enumeration var12 = java.util.Collections.enumeration((java.util.Collection)var8);
    java.util.ArrayList var13 = java.util.Collections.list(var12);
    java.util.Collections.copy(var7, (java.util.List)var13);
    java.util.TreeSet var16 = new java.util.TreeSet();
    var16.clear();
    java.util.TreeSet var18 = new java.util.TreeSet();
    boolean var19 = var16.addAll((java.util.Collection)var18);
    java.lang.Object var20 = var18.pollFirst();
    boolean var21 = java.util.Collections.replaceAll(var7, (java.lang.Object)1L, (java.lang.Object)var18);
    java.util.TreeSet var22 = new java.util.TreeSet();
    var22.clear();
    java.util.TreeSet var24 = new java.util.TreeSet();
    var24.clear();
    java.util.TreeSet var26 = new java.util.TreeSet();
    boolean var27 = var24.addAll((java.util.Collection)var26);
    java.lang.Object var28 = var24.pollLast();
    java.util.TreeSet var29 = new java.util.TreeSet();
    java.lang.Object var30 = var24.floor((java.lang.Object)var29);
    boolean var31 = var22.containsAll((java.util.Collection)var29);
    boolean var33 = var29.add((java.lang.Object)10.0d);
    java.util.Set var34 = java.util.Collections.synchronizedSet((java.util.Set)var29);
    boolean var35 = var18.containsAll((java.util.Collection)var34);
    java.util.List var36 = java.util.Collections.nCopies(0, (java.lang.Object)var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);

  }

  public void test112() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test112");


    java.util.TreeSet var0 = new java.util.TreeSet();
    java.lang.Object var2 = var0.ceiling((java.lang.Object)false);
    java.lang.Object var3 = var0.clone();
    java.util.TreeSet var4 = new java.util.TreeSet();
    var4.clear();
    java.util.TreeSet var6 = new java.util.TreeSet();
    boolean var7 = var4.addAll((java.util.Collection)var6);
    java.util.Enumeration var8 = java.util.Collections.enumeration((java.util.Collection)var4);
    java.util.TreeSet var9 = new java.util.TreeSet();
    var9.clear();
    java.util.TreeSet var11 = new java.util.TreeSet();
    boolean var12 = var9.addAll((java.util.Collection)var11);
    java.lang.Object var13 = var9.pollLast();
    java.util.TreeSet var14 = new java.util.TreeSet();
    java.lang.Object var15 = var9.floor((java.lang.Object)var14);
    java.lang.Object var17 = var14.floor((java.lang.Object)(byte)1);
    int var18 = java.util.Collections.frequency((java.util.Collection)var4, (java.lang.Object)var14);
    java.lang.Object[] var19 = var4.toArray();
    boolean var20 = java.util.Collections.addAll((java.util.Collection)var0, var19);
    java.util.TreeSet var21 = new java.util.TreeSet();
    var21.clear();
    java.util.TreeSet var23 = new java.util.TreeSet();
    boolean var24 = var21.addAll((java.util.Collection)var23);
    java.lang.Object var25 = var21.pollLast();
    java.util.TreeSet var26 = new java.util.TreeSet();
    java.lang.Object var27 = var21.floor((java.lang.Object)var26);
    java.lang.Object var29 = var26.floor((java.lang.Object)(byte)1);
    java.util.TreeSet var30 = new java.util.TreeSet();
    var30.clear();
    java.util.TreeSet var32 = new java.util.TreeSet();
    boolean var33 = var30.addAll((java.util.Collection)var32);
    boolean var34 = var26.removeAll((java.util.Collection)var30);
    var26.clear();
    boolean var36 = var0.removeAll((java.util.Collection)var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);

  }

  public void test113() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test113");


    java.util.TreeSet var0 = new java.util.TreeSet();
    var0.clear();
    java.util.TreeSet var2 = new java.util.TreeSet();
    var2.clear();
    java.util.TreeSet var4 = new java.util.TreeSet();
    boolean var5 = var2.addAll((java.util.Collection)var4);
    java.lang.Object var6 = var2.pollLast();
    java.util.TreeSet var7 = new java.util.TreeSet();
    java.lang.Object var8 = var2.floor((java.lang.Object)var7);
    boolean var9 = var0.containsAll((java.util.Collection)var7);
    java.util.TreeSet var10 = new java.util.TreeSet((java.util.Collection)var7);
    int var11 = var10.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);

  }

  public void test114() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test114");


    java.util.TreeSet var0 = new java.util.TreeSet();
    var0.clear();
    java.util.TreeSet var2 = new java.util.TreeSet();
    boolean var3 = var0.addAll((java.util.Collection)var2);
    java.util.Enumeration var4 = java.util.Collections.enumeration((java.util.Collection)var0);
    java.util.TreeSet var5 = new java.util.TreeSet();
    var5.clear();
    java.util.TreeSet var7 = new java.util.TreeSet();
    boolean var8 = var5.addAll((java.util.Collection)var7);
    java.lang.Object var9 = var5.pollLast();
    java.util.TreeSet var10 = new java.util.TreeSet();
    java.lang.Object var11 = var5.floor((java.lang.Object)var10);
    java.lang.Object var13 = var10.floor((java.lang.Object)(byte)1);
    int var14 = java.util.Collections.frequency((java.util.Collection)var0, (java.lang.Object)var10);
    java.util.Collection var15 = java.util.Collections.unmodifiableCollection((java.util.Collection)var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test115() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test115");


    java.util.TreeSet var0 = new java.util.TreeSet();
    var0.clear();
    java.util.TreeSet var2 = new java.util.TreeSet();
    boolean var3 = var0.addAll((java.util.Collection)var2);
    java.util.Enumeration var4 = java.util.Collections.enumeration((java.util.Collection)var0);
    java.util.TreeSet var5 = new java.util.TreeSet((java.util.Collection)var0);
    java.util.Set var6 = java.util.Collections.unmodifiableSet((java.util.Set)var5);
    java.util.TreeSet var7 = new java.util.TreeSet();
    var7.clear();
    java.util.TreeSet var9 = new java.util.TreeSet();
    boolean var10 = var7.addAll((java.util.Collection)var9);
    java.lang.Object var11 = var7.pollLast();
    java.util.TreeSet var12 = new java.util.TreeSet();
    java.lang.Object var13 = var7.floor((java.lang.Object)var12);
    java.lang.Object var15 = var12.floor((java.lang.Object)(byte)1);
    java.util.TreeSet var16 = new java.util.TreeSet();
    var16.clear();
    java.util.TreeSet var18 = new java.util.TreeSet();
    boolean var19 = var16.addAll((java.util.Collection)var18);
    boolean var20 = var12.removeAll((java.util.Collection)var16);
    boolean var21 = var5.addAll((java.util.Collection)var12);
    java.util.Iterator var22 = var5.descendingIterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);

  }

  public void test116() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test116");


    java.util.TreeSet var0 = new java.util.TreeSet();
    var0.clear();
    java.util.TreeSet var2 = new java.util.TreeSet();
    var2.clear();
    java.util.TreeSet var4 = new java.util.TreeSet();
    boolean var5 = var2.addAll((java.util.Collection)var4);
    java.lang.Object var6 = var2.pollLast();
    java.util.TreeSet var7 = new java.util.TreeSet();
    java.lang.Object var8 = var2.floor((java.lang.Object)var7);
    boolean var9 = var0.containsAll((java.util.Collection)var7);
    java.util.Set var10 = java.util.Collections.singleton((java.lang.Object)var0);
    java.util.TreeSet var11 = new java.util.TreeSet();
    var11.clear();
    java.util.TreeSet var13 = new java.util.TreeSet();
    var13.clear();
    java.util.TreeSet var15 = new java.util.TreeSet();
    boolean var16 = var13.addAll((java.util.Collection)var15);
    java.lang.Object var17 = var13.pollLast();
    java.util.TreeSet var18 = new java.util.TreeSet();
    java.lang.Object var19 = var13.floor((java.lang.Object)var18);
    boolean var20 = var11.containsAll((java.util.Collection)var18);
    java.util.TreeSet var21 = new java.util.TreeSet();
    var21.clear();
    java.util.TreeSet var23 = new java.util.TreeSet();
    boolean var24 = var21.addAll((java.util.Collection)var23);
    java.util.Enumeration var25 = java.util.Collections.enumeration((java.util.Collection)var21);
    java.util.NavigableSet var26 = var21.descendingSet();
    boolean var27 = var11.retainAll((java.util.Collection)var21);
    java.util.Iterator var28 = var11.descendingIterator();
    boolean var29 = var11.isEmpty();
    java.lang.Object var30 = var0.lower((java.lang.Object)var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var30);

  }

  public void test117() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test117");


    java.util.TreeSet var0 = new java.util.TreeSet();
    var0.clear();
    java.util.TreeSet var2 = new java.util.TreeSet();
    boolean var3 = var0.addAll((java.util.Collection)var2);
    java.lang.Object var4 = var2.pollFirst();
    java.util.Iterator var5 = var2.descendingIterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test118() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test118");


    java.util.TreeSet var0 = new java.util.TreeSet();
    var0.clear();
    java.util.TreeSet var2 = new java.util.TreeSet();
    boolean var3 = var0.addAll((java.util.Collection)var2);
    java.util.Enumeration var4 = java.util.Collections.enumeration((java.util.Collection)var0);
    java.util.ArrayList var5 = java.util.Collections.list(var4);
    java.util.ArrayList var6 = java.util.Collections.list(var4);
    java.util.ArrayList var7 = java.util.Collections.list(var4);
    java.util.TreeSet var8 = new java.util.TreeSet();
    var8.clear();
    java.util.TreeSet var10 = new java.util.TreeSet();
    var10.clear();
    java.util.TreeSet var12 = new java.util.TreeSet();
    boolean var13 = var10.addAll((java.util.Collection)var12);
    java.lang.Object var14 = var10.pollLast();
    java.util.TreeSet var15 = new java.util.TreeSet();
    java.lang.Object var16 = var10.floor((java.lang.Object)var15);
    boolean var17 = var8.containsAll((java.util.Collection)var15);
    java.util.TreeSet var18 = new java.util.TreeSet();
    var18.clear();
    java.util.TreeSet var20 = new java.util.TreeSet();
    var20.clear();
    java.util.TreeSet var22 = new java.util.TreeSet();
    boolean var23 = var20.addAll((java.util.Collection)var22);
    java.lang.Object var24 = var20.pollLast();
    java.util.TreeSet var25 = new java.util.TreeSet();
    java.lang.Object var26 = var20.floor((java.lang.Object)var25);
    boolean var27 = var18.containsAll((java.util.Collection)var25);
    java.lang.Object[] var28 = new java.lang.Object[] { var27};
    java.lang.Object[] var29 = var15.toArray(var28);
    java.lang.Object[] var30 = var7.toArray(var28);
    java.util.Collections.shuffle((java.util.List)var7);
    java.util.Collections.shuffle((java.util.List)var7);
    java.util.TreeSet var33 = new java.util.TreeSet();
    var33.clear();
    java.util.TreeSet var35 = new java.util.TreeSet();
    boolean var36 = var33.addAll((java.util.Collection)var35);
    java.util.Enumeration var37 = java.util.Collections.enumeration((java.util.Collection)var33);
    java.util.TreeSet var38 = new java.util.TreeSet((java.util.Collection)var33);
    java.util.Iterator var39 = var38.descendingIterator();
    java.util.TreeSet var40 = new java.util.TreeSet();
    var40.clear();
    java.util.TreeSet var42 = new java.util.TreeSet();
    boolean var43 = var40.addAll((java.util.Collection)var42);
    java.util.Enumeration var44 = java.util.Collections.enumeration((java.util.Collection)var40);
    java.util.ArrayList var45 = java.util.Collections.list(var44);
    java.util.ArrayList var46 = java.util.Collections.list(var44);
    java.util.Collection var47 = java.util.Collections.unmodifiableCollection((java.util.Collection)var46);
    boolean var48 = var38.containsAll((java.util.Collection)var46);
    java.util.List var49 = java.util.Collections.synchronizedList((java.util.List)var46);
    java.util.TreeSet var50 = new java.util.TreeSet();
    var50.clear();
    java.util.TreeSet var52 = new java.util.TreeSet();
    boolean var53 = var50.addAll((java.util.Collection)var52);
    java.lang.Object var54 = var52.pollFirst();
    java.lang.Object var56 = var52.higher((java.lang.Object)10.0f);
    boolean var57 = java.util.Collections.replaceAll((java.util.List)var7, (java.lang.Object)var46, (java.lang.Object)10.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == false);

  }

  public void test119() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test119");


    java.util.TreeSet var0 = new java.util.TreeSet();
    var0.clear();
    java.util.TreeSet var2 = new java.util.TreeSet();
    boolean var3 = var0.addAll((java.util.Collection)var2);
    java.util.Enumeration var4 = java.util.Collections.enumeration((java.util.Collection)var0);
    java.util.ArrayList var5 = java.util.Collections.list(var4);
    java.util.ArrayList var6 = java.util.Collections.list(var4);
    java.util.ArrayList var7 = java.util.Collections.list(var4);
    java.util.TreeSet var8 = new java.util.TreeSet();
    var8.clear();
    java.util.TreeSet var10 = new java.util.TreeSet();
    var10.clear();
    java.util.TreeSet var12 = new java.util.TreeSet();
    boolean var13 = var10.addAll((java.util.Collection)var12);
    java.lang.Object var14 = var10.pollLast();
    java.util.TreeSet var15 = new java.util.TreeSet();
    java.lang.Object var16 = var10.floor((java.lang.Object)var15);
    boolean var17 = var8.containsAll((java.util.Collection)var15);
    java.util.TreeSet var18 = new java.util.TreeSet();
    var18.clear();
    java.util.TreeSet var20 = new java.util.TreeSet();
    var20.clear();
    java.util.TreeSet var22 = new java.util.TreeSet();
    boolean var23 = var20.addAll((java.util.Collection)var22);
    java.lang.Object var24 = var20.pollLast();
    java.util.TreeSet var25 = new java.util.TreeSet();
    java.lang.Object var26 = var20.floor((java.lang.Object)var25);
    boolean var27 = var18.containsAll((java.util.Collection)var25);
    java.lang.Object[] var28 = new java.lang.Object[] { var27};
    java.lang.Object[] var29 = var15.toArray(var28);
    java.lang.Object[] var30 = var7.toArray(var28);
    java.util.Collections.shuffle((java.util.List)var7);
    java.util.TreeSet var32 = new java.util.TreeSet();
    var32.clear();
    java.util.TreeSet var34 = new java.util.TreeSet();
    boolean var35 = var32.addAll((java.util.Collection)var34);
    java.util.Enumeration var36 = java.util.Collections.enumeration((java.util.Collection)var32);
    java.util.ArrayList var37 = java.util.Collections.list(var36);
    java.util.ArrayList var38 = java.util.Collections.list(var36);
    java.util.TreeSet var39 = new java.util.TreeSet();
    var39.clear();
    java.util.TreeSet var41 = new java.util.TreeSet();
    boolean var42 = var39.addAll((java.util.Collection)var41);
    java.lang.Object var43 = var41.pollFirst();
    boolean var45 = var41.remove((java.lang.Object)'#');
    java.util.Collections.fill((java.util.List)var38, (java.lang.Object)var45);
    int var47 = java.util.Collections.indexOfSubList((java.util.List)var7, (java.util.List)var38);
    java.util.TreeSet var48 = new java.util.TreeSet();
    var48.clear();
    java.util.TreeSet var50 = new java.util.TreeSet();
    boolean var51 = var48.addAll((java.util.Collection)var50);
    java.util.Enumeration var52 = java.util.Collections.enumeration((java.util.Collection)var48);
    java.util.TreeSet var53 = new java.util.TreeSet((java.util.Collection)var48);
    java.util.Iterator var54 = var53.descendingIterator();
    java.util.TreeSet var55 = new java.util.TreeSet();
    var55.clear();
    java.util.TreeSet var57 = new java.util.TreeSet();
    boolean var58 = var55.addAll((java.util.Collection)var57);
    java.util.Enumeration var59 = java.util.Collections.enumeration((java.util.Collection)var55);
    java.util.ArrayList var60 = java.util.Collections.list(var59);
    java.util.ArrayList var61 = java.util.Collections.list(var59);
    java.util.Collection var62 = java.util.Collections.unmodifiableCollection((java.util.Collection)var61);
    boolean var63 = var53.containsAll((java.util.Collection)var61);
    java.util.List var64 = java.util.Collections.synchronizedList((java.util.List)var61);
    int var65 = java.util.Collections.lastIndexOfSubList((java.util.List)var38, (java.util.List)var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == 0);

  }

  public void test120() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test120");


    java.util.TreeSet var0 = new java.util.TreeSet();
    var0.clear();
    java.util.TreeSet var2 = new java.util.TreeSet();
    boolean var3 = var0.addAll((java.util.Collection)var2);
    java.util.Enumeration var4 = java.util.Collections.enumeration((java.util.Collection)var0);
    java.util.Iterator var5 = var0.descendingIterator();
    java.util.List var6 = java.util.Collections.singletonList((java.lang.Object)var5);
    java.util.TreeSet var7 = new java.util.TreeSet();
    var7.clear();
    java.util.TreeSet var9 = new java.util.TreeSet();
    boolean var10 = var7.addAll((java.util.Collection)var9);
    java.util.Enumeration var11 = java.util.Collections.enumeration((java.util.Collection)var7);
    java.util.ArrayList var12 = java.util.Collections.list(var11);
    java.util.Collections.copy(var6, (java.util.List)var12);
    java.util.TreeSet var15 = new java.util.TreeSet();
    var15.clear();
    java.util.TreeSet var17 = new java.util.TreeSet();
    boolean var18 = var15.addAll((java.util.Collection)var17);
    java.lang.Object var19 = var17.pollFirst();
    boolean var20 = java.util.Collections.replaceAll(var6, (java.lang.Object)1L, (java.lang.Object)var17);
    java.lang.Object var21 = var17.clone();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);

  }

  public void test121() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test121");


    java.util.TreeSet var0 = new java.util.TreeSet();
    var0.clear();
    java.util.TreeSet var2 = new java.util.TreeSet();
    boolean var3 = var0.addAll((java.util.Collection)var2);
    java.util.Enumeration var4 = java.util.Collections.enumeration((java.util.Collection)var0);
    java.util.NavigableSet var5 = var0.descendingSet();
    boolean var7 = var0.add((java.lang.Object)10.0f);
    java.util.TreeSet var9 = new java.util.TreeSet();
    var9.clear();
    java.util.TreeSet var11 = new java.util.TreeSet();
    boolean var12 = var9.addAll((java.util.Collection)var11);
    java.util.Enumeration var13 = java.util.Collections.enumeration((java.util.Collection)var9);
    java.util.ArrayList var14 = java.util.Collections.list(var13);
    java.util.ArrayList var15 = java.util.Collections.list(var13);
    java.util.TreeSet var16 = new java.util.TreeSet();
    var16.clear();
    java.util.TreeSet var18 = new java.util.TreeSet();
    boolean var19 = var16.addAll((java.util.Collection)var18);
    java.util.Enumeration var20 = java.util.Collections.enumeration((java.util.Collection)var16);
    java.util.Iterator var21 = var16.descendingIterator();
    java.util.List var22 = java.util.Collections.singletonList((java.lang.Object)var21);
    java.util.TreeSet var23 = new java.util.TreeSet();
    var23.clear();
    java.util.TreeSet var25 = new java.util.TreeSet();
    boolean var26 = var23.addAll((java.util.Collection)var25);
    java.util.Enumeration var27 = java.util.Collections.enumeration((java.util.Collection)var23);
    java.util.ArrayList var28 = java.util.Collections.list(var27);
    java.util.Collections.copy(var22, (java.util.List)var28);
    java.util.TreeSet var31 = new java.util.TreeSet();
    var31.clear();
    java.util.TreeSet var33 = new java.util.TreeSet();
    boolean var34 = var31.addAll((java.util.Collection)var33);
    java.lang.Object var35 = var33.pollFirst();
    boolean var36 = java.util.Collections.replaceAll(var22, (java.lang.Object)1L, (java.lang.Object)var33);
    java.util.Collections.fill((java.util.List)var15, (java.lang.Object)var33);
    java.util.List var38 = java.util.Collections.nCopies(10, (java.lang.Object)var15);
    java.util.TreeSet var40 = new java.util.TreeSet();
    var40.clear();
    java.util.TreeSet var42 = new java.util.TreeSet();
    boolean var43 = var40.addAll((java.util.Collection)var42);
    java.util.Enumeration var44 = java.util.Collections.enumeration((java.util.Collection)var40);
    java.util.ArrayList var45 = java.util.Collections.list(var44);
    java.util.ArrayList var46 = java.util.Collections.list(var44);
    java.util.TreeSet var47 = new java.util.TreeSet();
    var47.clear();
    java.util.TreeSet var49 = new java.util.TreeSet();
    boolean var50 = var47.addAll((java.util.Collection)var49);
    java.util.Enumeration var51 = java.util.Collections.enumeration((java.util.Collection)var47);
    java.util.Iterator var52 = var47.descendingIterator();
    java.util.List var53 = java.util.Collections.singletonList((java.lang.Object)var52);
    java.util.TreeSet var54 = new java.util.TreeSet();
    var54.clear();
    java.util.TreeSet var56 = new java.util.TreeSet();
    boolean var57 = var54.addAll((java.util.Collection)var56);
    java.util.Enumeration var58 = java.util.Collections.enumeration((java.util.Collection)var54);
    java.util.ArrayList var59 = java.util.Collections.list(var58);
    java.util.Collections.copy(var53, (java.util.List)var59);
    java.util.TreeSet var62 = new java.util.TreeSet();
    var62.clear();
    java.util.TreeSet var64 = new java.util.TreeSet();
    boolean var65 = var62.addAll((java.util.Collection)var64);
    java.lang.Object var66 = var64.pollFirst();
    boolean var67 = java.util.Collections.replaceAll(var53, (java.lang.Object)1L, (java.lang.Object)var64);
    java.util.Collections.fill((java.util.List)var46, (java.lang.Object)var64);
    java.util.List var69 = java.util.Collections.nCopies(10, (java.lang.Object)var46);
    boolean var70 = java.util.Collections.disjoint((java.util.Collection)var15, (java.util.Collection)var69);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var71 = var0.addAll((java.util.Collection)var69);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var67 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var70 == true);

  }

  public void test122() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test122");


    java.util.TreeSet var0 = new java.util.TreeSet();
    var0.clear();
    java.util.TreeSet var2 = new java.util.TreeSet();
    boolean var3 = var0.addAll((java.util.Collection)var2);
    java.util.Enumeration var4 = java.util.Collections.enumeration((java.util.Collection)var0);
    java.util.ArrayList var5 = java.util.Collections.list(var4);
    java.util.ArrayList var6 = java.util.Collections.list(var4);
    java.util.TreeSet var7 = new java.util.TreeSet();
    var7.clear();
    java.util.TreeSet var9 = new java.util.TreeSet();
    boolean var10 = var7.addAll((java.util.Collection)var9);
    java.util.Enumeration var11 = java.util.Collections.enumeration((java.util.Collection)var7);
    java.util.Iterator var12 = var7.descendingIterator();
    java.util.List var13 = java.util.Collections.singletonList((java.lang.Object)var12);
    java.util.TreeSet var14 = new java.util.TreeSet();
    var14.clear();
    java.util.TreeSet var16 = new java.util.TreeSet();
    boolean var17 = var14.addAll((java.util.Collection)var16);
    java.util.Enumeration var18 = java.util.Collections.enumeration((java.util.Collection)var14);
    java.util.ArrayList var19 = java.util.Collections.list(var18);
    java.util.Collections.copy(var13, (java.util.List)var19);
    java.util.TreeSet var22 = new java.util.TreeSet();
    var22.clear();
    java.util.TreeSet var24 = new java.util.TreeSet();
    boolean var25 = var22.addAll((java.util.Collection)var24);
    java.lang.Object var26 = var24.pollFirst();
    boolean var27 = java.util.Collections.replaceAll(var13, (java.lang.Object)1L, (java.lang.Object)var24);
    java.util.Collections.fill((java.util.List)var6, (java.lang.Object)var24);
    java.util.Collections.<java.lang.Comparable>sort((java.util.List)var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);

  }

  public void test123() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test123");


    java.util.TreeSet var0 = new java.util.TreeSet();
    var0.clear();
    java.util.TreeSet var2 = new java.util.TreeSet();
    boolean var3 = var0.addAll((java.util.Collection)var2);
    java.lang.Object var4 = var2.pollFirst();
    java.util.TreeSet var5 = new java.util.TreeSet();
    var5.clear();
    java.util.TreeSet var7 = new java.util.TreeSet();
    boolean var8 = var5.addAll((java.util.Collection)var7);
    java.util.Map var9 = java.util.Collections.singletonMap((java.lang.Object)var2, (java.lang.Object)var5);
    java.util.TreeSet var10 = new java.util.TreeSet();
    var10.clear();
    java.util.TreeSet var12 = new java.util.TreeSet();
    boolean var13 = var10.addAll((java.util.Collection)var12);
    java.util.Enumeration var14 = java.util.Collections.enumeration((java.util.Collection)var10);
    java.util.Iterator var15 = var10.descendingIterator();
    java.util.List var16 = java.util.Collections.singletonList((java.lang.Object)var15);
    java.lang.Object var17 = var2.ceiling((java.lang.Object)var15);
    java.lang.String var18 = var2.toString();
    java.util.TreeSet var19 = new java.util.TreeSet();
    var19.clear();
    java.util.TreeSet var21 = new java.util.TreeSet();
    boolean var22 = var19.addAll((java.util.Collection)var21);
    java.util.Enumeration var23 = java.util.Collections.enumeration((java.util.Collection)var19);
    java.util.TreeSet var24 = new java.util.TreeSet((java.util.Collection)var19);
    java.util.Iterator var25 = var24.descendingIterator();
    java.util.TreeSet var26 = new java.util.TreeSet();
    var26.clear();
    java.util.TreeSet var28 = new java.util.TreeSet();
    boolean var29 = var26.addAll((java.util.Collection)var28);
    java.util.Enumeration var30 = java.util.Collections.enumeration((java.util.Collection)var26);
    java.util.ArrayList var31 = java.util.Collections.list(var30);
    java.util.ArrayList var32 = java.util.Collections.list(var30);
    java.util.Collection var33 = java.util.Collections.unmodifiableCollection((java.util.Collection)var32);
    boolean var34 = var24.containsAll((java.util.Collection)var32);
    int var35 = java.util.Collections.frequency((java.util.Collection)var2, (java.lang.Object)var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "[]"+ "'", var18.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == 0);

  }

  public void test124() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test124");


    java.util.TreeSet var0 = new java.util.TreeSet();
    java.util.TreeSet var1 = new java.util.TreeSet();
    var1.clear();
    java.util.TreeSet var3 = new java.util.TreeSet();
    boolean var4 = var1.addAll((java.util.Collection)var3);
    java.util.Enumeration var5 = java.util.Collections.enumeration((java.util.Collection)var1);
    java.util.TreeSet var6 = new java.util.TreeSet((java.util.Collection)var1);
    java.lang.Object var8 = var1.floor((java.lang.Object)false);
    java.util.TreeSet var9 = new java.util.TreeSet();
    var9.clear();
    java.util.TreeSet var11 = new java.util.TreeSet();
    boolean var12 = var9.addAll((java.util.Collection)var11);
    java.util.Enumeration var13 = java.util.Collections.enumeration((java.util.Collection)var9);
    java.util.NavigableSet var14 = var9.descendingSet();
    boolean var15 = var1.addAll((java.util.Collection)var14);
    java.util.Map var16 = java.util.Collections.singletonMap((java.lang.Object)var0, (java.lang.Object)var1);
    java.lang.String var17 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "[]"+ "'", var17.equals("[]"));

  }

  public void test125() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test125");


    java.util.TreeSet var0 = new java.util.TreeSet();
    var0.clear();
    java.util.TreeSet var2 = new java.util.TreeSet();
    boolean var3 = var0.addAll((java.util.Collection)var2);
    java.util.Enumeration var4 = java.util.Collections.enumeration((java.util.Collection)var0);
    java.util.Iterator var5 = var0.descendingIterator();
    java.util.List var6 = java.util.Collections.singletonList((java.lang.Object)var5);
    java.util.List var7 = java.util.Collections.unmodifiableList(var6);
    java.util.List var8 = java.util.Collections.unmodifiableList(var6);
    java.util.TreeSet var9 = new java.util.TreeSet();
    java.util.TreeSet var10 = new java.util.TreeSet();
    var10.clear();
    java.util.TreeSet var12 = new java.util.TreeSet();
    boolean var13 = var10.addAll((java.util.Collection)var12);
    java.util.Enumeration var14 = java.util.Collections.enumeration((java.util.Collection)var10);
    java.util.TreeSet var15 = new java.util.TreeSet((java.util.Collection)var10);
    java.util.Iterator var16 = var15.descendingIterator();
    boolean var17 = var9.addAll((java.util.Collection)var15);
    java.util.TreeSet var18 = new java.util.TreeSet();
    var18.clear();
    java.util.TreeSet var20 = new java.util.TreeSet();
    boolean var21 = var18.addAll((java.util.Collection)var20);
    java.util.Enumeration var22 = java.util.Collections.enumeration((java.util.Collection)var18);
    java.util.TreeSet var23 = new java.util.TreeSet((java.util.Collection)var18);
    boolean var24 = java.util.Collections.replaceAll(var6, (java.lang.Object)var15, (java.lang.Object)var18);
    java.util.TreeSet var25 = new java.util.TreeSet();
    var25.clear();
    java.util.TreeSet var27 = new java.util.TreeSet();
    boolean var28 = var25.addAll((java.util.Collection)var27);
    java.util.Enumeration var29 = java.util.Collections.enumeration((java.util.Collection)var25);
    java.util.ArrayList var30 = java.util.Collections.list(var29);
    java.util.ArrayList var31 = java.util.Collections.list(var29);
    java.util.Comparator var32 = java.util.Collections.reverseOrder();
    java.util.Collections.sort((java.util.List)var31, var32);
    java.util.Comparator var34 = java.util.Collections.reverseOrder(var32);
    java.util.Comparator var35 = java.util.Collections.reverseOrder(var34);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var36 = java.util.Collections.max((java.util.Collection)var15, var34);
      fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);

  }

  public void test126() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test126");


    java.util.TreeSet var0 = new java.util.TreeSet();
    var0.clear();
    java.util.TreeSet var2 = new java.util.TreeSet();
    boolean var3 = var0.addAll((java.util.Collection)var2);
    java.util.Enumeration var4 = java.util.Collections.enumeration((java.util.Collection)var0);
    java.util.ArrayList var5 = java.util.Collections.list(var4);
    java.util.Collections.fill((java.util.List)var5, (java.lang.Object)(-1L));
    java.util.TreeSet var8 = new java.util.TreeSet();
    var8.clear();
    java.util.TreeSet var10 = new java.util.TreeSet();
    boolean var11 = var8.addAll((java.util.Collection)var10);
    java.util.Enumeration var12 = java.util.Collections.enumeration((java.util.Collection)var8);
    java.util.ArrayList var13 = java.util.Collections.list(var12);
    java.util.ArrayList var14 = java.util.Collections.list(var12);
    java.util.TreeSet var15 = new java.util.TreeSet();
    var15.clear();
    java.util.TreeSet var17 = new java.util.TreeSet();
    boolean var18 = var15.addAll((java.util.Collection)var17);
    java.lang.Object var19 = var17.pollFirst();
    boolean var21 = var17.remove((java.lang.Object)'#');
    java.util.Collections.fill((java.util.List)var14, (java.lang.Object)var21);
    java.util.Collection var23 = java.util.Collections.unmodifiableCollection((java.util.Collection)var14);
    int var24 = java.util.Collections.lastIndexOfSubList((java.util.List)var5, (java.util.List)var14);
    java.util.TreeSet var25 = new java.util.TreeSet();
    var25.clear();
    java.util.TreeSet var27 = new java.util.TreeSet();
    boolean var28 = var25.addAll((java.util.Collection)var27);
    java.util.Enumeration var29 = java.util.Collections.enumeration((java.util.Collection)var25);
    java.util.ArrayList var30 = java.util.Collections.list(var29);
    java.util.Collections.fill((java.util.List)var30, (java.lang.Object)(-1L));
    java.util.TreeSet var33 = new java.util.TreeSet();
    var33.clear();
    java.util.TreeSet var35 = new java.util.TreeSet();
    boolean var36 = var33.addAll((java.util.Collection)var35);
    java.util.Enumeration var37 = java.util.Collections.enumeration((java.util.Collection)var33);
    java.util.ArrayList var38 = java.util.Collections.list(var37);
    java.util.ArrayList var39 = java.util.Collections.list(var37);
    java.util.TreeSet var40 = new java.util.TreeSet();
    var40.clear();
    java.util.TreeSet var42 = new java.util.TreeSet();
    boolean var43 = var40.addAll((java.util.Collection)var42);
    java.lang.Object var44 = var42.pollFirst();
    boolean var46 = var42.remove((java.lang.Object)'#');
    java.util.Collections.fill((java.util.List)var39, (java.lang.Object)var46);
    java.util.Collection var48 = java.util.Collections.unmodifiableCollection((java.util.Collection)var39);
    int var49 = java.util.Collections.lastIndexOfSubList((java.util.List)var30, (java.util.List)var39);
    java.util.Collections.copy((java.util.List)var5, (java.util.List)var30);
    java.util.TreeSet var51 = new java.util.TreeSet();
    var51.clear();
    java.util.TreeSet var53 = new java.util.TreeSet();
    boolean var54 = var51.addAll((java.util.Collection)var53);
    java.util.Enumeration var55 = java.util.Collections.enumeration((java.util.Collection)var51);
    java.util.Iterator var56 = var51.descendingIterator();
    java.util.List var57 = java.util.Collections.singletonList((java.lang.Object)var56);
    java.util.Collections.reverse(var57);
    int var59 = java.util.Collections.indexOfSubList((java.util.List)var30, var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == (-1));

  }

  public void test127() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test127");


    java.util.TreeSet var0 = new java.util.TreeSet();
    var0.clear();
    java.util.TreeSet var2 = new java.util.TreeSet();
    boolean var3 = var0.addAll((java.util.Collection)var2);
    java.util.TreeSet var4 = new java.util.TreeSet();
    var4.clear();
    java.util.TreeSet var6 = new java.util.TreeSet();
    var6.clear();
    java.util.TreeSet var8 = new java.util.TreeSet();
    boolean var9 = var6.addAll((java.util.Collection)var8);
    java.lang.Object var10 = var6.pollLast();
    java.util.TreeSet var11 = new java.util.TreeSet();
    java.lang.Object var12 = var6.floor((java.lang.Object)var11);
    boolean var13 = var4.containsAll((java.util.Collection)var11);
    java.util.TreeSet var14 = new java.util.TreeSet();
    var14.clear();
    java.util.TreeSet var16 = new java.util.TreeSet();
    boolean var17 = var14.addAll((java.util.Collection)var16);
    java.util.Enumeration var18 = java.util.Collections.enumeration((java.util.Collection)var14);
    java.util.NavigableSet var19 = var14.descendingSet();
    boolean var20 = var4.retainAll((java.util.Collection)var14);
    java.util.NavigableSet var23 = var14.tailSet((java.lang.Object)(short)100, false);
    boolean var24 = java.util.Collections.disjoint((java.util.Collection)var0, (java.util.Collection)var14);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var25 = var0.last();
      fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);

  }

  public void test128() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test128");


    java.util.TreeSet var0 = new java.util.TreeSet();
    var0.clear();
    java.util.TreeSet var2 = new java.util.TreeSet();
    boolean var3 = var0.addAll((java.util.Collection)var2);
    java.util.Enumeration var4 = java.util.Collections.enumeration((java.util.Collection)var0);
    java.util.ArrayList var5 = java.util.Collections.list(var4);
    java.util.ArrayList var6 = java.util.Collections.list(var4);
    java.util.Comparator var7 = java.util.Collections.reverseOrder();
    java.util.Collections.sort((java.util.List)var6, var7);
    java.util.TreeSet var9 = new java.util.TreeSet(var7);
    java.util.Comparator var10 = java.util.Collections.reverseOrder(var7);
    java.util.TreeSet var11 = new java.util.TreeSet(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test129() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test129");


    java.util.TreeSet var0 = new java.util.TreeSet();
    var0.clear();
    java.util.TreeSet var2 = new java.util.TreeSet();
    boolean var3 = var0.addAll((java.util.Collection)var2);
    java.lang.Object var4 = var2.pollFirst();
    boolean var6 = var2.remove((java.lang.Object)'#');
    java.util.TreeSet var7 = new java.util.TreeSet();
    var7.clear();
    java.util.TreeSet var9 = new java.util.TreeSet();
    boolean var10 = var7.addAll((java.util.Collection)var9);
    java.util.Enumeration var11 = java.util.Collections.enumeration((java.util.Collection)var7);
    java.util.Iterator var12 = var7.descendingIterator();
    java.lang.Object var13 = var2.higher((java.lang.Object)var12);
    java.util.TreeSet var14 = new java.util.TreeSet();
    var14.clear();
    java.util.TreeSet var16 = new java.util.TreeSet();
    boolean var17 = var14.addAll((java.util.Collection)var16);
    java.util.Enumeration var18 = java.util.Collections.enumeration((java.util.Collection)var14);
    java.util.TreeSet var19 = new java.util.TreeSet((java.util.Collection)var14);
    java.lang.Object var21 = var14.floor((java.lang.Object)false);
    java.util.TreeSet var22 = new java.util.TreeSet();
    var22.clear();
    java.util.TreeSet var24 = new java.util.TreeSet();
    boolean var25 = var22.addAll((java.util.Collection)var24);
    java.util.Enumeration var26 = java.util.Collections.enumeration((java.util.Collection)var22);
    java.util.NavigableSet var27 = var22.descendingSet();
    boolean var28 = var14.addAll((java.util.Collection)var27);
    java.lang.Object var29 = var2.floor((java.lang.Object)var28);
    java.util.TreeSet var30 = new java.util.TreeSet();
    var30.clear();
    java.util.TreeSet var32 = new java.util.TreeSet();
    boolean var33 = var30.addAll((java.util.Collection)var32);
    java.util.Enumeration var34 = java.util.Collections.enumeration((java.util.Collection)var30);
    java.util.Iterator var35 = var30.descendingIterator();
    java.util.List var36 = java.util.Collections.singletonList((java.lang.Object)var35);
    java.util.TreeSet var37 = new java.util.TreeSet();
    var37.clear();
    java.util.TreeSet var39 = new java.util.TreeSet();
    boolean var40 = var37.addAll((java.util.Collection)var39);
    java.util.Enumeration var41 = java.util.Collections.enumeration((java.util.Collection)var37);
    java.util.ArrayList var42 = java.util.Collections.list(var41);
    java.util.Collections.copy(var36, (java.util.List)var42);
    java.lang.Object var44 = var2.higher((java.lang.Object)var36);
    java.lang.Object var45 = java.util.Collections.max((java.util.Collection)var36);
    java.util.Collections.reverse(var36);
    java.util.TreeSet var47 = new java.util.TreeSet();
    var47.clear();
    java.util.TreeSet var49 = new java.util.TreeSet();
    boolean var50 = var47.addAll((java.util.Collection)var49);
    java.util.Enumeration var51 = java.util.Collections.enumeration((java.util.Collection)var47);
    java.util.ArrayList var52 = java.util.Collections.list(var51);
    java.util.ArrayList var53 = java.util.Collections.list(var51);
    java.util.Comparator var54 = java.util.Collections.reverseOrder();
    java.util.Collections.sort((java.util.List)var53, var54);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Collections.sort(var36, var54);
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);

  }

  public void test130() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test130");


    java.util.TreeSet var0 = new java.util.TreeSet();
    var0.clear();
    java.util.TreeSet var2 = new java.util.TreeSet();
    boolean var3 = var0.addAll((java.util.Collection)var2);
    java.util.Enumeration var4 = java.util.Collections.enumeration((java.util.Collection)var0);
    java.util.NavigableSet var5 = var0.descendingSet();
    java.util.TreeSet var6 = new java.util.TreeSet();
    var6.clear();
    java.util.TreeSet var8 = new java.util.TreeSet();
    boolean var9 = var6.addAll((java.util.Collection)var8);
    java.lang.Object var10 = var6.pollLast();
    java.util.TreeSet var11 = new java.util.TreeSet();
    java.lang.Object var12 = var6.floor((java.lang.Object)var11);
    java.util.TreeSet var13 = new java.util.TreeSet();
    var13.clear();
    java.util.TreeSet var15 = new java.util.TreeSet();
    boolean var16 = var13.addAll((java.util.Collection)var15);
    java.util.Enumeration var17 = java.util.Collections.enumeration((java.util.Collection)var13);
    java.util.TreeSet var18 = new java.util.TreeSet((java.util.Collection)var13);
    java.util.Iterator var19 = var18.descendingIterator();
    java.lang.Object var20 = var11.higher((java.lang.Object)var19);
    java.util.TreeSet var21 = new java.util.TreeSet((java.util.SortedSet)var11);
    java.lang.Object var22 = var0.floor((java.lang.Object)var11);
    java.lang.Object var23 = var0.pollFirst();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);

  }

  public void test131() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test131");


    java.util.TreeSet var0 = new java.util.TreeSet();
    var0.clear();
    java.util.TreeSet var2 = new java.util.TreeSet();
    boolean var3 = var0.addAll((java.util.Collection)var2);
    java.util.Enumeration var4 = java.util.Collections.enumeration((java.util.Collection)var0);
    java.util.TreeSet var5 = new java.util.TreeSet();
    var5.clear();
    java.util.TreeSet var7 = new java.util.TreeSet();
    boolean var8 = var5.addAll((java.util.Collection)var7);
    java.lang.Object var9 = var5.pollLast();
    java.util.TreeSet var10 = new java.util.TreeSet();
    java.lang.Object var11 = var5.floor((java.lang.Object)var10);
    java.lang.Object var13 = var10.floor((java.lang.Object)(byte)1);
    int var14 = java.util.Collections.frequency((java.util.Collection)var0, (java.lang.Object)var10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var15 = var0.last();
      fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);

  }

  public void test132() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test132");


    java.util.TreeSet var0 = new java.util.TreeSet();
    var0.clear();
    java.util.TreeSet var2 = new java.util.TreeSet();
    var2.clear();
    java.util.TreeSet var4 = new java.util.TreeSet();
    boolean var5 = var2.addAll((java.util.Collection)var4);
    java.lang.Object var6 = var2.pollLast();
    java.util.TreeSet var7 = new java.util.TreeSet();
    java.lang.Object var8 = var2.floor((java.lang.Object)var7);
    boolean var9 = var0.containsAll((java.util.Collection)var7);
    java.util.TreeSet var10 = new java.util.TreeSet();
    var10.clear();
    java.util.TreeSet var12 = new java.util.TreeSet();
    boolean var13 = var10.addAll((java.util.Collection)var12);
    java.util.Enumeration var14 = java.util.Collections.enumeration((java.util.Collection)var10);
    java.util.NavigableSet var15 = var10.descendingSet();
    boolean var16 = var0.retainAll((java.util.Collection)var10);
    java.util.NavigableSet var19 = var10.tailSet((java.lang.Object)(short)100, false);
    java.lang.Object var21 = var10.lower((java.lang.Object)(-1.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);

  }

  public void test133() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test133");


    java.util.TreeSet var0 = new java.util.TreeSet();
    var0.clear();
    java.util.TreeSet var2 = new java.util.TreeSet();
    var2.clear();
    java.util.TreeSet var4 = new java.util.TreeSet();
    boolean var5 = var2.addAll((java.util.Collection)var4);
    java.lang.Object var6 = var2.pollLast();
    java.util.TreeSet var7 = new java.util.TreeSet();
    java.lang.Object var8 = var2.floor((java.lang.Object)var7);
    boolean var9 = var0.containsAll((java.util.Collection)var7);
    java.util.Set var10 = java.util.Collections.synchronizedSet((java.util.Set)var0);
    java.util.TreeSet var11 = new java.util.TreeSet();
    var11.clear();
    java.util.TreeSet var13 = new java.util.TreeSet();
    boolean var14 = var11.addAll((java.util.Collection)var13);
    java.util.TreeSet var15 = new java.util.TreeSet();
    var15.clear();
    java.util.TreeSet var17 = new java.util.TreeSet();
    boolean var18 = var15.addAll((java.util.Collection)var17);
    java.lang.Object var19 = var17.pollFirst();
    java.lang.Object var21 = var17.higher((java.lang.Object)10.0f);
    boolean var22 = java.util.Collections.disjoint((java.util.Collection)var11, (java.util.Collection)var17);
    boolean var23 = var0.remove((java.lang.Object)var22);
    java.util.Enumeration var24 = java.util.Collections.enumeration((java.util.Collection)var0);
    java.lang.Object var25 = var0.pollFirst();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);

  }

  public void test134() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test134");


    java.util.TreeSet var0 = new java.util.TreeSet();
    var0.clear();
    java.util.TreeSet var2 = new java.util.TreeSet();
    boolean var3 = var0.addAll((java.util.Collection)var2);
    java.util.Enumeration var4 = java.util.Collections.enumeration((java.util.Collection)var0);
    java.util.ArrayList var5 = java.util.Collections.list(var4);
    java.util.ArrayList var6 = java.util.Collections.list(var4);
    java.util.Collections.<java.lang.Comparable>sort((java.util.List)var6);
    int var9 = java.util.Collections.frequency((java.util.Collection)var6, (java.lang.Object)"");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);

  }

  public void test135() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test135");


    java.util.TreeSet var0 = new java.util.TreeSet();
    var0.clear();
    java.util.TreeSet var2 = new java.util.TreeSet();
    boolean var3 = var0.addAll((java.util.Collection)var2);
    java.util.TreeSet var4 = new java.util.TreeSet();
    var4.clear();
    java.util.TreeSet var6 = new java.util.TreeSet();
    boolean var7 = var4.addAll((java.util.Collection)var6);
    java.lang.Object var8 = var6.pollFirst();
    java.lang.Object var10 = var6.higher((java.lang.Object)10.0f);
    boolean var11 = java.util.Collections.disjoint((java.util.Collection)var0, (java.util.Collection)var6);
    java.util.TreeSet var12 = new java.util.TreeSet();
    var12.clear();
    java.util.TreeSet var14 = new java.util.TreeSet();
    boolean var15 = var12.addAll((java.util.Collection)var14);
    java.util.Enumeration var16 = java.util.Collections.enumeration((java.util.Collection)var12);
    java.util.ArrayList var17 = java.util.Collections.list(var16);
    java.util.ArrayList var18 = java.util.Collections.list(var16);
    java.util.ArrayList var19 = java.util.Collections.list(var16);
    java.util.TreeSet var20 = new java.util.TreeSet();
    var20.clear();
    java.util.TreeSet var22 = new java.util.TreeSet();
    var22.clear();
    java.util.TreeSet var24 = new java.util.TreeSet();
    boolean var25 = var22.addAll((java.util.Collection)var24);
    java.lang.Object var26 = var22.pollLast();
    java.util.TreeSet var27 = new java.util.TreeSet();
    java.lang.Object var28 = var22.floor((java.lang.Object)var27);
    boolean var29 = var20.containsAll((java.util.Collection)var27);
    java.util.TreeSet var30 = new java.util.TreeSet();
    var30.clear();
    java.util.TreeSet var32 = new java.util.TreeSet();
    var32.clear();
    java.util.TreeSet var34 = new java.util.TreeSet();
    boolean var35 = var32.addAll((java.util.Collection)var34);
    java.lang.Object var36 = var32.pollLast();
    java.util.TreeSet var37 = new java.util.TreeSet();
    java.lang.Object var38 = var32.floor((java.lang.Object)var37);
    boolean var39 = var30.containsAll((java.util.Collection)var37);
    java.lang.Object[] var40 = new java.lang.Object[] { var39};
    java.lang.Object[] var41 = var27.toArray(var40);
    java.lang.Object[] var42 = var19.toArray(var40);
    java.util.Collections.shuffle((java.util.List)var19);
    java.util.TreeSet var44 = new java.util.TreeSet();
    var44.clear();
    java.util.TreeSet var46 = new java.util.TreeSet();
    boolean var47 = var44.addAll((java.util.Collection)var46);
    java.util.Enumeration var48 = java.util.Collections.enumeration((java.util.Collection)var44);
    java.util.ArrayList var49 = java.util.Collections.list(var48);
    java.util.ArrayList var50 = java.util.Collections.list(var48);
    java.util.TreeSet var51 = new java.util.TreeSet();
    var51.clear();
    java.util.TreeSet var53 = new java.util.TreeSet();
    boolean var54 = var51.addAll((java.util.Collection)var53);
    java.lang.Object var55 = var53.pollFirst();
    boolean var57 = var53.remove((java.lang.Object)'#');
    java.util.Collections.fill((java.util.List)var50, (java.lang.Object)var57);
    int var59 = java.util.Collections.indexOfSubList((java.util.List)var19, (java.util.List)var50);
    java.util.List var60 = java.util.Collections.unmodifiableList((java.util.List)var19);
    java.lang.Object var61 = var0.ceiling((java.lang.Object)var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var61);

  }

  public void test136() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test136");


    java.util.TreeSet var0 = new java.util.TreeSet();
    var0.clear();
    java.util.TreeSet var2 = new java.util.TreeSet();
    boolean var3 = var0.addAll((java.util.Collection)var2);
    java.util.TreeSet var4 = new java.util.TreeSet();
    var4.clear();
    java.util.TreeSet var6 = new java.util.TreeSet();
    var6.clear();
    java.util.TreeSet var8 = new java.util.TreeSet();
    boolean var9 = var6.addAll((java.util.Collection)var8);
    java.lang.Object var10 = var6.pollLast();
    java.util.TreeSet var11 = new java.util.TreeSet();
    java.lang.Object var12 = var6.floor((java.lang.Object)var11);
    boolean var13 = var4.containsAll((java.util.Collection)var11);
    java.util.TreeSet var14 = new java.util.TreeSet();
    var14.clear();
    java.util.TreeSet var16 = new java.util.TreeSet();
    var16.clear();
    java.util.TreeSet var18 = new java.util.TreeSet();
    boolean var19 = var16.addAll((java.util.Collection)var18);
    java.lang.Object var20 = var16.pollLast();
    java.util.TreeSet var21 = new java.util.TreeSet();
    java.lang.Object var22 = var16.floor((java.lang.Object)var21);
    boolean var23 = var14.containsAll((java.util.Collection)var21);
    java.lang.Object[] var24 = new java.lang.Object[] { var23};
    java.lang.Object[] var25 = var11.toArray(var24);
    var11.clear();
    java.util.TreeSet var27 = new java.util.TreeSet();
    var27.clear();
    java.util.TreeSet var29 = new java.util.TreeSet();
    boolean var30 = var27.addAll((java.util.Collection)var29);
    java.util.Enumeration var31 = java.util.Collections.enumeration((java.util.Collection)var27);
    java.util.Iterator var32 = var27.descendingIterator();
    java.util.List var33 = java.util.Collections.singletonList((java.lang.Object)var32);
    java.util.TreeSet var34 = new java.util.TreeSet();
    var34.clear();
    java.util.TreeSet var36 = new java.util.TreeSet();
    boolean var37 = var34.addAll((java.util.Collection)var36);
    java.util.Enumeration var38 = java.util.Collections.enumeration((java.util.Collection)var34);
    java.util.ArrayList var39 = java.util.Collections.list(var38);
    java.util.Collections.copy(var33, (java.util.List)var39);
    java.util.TreeSet var42 = new java.util.TreeSet();
    var42.clear();
    java.util.TreeSet var44 = new java.util.TreeSet();
    boolean var45 = var42.addAll((java.util.Collection)var44);
    java.lang.Object var46 = var44.pollFirst();
    boolean var47 = java.util.Collections.replaceAll(var33, (java.lang.Object)1L, (java.lang.Object)var44);
    java.lang.Object var48 = var44.pollLast();
    java.lang.Object var50 = var44.lower((java.lang.Object)1);
    boolean var51 = java.util.Collections.disjoint((java.util.Collection)var11, (java.util.Collection)var44);
    boolean var52 = var11.isEmpty();
    boolean var53 = var2.containsAll((java.util.Collection)var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == true);

  }

  public void test137() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test137");


    java.util.TreeSet var0 = new java.util.TreeSet();
    java.util.TreeSet var1 = new java.util.TreeSet();
    var1.clear();
    java.util.TreeSet var3 = new java.util.TreeSet();
    boolean var4 = var1.addAll((java.util.Collection)var3);
    java.util.Enumeration var5 = java.util.Collections.enumeration((java.util.Collection)var1);
    java.util.TreeSet var6 = new java.util.TreeSet((java.util.Collection)var1);
    java.util.Iterator var7 = var6.descendingIterator();
    boolean var8 = var0.addAll((java.util.Collection)var6);
    java.util.TreeSet var9 = new java.util.TreeSet((java.util.SortedSet)var6);
    var9.clear();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test138() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test138");


    java.util.TreeSet var0 = new java.util.TreeSet();
    var0.clear();
    java.util.TreeSet var2 = new java.util.TreeSet();
    boolean var3 = var0.addAll((java.util.Collection)var2);
    java.lang.Object var4 = var2.pollFirst();
    java.util.TreeSet var5 = new java.util.TreeSet();
    var5.clear();
    java.util.TreeSet var7 = new java.util.TreeSet();
    boolean var8 = var5.addAll((java.util.Collection)var7);
    java.util.Map var9 = java.util.Collections.singletonMap((java.lang.Object)var2, (java.lang.Object)var5);
    java.util.Map var10 = java.util.Collections.synchronizedMap(var9);
    java.util.Map var11 = java.util.Collections.synchronizedMap(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test139() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test139");


    java.util.TreeSet var0 = new java.util.TreeSet();
    java.util.TreeSet var1 = new java.util.TreeSet();
    var1.clear();
    java.util.TreeSet var3 = new java.util.TreeSet();
    boolean var4 = var1.addAll((java.util.Collection)var3);
    java.util.Enumeration var5 = java.util.Collections.enumeration((java.util.Collection)var1);
    java.util.TreeSet var6 = new java.util.TreeSet((java.util.Collection)var1);
    java.util.Iterator var7 = var6.descendingIterator();
    boolean var8 = var0.addAll((java.util.Collection)var6);
    var0.clear();
    int var10 = var0.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);

  }

  public void test140() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test140");


    java.util.TreeSet var1 = new java.util.TreeSet();
    var1.clear();
    java.util.TreeSet var3 = new java.util.TreeSet();
    boolean var4 = var1.addAll((java.util.Collection)var3);
    java.util.Enumeration var5 = java.util.Collections.enumeration((java.util.Collection)var1);
    java.util.TreeSet var6 = new java.util.TreeSet((java.util.Collection)var1);
    java.lang.Object var8 = var1.floor((java.lang.Object)false);
    java.util.Iterator var9 = var1.descendingIterator();
    java.lang.Object var10 = var1.pollFirst();
    java.util.TreeSet var11 = new java.util.TreeSet();
    var11.clear();
    java.util.TreeSet var13 = new java.util.TreeSet();
    var13.clear();
    java.util.TreeSet var15 = new java.util.TreeSet();
    boolean var16 = var13.addAll((java.util.Collection)var15);
    java.lang.Object var17 = var13.pollLast();
    java.util.TreeSet var18 = new java.util.TreeSet();
    java.lang.Object var19 = var13.floor((java.lang.Object)var18);
    boolean var20 = var11.containsAll((java.util.Collection)var18);
    java.util.TreeSet var21 = new java.util.TreeSet();
    var21.clear();
    java.util.TreeSet var23 = new java.util.TreeSet();
    var23.clear();
    java.util.TreeSet var25 = new java.util.TreeSet();
    boolean var26 = var23.addAll((java.util.Collection)var25);
    java.lang.Object var27 = var23.pollLast();
    java.util.TreeSet var28 = new java.util.TreeSet();
    java.lang.Object var29 = var23.floor((java.lang.Object)var28);
    boolean var30 = var21.containsAll((java.util.Collection)var28);
    java.lang.Object[] var31 = new java.lang.Object[] { var30};
    java.lang.Object[] var32 = var18.toArray(var31);
    var18.clear();
    java.util.TreeSet var34 = new java.util.TreeSet();
    var34.clear();
    java.util.TreeSet var36 = new java.util.TreeSet();
    boolean var37 = var34.addAll((java.util.Collection)var36);
    java.util.Enumeration var38 = java.util.Collections.enumeration((java.util.Collection)var34);
    java.util.Iterator var39 = var34.descendingIterator();
    java.util.List var40 = java.util.Collections.singletonList((java.lang.Object)var39);
    java.util.TreeSet var41 = new java.util.TreeSet();
    var41.clear();
    java.util.TreeSet var43 = new java.util.TreeSet();
    boolean var44 = var41.addAll((java.util.Collection)var43);
    java.util.Enumeration var45 = java.util.Collections.enumeration((java.util.Collection)var41);
    java.util.ArrayList var46 = java.util.Collections.list(var45);
    java.util.Collections.copy(var40, (java.util.List)var46);
    java.util.TreeSet var49 = new java.util.TreeSet();
    var49.clear();
    java.util.TreeSet var51 = new java.util.TreeSet();
    boolean var52 = var49.addAll((java.util.Collection)var51);
    java.lang.Object var53 = var51.pollFirst();
    boolean var54 = java.util.Collections.replaceAll(var40, (java.lang.Object)1L, (java.lang.Object)var51);
    java.lang.Object var55 = var51.pollLast();
    java.lang.Object var57 = var51.lower((java.lang.Object)1);
    boolean var58 = java.util.Collections.disjoint((java.util.Collection)var18, (java.util.Collection)var51);
    java.lang.Object var59 = var1.ceiling((java.lang.Object)var51);
    boolean var60 = var1.isEmpty();
    java.util.List var61 = java.util.Collections.nCopies(0, (java.lang.Object)var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);

  }

  public void test141() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test141");


    java.util.TreeSet var0 = new java.util.TreeSet();
    var0.clear();
    java.util.TreeSet var2 = new java.util.TreeSet();
    var2.clear();
    java.util.TreeSet var4 = new java.util.TreeSet();
    boolean var5 = var2.addAll((java.util.Collection)var4);
    java.lang.Object var6 = var2.pollLast();
    java.util.TreeSet var7 = new java.util.TreeSet();
    java.lang.Object var8 = var2.floor((java.lang.Object)var7);
    boolean var9 = var0.containsAll((java.util.Collection)var7);
    java.util.Set var10 = java.util.Collections.synchronizedSet((java.util.Set)var0);
    java.util.TreeSet var11 = new java.util.TreeSet();
    var11.clear();
    java.util.TreeSet var13 = new java.util.TreeSet();
    boolean var14 = var11.addAll((java.util.Collection)var13);
    java.util.TreeSet var15 = new java.util.TreeSet();
    var15.clear();
    java.util.TreeSet var17 = new java.util.TreeSet();
    boolean var18 = var15.addAll((java.util.Collection)var17);
    java.lang.Object var19 = var17.pollFirst();
    java.lang.Object var21 = var17.higher((java.lang.Object)10.0f);
    boolean var22 = java.util.Collections.disjoint((java.util.Collection)var11, (java.util.Collection)var17);
    boolean var23 = var0.remove((java.lang.Object)var22);
    java.util.Enumeration var24 = java.util.Collections.enumeration((java.util.Collection)var0);
    java.lang.String var25 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "[]"+ "'", var25.equals("[]"));

  }

  public void test142() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test142");


    java.util.TreeSet var0 = new java.util.TreeSet();
    var0.clear();
    java.util.TreeSet var2 = new java.util.TreeSet();
    boolean var3 = var0.addAll((java.util.Collection)var2);
    java.lang.Object var4 = var2.pollFirst();
    boolean var6 = var2.remove((java.lang.Object)'#');
    java.util.TreeSet var7 = new java.util.TreeSet();
    var7.clear();
    java.util.TreeSet var9 = new java.util.TreeSet();
    boolean var10 = var7.addAll((java.util.Collection)var9);
    java.util.Enumeration var11 = java.util.Collections.enumeration((java.util.Collection)var7);
    java.util.Iterator var12 = var7.descendingIterator();
    java.lang.Object var13 = var2.higher((java.lang.Object)var12);
    java.util.TreeSet var14 = new java.util.TreeSet();
    var14.clear();
    java.util.TreeSet var16 = new java.util.TreeSet();
    boolean var17 = var14.addAll((java.util.Collection)var16);
    java.util.Enumeration var18 = java.util.Collections.enumeration((java.util.Collection)var14);
    java.util.TreeSet var19 = new java.util.TreeSet((java.util.Collection)var14);
    java.lang.Object var21 = var14.floor((java.lang.Object)false);
    java.util.TreeSet var22 = new java.util.TreeSet();
    var22.clear();
    java.util.TreeSet var24 = new java.util.TreeSet();
    boolean var25 = var22.addAll((java.util.Collection)var24);
    java.util.Enumeration var26 = java.util.Collections.enumeration((java.util.Collection)var22);
    java.util.NavigableSet var27 = var22.descendingSet();
    boolean var28 = var14.addAll((java.util.Collection)var27);
    java.lang.Object var29 = var2.floor((java.lang.Object)var28);
    java.lang.Object var30 = var2.clone();
    java.util.TreeSet var31 = new java.util.TreeSet();
    var31.clear();
    java.util.TreeSet var33 = new java.util.TreeSet();
    boolean var34 = var31.addAll((java.util.Collection)var33);
    java.lang.Object var35 = var31.pollLast();
    java.util.TreeSet var36 = new java.util.TreeSet();
    java.lang.Object var37 = var31.floor((java.lang.Object)var36);
    java.lang.Object var39 = var36.floor((java.lang.Object)(byte)1);
    boolean var40 = var2.retainAll((java.util.Collection)var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == false);

  }

  public void test143() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test143");


    java.util.TreeSet var1 = new java.util.TreeSet();
    java.util.TreeSet var2 = new java.util.TreeSet();
    var2.clear();
    java.util.TreeSet var4 = new java.util.TreeSet();
    boolean var5 = var2.addAll((java.util.Collection)var4);
    java.util.Enumeration var6 = java.util.Collections.enumeration((java.util.Collection)var2);
    java.util.TreeSet var7 = new java.util.TreeSet((java.util.Collection)var2);
    java.lang.Object var9 = var2.floor((java.lang.Object)false);
    java.util.TreeSet var10 = new java.util.TreeSet();
    var10.clear();
    java.util.TreeSet var12 = new java.util.TreeSet();
    boolean var13 = var10.addAll((java.util.Collection)var12);
    java.util.Enumeration var14 = java.util.Collections.enumeration((java.util.Collection)var10);
    java.util.NavigableSet var15 = var10.descendingSet();
    boolean var16 = var2.addAll((java.util.Collection)var15);
    java.util.Map var17 = java.util.Collections.singletonMap((java.lang.Object)var1, (java.lang.Object)var2);
    java.util.SortedSet var18 = java.util.Collections.unmodifiableSortedSet((java.util.SortedSet)var1);
    java.util.TreeSet var19 = new java.util.TreeSet();
    var19.clear();
    java.util.TreeSet var21 = new java.util.TreeSet();
    boolean var22 = var19.addAll((java.util.Collection)var21);
    java.util.Enumeration var23 = java.util.Collections.enumeration((java.util.Collection)var19);
    java.util.ArrayList var24 = java.util.Collections.list(var23);
    java.util.ArrayList var25 = java.util.Collections.list(var23);
    java.util.Map var26 = java.util.Collections.singletonMap((java.lang.Object)var1, (java.lang.Object)var25);
    java.util.List var27 = java.util.Collections.nCopies(1, (java.lang.Object)var25);
    java.util.TreeSet var28 = new java.util.TreeSet();
    var28.clear();
    java.util.TreeSet var30 = new java.util.TreeSet();
    boolean var31 = var28.addAll((java.util.Collection)var30);
    java.util.Enumeration var32 = java.util.Collections.enumeration((java.util.Collection)var28);
    java.util.ArrayList var33 = java.util.Collections.list(var32);
    java.util.ArrayList var34 = java.util.Collections.list(var32);
    java.util.ArrayList var35 = java.util.Collections.list(var32);
    java.util.TreeSet var36 = new java.util.TreeSet();
    var36.clear();
    java.util.TreeSet var38 = new java.util.TreeSet();
    var38.clear();
    java.util.TreeSet var40 = new java.util.TreeSet();
    boolean var41 = var38.addAll((java.util.Collection)var40);
    java.lang.Object var42 = var38.pollLast();
    java.util.TreeSet var43 = new java.util.TreeSet();
    java.lang.Object var44 = var38.floor((java.lang.Object)var43);
    boolean var45 = var36.containsAll((java.util.Collection)var43);
    java.util.Set var46 = java.util.Collections.singleton((java.lang.Object)var36);
    boolean var47 = var35.containsAll((java.util.Collection)var36);
    java.util.Collections.copy((java.util.List)var25, (java.util.List)var35);
    java.util.TreeSet var49 = new java.util.TreeSet();
    var49.clear();
    java.util.TreeSet var51 = new java.util.TreeSet();
    boolean var52 = var49.addAll((java.util.Collection)var51);
    java.util.Enumeration var53 = java.util.Collections.enumeration((java.util.Collection)var49);
    java.util.ArrayList var54 = java.util.Collections.list(var53);
    java.util.Collections.fill((java.util.List)var54, (java.lang.Object)(-1L));
    java.util.TreeSet var57 = new java.util.TreeSet();
    java.util.TreeSet var58 = new java.util.TreeSet();
    var58.clear();
    java.util.TreeSet var60 = new java.util.TreeSet();
    boolean var61 = var58.addAll((java.util.Collection)var60);
    java.util.Enumeration var62 = java.util.Collections.enumeration((java.util.Collection)var58);
    java.util.TreeSet var63 = new java.util.TreeSet((java.util.Collection)var58);
    java.lang.Object var65 = var58.floor((java.lang.Object)false);
    java.util.TreeSet var66 = new java.util.TreeSet();
    var66.clear();
    java.util.TreeSet var68 = new java.util.TreeSet();
    boolean var69 = var66.addAll((java.util.Collection)var68);
    java.util.Enumeration var70 = java.util.Collections.enumeration((java.util.Collection)var66);
    java.util.NavigableSet var71 = var66.descendingSet();
    boolean var72 = var58.addAll((java.util.Collection)var71);
    java.util.Map var73 = java.util.Collections.singletonMap((java.lang.Object)var57, (java.lang.Object)var58);
    java.util.Collections.fill((java.util.List)var54, (java.lang.Object)var73);
    int var75 = java.util.Collections.lastIndexOfSubList((java.util.List)var35, (java.util.List)var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var69 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var72 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var75 == 0);

  }

  public void test144() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test144");


    java.util.TreeSet var0 = new java.util.TreeSet();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var1 = var0.first();
      fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }

  }

  public void test145() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test145");


    java.util.TreeSet var0 = new java.util.TreeSet();
    var0.clear();
    java.util.TreeSet var2 = new java.util.TreeSet();
    boolean var3 = var0.addAll((java.util.Collection)var2);
    java.util.TreeSet var4 = new java.util.TreeSet();
    var4.clear();
    java.util.TreeSet var6 = new java.util.TreeSet();
    boolean var7 = var4.addAll((java.util.Collection)var6);
    java.util.Enumeration var8 = java.util.Collections.enumeration((java.util.Collection)var4);
    java.util.Map var9 = java.util.Collections.singletonMap((java.lang.Object)var0, (java.lang.Object)var8);
    java.util.ArrayList var10 = java.util.Collections.list(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test146() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test146");


    java.util.TreeSet var0 = new java.util.TreeSet();
    var0.clear();
    java.util.TreeSet var2 = new java.util.TreeSet();
    boolean var3 = var0.addAll((java.util.Collection)var2);
    java.util.Enumeration var4 = java.util.Collections.enumeration((java.util.Collection)var0);
    java.util.Iterator var5 = var0.descendingIterator();
    java.util.List var6 = java.util.Collections.singletonList((java.lang.Object)var5);
    java.util.List var7 = java.util.Collections.unmodifiableList(var6);
    java.util.List var8 = java.util.Collections.unmodifiableList(var6);
    java.util.Collections.reverse(var8);
    java.util.TreeSet var10 = new java.util.TreeSet();
    var10.clear();
    java.util.TreeSet var12 = new java.util.TreeSet();
    boolean var13 = var10.addAll((java.util.Collection)var12);
    java.util.Enumeration var14 = java.util.Collections.enumeration((java.util.Collection)var10);
    java.util.ArrayList var15 = java.util.Collections.list(var14);
    java.util.ArrayList var16 = java.util.Collections.list(var14);
    java.util.Collections.copy(var8, (java.util.List)var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test147() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test147");


    java.util.TreeSet var0 = new java.util.TreeSet();
    var0.clear();
    java.util.TreeSet var2 = new java.util.TreeSet();
    boolean var3 = var0.addAll((java.util.Collection)var2);
    java.lang.Object var4 = var2.pollFirst();
    java.util.TreeSet var5 = new java.util.TreeSet();
    var5.clear();
    java.util.TreeSet var7 = new java.util.TreeSet();
    boolean var8 = var5.addAll((java.util.Collection)var7);
    java.util.Map var9 = java.util.Collections.singletonMap((java.lang.Object)var2, (java.lang.Object)var5);
    java.util.TreeSet var10 = new java.util.TreeSet((java.util.SortedSet)var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test148() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test148");


    java.util.TreeSet var0 = new java.util.TreeSet();
    var0.clear();
    java.util.TreeSet var2 = new java.util.TreeSet();
    boolean var3 = var0.addAll((java.util.Collection)var2);
    java.util.Enumeration var4 = java.util.Collections.enumeration((java.util.Collection)var0);
    java.util.NavigableSet var5 = var0.descendingSet();
    java.util.TreeSet var6 = new java.util.TreeSet();
    var6.clear();
    java.util.TreeSet var8 = new java.util.TreeSet();
    boolean var9 = var6.addAll((java.util.Collection)var8);
    java.lang.Object var10 = var6.pollLast();
    java.util.TreeSet var11 = new java.util.TreeSet();
    java.lang.Object var12 = var6.floor((java.lang.Object)var11);
    java.util.TreeSet var13 = new java.util.TreeSet();
    var13.clear();
    java.util.TreeSet var15 = new java.util.TreeSet();
    boolean var16 = var13.addAll((java.util.Collection)var15);
    java.util.Enumeration var17 = java.util.Collections.enumeration((java.util.Collection)var13);
    java.util.TreeSet var18 = new java.util.TreeSet((java.util.Collection)var13);
    java.util.Iterator var19 = var18.descendingIterator();
    java.lang.Object var20 = var11.higher((java.lang.Object)var19);
    java.util.TreeSet var21 = new java.util.TreeSet((java.util.SortedSet)var11);
    java.lang.Object var22 = var0.floor((java.lang.Object)var11);
    java.util.Set var24 = java.util.Collections.singleton((java.lang.Object)0L);
    java.util.Collection var25 = java.util.Collections.synchronizedCollection((java.util.Collection)var24);
    boolean var26 = var0.removeAll((java.util.Collection)var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);

  }

  public void test149() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test149");


    java.util.TreeSet var0 = new java.util.TreeSet();
    var0.clear();
    java.util.TreeSet var2 = new java.util.TreeSet();
    boolean var3 = var0.addAll((java.util.Collection)var2);
    java.util.Enumeration var4 = java.util.Collections.enumeration((java.util.Collection)var0);
    java.util.TreeSet var5 = new java.util.TreeSet();
    var5.clear();
    java.util.TreeSet var7 = new java.util.TreeSet();
    boolean var8 = var5.addAll((java.util.Collection)var7);
    java.lang.Object var9 = var5.pollLast();
    java.util.TreeSet var10 = new java.util.TreeSet();
    java.lang.Object var11 = var5.floor((java.lang.Object)var10);
    java.lang.Object var13 = var10.floor((java.lang.Object)(byte)1);
    int var14 = java.util.Collections.frequency((java.util.Collection)var0, (java.lang.Object)var10);
    java.lang.Object[] var15 = var0.toArray();
    java.util.TreeSet var16 = new java.util.TreeSet((java.util.Collection)var0);
    java.util.Set var17 = java.util.Collections.unmodifiableSet((java.util.Set)var0);
    java.lang.Object[] var18 = var0.toArray();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);

  }

  public void test150() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test150");


    java.util.TreeSet var0 = new java.util.TreeSet();
    var0.clear();
    java.util.TreeSet var2 = new java.util.TreeSet();
    boolean var3 = var0.addAll((java.util.Collection)var2);
    java.util.Enumeration var4 = java.util.Collections.enumeration((java.util.Collection)var0);
    java.util.TreeSet var5 = new java.util.TreeSet((java.util.Collection)var0);
    java.util.Set var6 = java.util.Collections.unmodifiableSet((java.util.Set)var5);
    java.util.TreeSet var7 = new java.util.TreeSet();
    var7.clear();
    java.util.TreeSet var9 = new java.util.TreeSet();
    boolean var10 = var7.addAll((java.util.Collection)var9);
    java.lang.Object var11 = var7.pollLast();
    java.util.TreeSet var12 = new java.util.TreeSet();
    java.lang.Object var13 = var7.floor((java.lang.Object)var12);
    java.lang.Object var15 = var12.floor((java.lang.Object)(byte)1);
    java.util.TreeSet var16 = new java.util.TreeSet();
    var16.clear();
    java.util.TreeSet var18 = new java.util.TreeSet();
    boolean var19 = var16.addAll((java.util.Collection)var18);
    boolean var20 = var12.removeAll((java.util.Collection)var16);
    boolean var21 = var5.addAll((java.util.Collection)var12);
    java.util.TreeSet var22 = new java.util.TreeSet();
    var22.clear();
    java.util.TreeSet var24 = new java.util.TreeSet();
    boolean var25 = var22.addAll((java.util.Collection)var24);
    java.util.Enumeration var26 = java.util.Collections.enumeration((java.util.Collection)var22);
    java.util.ArrayList var27 = java.util.Collections.list(var26);
    java.util.ArrayList var28 = java.util.Collections.list(var26);
    java.util.ArrayList var29 = java.util.Collections.list(var26);
    java.util.TreeSet var30 = new java.util.TreeSet();
    var30.clear();
    java.util.TreeSet var32 = new java.util.TreeSet();
    var32.clear();
    java.util.TreeSet var34 = new java.util.TreeSet();
    boolean var35 = var32.addAll((java.util.Collection)var34);
    java.lang.Object var36 = var32.pollLast();
    java.util.TreeSet var37 = new java.util.TreeSet();
    java.lang.Object var38 = var32.floor((java.lang.Object)var37);
    boolean var39 = var30.containsAll((java.util.Collection)var37);
    java.util.TreeSet var40 = new java.util.TreeSet();
    var40.clear();
    java.util.TreeSet var42 = new java.util.TreeSet();
    var42.clear();
    java.util.TreeSet var44 = new java.util.TreeSet();
    boolean var45 = var42.addAll((java.util.Collection)var44);
    java.lang.Object var46 = var42.pollLast();
    java.util.TreeSet var47 = new java.util.TreeSet();
    java.lang.Object var48 = var42.floor((java.lang.Object)var47);
    boolean var49 = var40.containsAll((java.util.Collection)var47);
    java.lang.Object[] var50 = new java.lang.Object[] { var49};
    java.lang.Object[] var51 = var37.toArray(var50);
    java.lang.Object[] var52 = var29.toArray(var50);
    java.util.Collections.shuffle((java.util.List)var29);
    java.util.TreeSet var54 = new java.util.TreeSet();
    var54.clear();
    java.util.TreeSet var56 = new java.util.TreeSet();
    boolean var57 = var54.addAll((java.util.Collection)var56);
    java.util.Enumeration var58 = java.util.Collections.enumeration((java.util.Collection)var54);
    java.util.ArrayList var59 = java.util.Collections.list(var58);
    java.util.ArrayList var60 = java.util.Collections.list(var58);
    java.util.TreeSet var61 = new java.util.TreeSet();
    var61.clear();
    java.util.TreeSet var63 = new java.util.TreeSet();
    boolean var64 = var61.addAll((java.util.Collection)var63);
    java.lang.Object var65 = var63.pollFirst();
    boolean var67 = var63.remove((java.lang.Object)'#');
    java.util.Collections.fill((java.util.List)var60, (java.lang.Object)var67);
    int var69 = java.util.Collections.indexOfSubList((java.util.List)var29, (java.util.List)var60);
    java.util.TreeSet var70 = new java.util.TreeSet();
    var70.clear();
    java.util.TreeSet var72 = new java.util.TreeSet();
    boolean var73 = var70.addAll((java.util.Collection)var72);
    java.lang.Object var74 = var70.pollLast();
    java.util.TreeSet var75 = new java.util.TreeSet();
    java.lang.Object var76 = var70.floor((java.lang.Object)var75);
    java.util.TreeSet var77 = new java.util.TreeSet();
    var77.clear();
    java.util.TreeSet var79 = new java.util.TreeSet();
    boolean var80 = var77.addAll((java.util.Collection)var79);
    java.util.Enumeration var81 = java.util.Collections.enumeration((java.util.Collection)var77);
    java.util.TreeSet var82 = new java.util.TreeSet((java.util.Collection)var77);
    java.util.Iterator var83 = var82.descendingIterator();
    boolean var84 = var82.isEmpty();
    java.util.NavigableSet var86 = var70.headSet((java.lang.Object)var84, false);
    boolean var87 = var60.retainAll((java.util.Collection)var70);
    java.lang.Object var88 = var70.clone();
    java.lang.Object var89 = var5.floor(var88);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var67 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var69 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var73 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var80 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var81);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var83);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var84 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var86);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var87 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var88);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var89);

  }

  public void test151() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test151");


    java.util.TreeSet var0 = new java.util.TreeSet();
    var0.clear();
    java.util.TreeSet var2 = new java.util.TreeSet();
    boolean var3 = var0.addAll((java.util.Collection)var2);
    java.util.Enumeration var4 = java.util.Collections.enumeration((java.util.Collection)var0);
    java.util.TreeSet var5 = new java.util.TreeSet();
    var5.clear();
    java.util.TreeSet var7 = new java.util.TreeSet();
    boolean var8 = var5.addAll((java.util.Collection)var7);
    java.lang.Object var9 = var5.pollLast();
    java.util.TreeSet var10 = new java.util.TreeSet();
    java.lang.Object var11 = var5.floor((java.lang.Object)var10);
    java.lang.Object var13 = var10.floor((java.lang.Object)(byte)1);
    int var14 = java.util.Collections.frequency((java.util.Collection)var0, (java.lang.Object)var10);
    java.lang.Object[] var15 = var0.toArray();
    java.util.TreeSet var16 = new java.util.TreeSet((java.util.Collection)var0);
    java.util.TreeSet var17 = new java.util.TreeSet();
    var17.clear();
    java.util.TreeSet var19 = new java.util.TreeSet();
    boolean var20 = var17.addAll((java.util.Collection)var19);
    java.util.Enumeration var21 = java.util.Collections.enumeration((java.util.Collection)var17);
    java.util.ArrayList var22 = java.util.Collections.list(var21);
    java.util.ArrayList var23 = java.util.Collections.list(var21);
    java.util.Comparator var24 = java.util.Collections.reverseOrder();
    java.util.Collections.sort((java.util.List)var23, var24);
    java.util.Comparator var26 = java.util.Collections.reverseOrder(var24);
    java.util.Comparator var27 = java.util.Collections.reverseOrder(var26);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var28 = java.util.Collections.max((java.util.Collection)var16, var27);
      fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);

  }

  public void test152() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test152");


    java.util.TreeSet var0 = new java.util.TreeSet();
    var0.clear();
    java.util.TreeSet var2 = new java.util.TreeSet();
    boolean var3 = var0.addAll((java.util.Collection)var2);
    java.lang.Object var4 = var2.pollFirst();
    boolean var6 = var2.remove((java.lang.Object)'#');
    java.util.TreeSet var7 = new java.util.TreeSet();
    var7.clear();
    java.util.TreeSet var9 = new java.util.TreeSet();
    boolean var10 = var7.addAll((java.util.Collection)var9);
    java.util.Enumeration var11 = java.util.Collections.enumeration((java.util.Collection)var7);
    java.util.Iterator var12 = var7.descendingIterator();
    java.lang.Object var13 = var2.higher((java.lang.Object)var12);
    java.util.TreeSet var14 = new java.util.TreeSet();
    var14.clear();
    java.util.TreeSet var16 = new java.util.TreeSet();
    boolean var17 = var14.addAll((java.util.Collection)var16);
    java.lang.Object var18 = var14.pollLast();
    java.util.TreeSet var19 = new java.util.TreeSet();
    java.lang.Object var20 = var14.floor((java.lang.Object)var19);
    java.lang.Object var21 = var2.floor((java.lang.Object)var14);
    java.util.Comparator var22 = java.util.Collections.reverseOrder();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var23 = java.util.Collections.max((java.util.Collection)var14, var22);
      fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);

  }

  public void test153() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test153");


    java.util.TreeSet var0 = new java.util.TreeSet();
    java.util.TreeSet var1 = new java.util.TreeSet();
    var1.clear();
    java.util.TreeSet var3 = new java.util.TreeSet();
    boolean var4 = var1.addAll((java.util.Collection)var3);
    java.util.Enumeration var5 = java.util.Collections.enumeration((java.util.Collection)var1);
    java.util.TreeSet var6 = new java.util.TreeSet((java.util.Collection)var1);
    java.util.Iterator var7 = var6.descendingIterator();
    boolean var8 = var0.addAll((java.util.Collection)var6);
    java.util.TreeSet var9 = new java.util.TreeSet();
    var9.clear();
    java.util.TreeSet var11 = new java.util.TreeSet();
    boolean var12 = var9.addAll((java.util.Collection)var11);
    java.util.Enumeration var13 = java.util.Collections.enumeration((java.util.Collection)var9);
    java.util.ArrayList var14 = java.util.Collections.list(var13);
    java.util.Collections.fill((java.util.List)var14, (java.lang.Object)(-1L));
    java.util.TreeSet var17 = new java.util.TreeSet();
    java.util.TreeSet var18 = new java.util.TreeSet();
    var18.clear();
    java.util.TreeSet var20 = new java.util.TreeSet();
    boolean var21 = var18.addAll((java.util.Collection)var20);
    java.util.Enumeration var22 = java.util.Collections.enumeration((java.util.Collection)var18);
    java.util.TreeSet var23 = new java.util.TreeSet((java.util.Collection)var18);
    java.lang.Object var25 = var18.floor((java.lang.Object)false);
    java.util.TreeSet var26 = new java.util.TreeSet();
    var26.clear();
    java.util.TreeSet var28 = new java.util.TreeSet();
    boolean var29 = var26.addAll((java.util.Collection)var28);
    java.util.Enumeration var30 = java.util.Collections.enumeration((java.util.Collection)var26);
    java.util.NavigableSet var31 = var26.descendingSet();
    boolean var32 = var18.addAll((java.util.Collection)var31);
    java.util.Map var33 = java.util.Collections.singletonMap((java.lang.Object)var17, (java.lang.Object)var18);
    java.util.Collections.fill((java.util.List)var14, (java.lang.Object)var33);
    java.util.Collections.rotate((java.util.List)var14, (-1));
    java.lang.Object var37 = var6.lower((java.lang.Object)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var37);

  }

  public void test154() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test154");


    java.util.TreeSet var0 = new java.util.TreeSet();
    var0.clear();
    java.util.TreeSet var2 = new java.util.TreeSet();
    boolean var3 = var0.addAll((java.util.Collection)var2);
    java.util.Enumeration var4 = java.util.Collections.enumeration((java.util.Collection)var0);
    java.util.ArrayList var5 = java.util.Collections.list(var4);
    java.util.ArrayList var6 = java.util.Collections.list(var4);
    java.util.ArrayList var7 = java.util.Collections.list(var4);
    java.util.TreeSet var8 = new java.util.TreeSet();
    var8.clear();
    java.util.TreeSet var10 = new java.util.TreeSet();
    var10.clear();
    java.util.TreeSet var12 = new java.util.TreeSet();
    boolean var13 = var10.addAll((java.util.Collection)var12);
    java.lang.Object var14 = var10.pollLast();
    java.util.TreeSet var15 = new java.util.TreeSet();
    java.lang.Object var16 = var10.floor((java.lang.Object)var15);
    boolean var17 = var8.containsAll((java.util.Collection)var15);
    java.util.Set var18 = java.util.Collections.singleton((java.lang.Object)var8);
    boolean var19 = var7.containsAll((java.util.Collection)var8);
    java.util.TreeSet var20 = new java.util.TreeSet();
    var20.clear();
    java.util.TreeSet var22 = new java.util.TreeSet();
    boolean var23 = var20.addAll((java.util.Collection)var22);
    java.util.Enumeration var24 = java.util.Collections.enumeration((java.util.Collection)var20);
    java.util.ArrayList var25 = java.util.Collections.list(var24);
    java.util.TreeSet var26 = new java.util.TreeSet();
    var26.clear();
    java.util.TreeSet var28 = new java.util.TreeSet();
    boolean var29 = var26.addAll((java.util.Collection)var28);
    java.util.Enumeration var30 = java.util.Collections.enumeration((java.util.Collection)var26);
    java.util.Iterator var31 = var26.descendingIterator();
    java.util.List var32 = java.util.Collections.singletonList((java.lang.Object)var31);
    java.util.TreeSet var33 = new java.util.TreeSet();
    var33.clear();
    java.util.TreeSet var35 = new java.util.TreeSet();
    boolean var36 = var33.addAll((java.util.Collection)var35);
    java.util.Enumeration var37 = java.util.Collections.enumeration((java.util.Collection)var33);
    java.util.ArrayList var38 = java.util.Collections.list(var37);
    java.util.Collections.copy(var32, (java.util.List)var38);
    int var40 = java.util.Collections.lastIndexOfSubList((java.util.List)var25, (java.util.List)var38);
    java.lang.Object var41 = var8.higher((java.lang.Object)var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var41);

  }

  public void test155() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test155");


    java.util.TreeSet var0 = new java.util.TreeSet();
    var0.clear();
    java.util.TreeSet var2 = new java.util.TreeSet();
    boolean var3 = var0.addAll((java.util.Collection)var2);
    java.util.Enumeration var4 = java.util.Collections.enumeration((java.util.Collection)var0);
    java.util.Iterator var5 = var0.descendingIterator();
    java.util.Map var6 = java.util.Collections.emptyMap();
    java.util.Map var7 = java.util.Collections.synchronizedMap(var6);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var8 = var0.contains((java.lang.Object)var6);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test156() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test156");


    java.util.TreeSet var0 = new java.util.TreeSet();
    var0.clear();
    java.util.TreeSet var2 = new java.util.TreeSet();
    boolean var3 = var0.addAll((java.util.Collection)var2);
    java.util.Enumeration var4 = java.util.Collections.enumeration((java.util.Collection)var0);
    java.util.TreeSet var5 = new java.util.TreeSet();
    var5.clear();
    java.util.TreeSet var7 = new java.util.TreeSet();
    boolean var8 = var5.addAll((java.util.Collection)var7);
    java.lang.Object var9 = var5.pollLast();
    java.util.TreeSet var10 = new java.util.TreeSet();
    java.lang.Object var11 = var5.floor((java.lang.Object)var10);
    java.lang.Object var13 = var10.floor((java.lang.Object)(byte)1);
    int var14 = java.util.Collections.frequency((java.util.Collection)var0, (java.lang.Object)var10);
    java.lang.Object[] var15 = var0.toArray();
    java.util.TreeSet var16 = new java.util.TreeSet((java.util.Collection)var0);
    java.util.Set var17 = java.util.Collections.unmodifiableSet((java.util.Set)var0);
    java.util.SortedSet var18 = java.util.Collections.synchronizedSortedSet((java.util.SortedSet)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);

  }

  public void test157() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test157");


    java.util.TreeSet var0 = new java.util.TreeSet();
    var0.clear();
    java.util.TreeSet var2 = new java.util.TreeSet();
    boolean var3 = var0.addAll((java.util.Collection)var2);
    java.util.Enumeration var4 = java.util.Collections.enumeration((java.util.Collection)var0);
    java.util.TreeSet var5 = new java.util.TreeSet((java.util.Collection)var0);
    java.util.TreeSet var6 = new java.util.TreeSet((java.util.SortedSet)var5);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var7 = var5.first();
      fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test158() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test158");


    java.util.TreeSet var0 = new java.util.TreeSet();
    var0.clear();
    java.util.TreeSet var2 = new java.util.TreeSet();
    boolean var3 = var0.addAll((java.util.Collection)var2);
    java.util.TreeSet var4 = new java.util.TreeSet();
    var4.clear();
    java.util.TreeSet var6 = new java.util.TreeSet();
    var6.clear();
    java.util.TreeSet var8 = new java.util.TreeSet();
    boolean var9 = var6.addAll((java.util.Collection)var8);
    java.lang.Object var10 = var6.pollLast();
    java.util.TreeSet var11 = new java.util.TreeSet();
    java.lang.Object var12 = var6.floor((java.lang.Object)var11);
    boolean var13 = var4.containsAll((java.util.Collection)var11);
    java.util.TreeSet var14 = new java.util.TreeSet();
    var14.clear();
    java.util.TreeSet var16 = new java.util.TreeSet();
    boolean var17 = var14.addAll((java.util.Collection)var16);
    java.util.Enumeration var18 = java.util.Collections.enumeration((java.util.Collection)var14);
    java.util.NavigableSet var19 = var14.descendingSet();
    boolean var20 = var4.retainAll((java.util.Collection)var14);
    java.util.NavigableSet var23 = var14.tailSet((java.lang.Object)(short)100, false);
    boolean var24 = java.util.Collections.disjoint((java.util.Collection)var0, (java.util.Collection)var14);
    java.util.TreeSet var25 = new java.util.TreeSet((java.util.Collection)var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);

  }

  public void test159() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test159");


    java.util.TreeSet var0 = new java.util.TreeSet();
    var0.clear();
    java.util.TreeSet var2 = new java.util.TreeSet();
    boolean var3 = var0.addAll((java.util.Collection)var2);
    java.lang.Object var4 = var2.clone();
    java.util.Set var5 = java.util.Collections.unmodifiableSet((java.util.Set)var2);
    java.util.TreeSet var6 = new java.util.TreeSet((java.util.Collection)var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test160() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test160");


    java.util.TreeSet var0 = new java.util.TreeSet();
    var0.clear();
    java.util.TreeSet var2 = new java.util.TreeSet();
    boolean var3 = var0.addAll((java.util.Collection)var2);
    java.util.Enumeration var4 = java.util.Collections.enumeration((java.util.Collection)var0);
    java.util.NavigableSet var5 = var0.descendingSet();
    java.util.TreeSet var6 = new java.util.TreeSet();
    var6.clear();
    java.util.TreeSet var8 = new java.util.TreeSet();
    boolean var9 = var6.addAll((java.util.Collection)var8);
    java.util.Enumeration var10 = java.util.Collections.enumeration((java.util.Collection)var6);
    java.util.TreeSet var11 = new java.util.TreeSet((java.util.Collection)var6);
    java.lang.Object var13 = var6.floor((java.lang.Object)false);
    java.lang.Object var15 = var6.floor((java.lang.Object)(short)(-1));
    java.util.TreeSet var16 = new java.util.TreeSet();
    var16.clear();
    java.util.TreeSet var18 = new java.util.TreeSet();
    boolean var19 = var16.addAll((java.util.Collection)var18);
    java.util.Enumeration var20 = java.util.Collections.enumeration((java.util.Collection)var16);
    java.util.TreeSet var21 = new java.util.TreeSet((java.util.Collection)var16);
    java.lang.Object var23 = var16.floor((java.lang.Object)false);
    java.util.TreeSet var24 = new java.util.TreeSet();
    var24.clear();
    java.util.TreeSet var26 = new java.util.TreeSet();
    boolean var27 = var24.addAll((java.util.Collection)var26);
    java.util.Enumeration var28 = java.util.Collections.enumeration((java.util.Collection)var24);
    java.util.NavigableSet var29 = var24.descendingSet();
    boolean var30 = var16.addAll((java.util.Collection)var29);
    java.lang.Object[] var31 = new java.lang.Object[] { var30};
    boolean var32 = java.util.Collections.addAll((java.util.Collection)var6, var31);
    java.util.Map var33 = java.util.Collections.singletonMap((java.lang.Object)var5, (java.lang.Object)var6);
    var6.clear();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var35 = java.util.Collections.max((java.util.Collection)var6);
      fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);

  }

  public void test161() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test161");


    java.util.TreeSet var0 = new java.util.TreeSet();
    var0.clear();
    java.util.TreeSet var2 = new java.util.TreeSet();
    boolean var3 = var0.addAll((java.util.Collection)var2);
    java.lang.Object var4 = var2.pollFirst();
    boolean var6 = var2.remove((java.lang.Object)'#');
    java.util.TreeSet var7 = new java.util.TreeSet();
    var7.clear();
    java.util.TreeSet var9 = new java.util.TreeSet();
    boolean var10 = var7.addAll((java.util.Collection)var9);
    java.util.Enumeration var11 = java.util.Collections.enumeration((java.util.Collection)var7);
    java.util.Iterator var12 = var7.descendingIterator();
    java.lang.Object var13 = var2.higher((java.lang.Object)var12);
    java.util.TreeSet var14 = new java.util.TreeSet();
    var14.clear();
    java.util.TreeSet var16 = new java.util.TreeSet();
    boolean var17 = var14.addAll((java.util.Collection)var16);
    java.util.Enumeration var18 = java.util.Collections.enumeration((java.util.Collection)var14);
    java.util.TreeSet var19 = new java.util.TreeSet((java.util.Collection)var14);
    java.lang.Object var21 = var14.floor((java.lang.Object)false);
    java.util.TreeSet var22 = new java.util.TreeSet();
    var22.clear();
    java.util.TreeSet var24 = new java.util.TreeSet();
    boolean var25 = var22.addAll((java.util.Collection)var24);
    java.util.Enumeration var26 = java.util.Collections.enumeration((java.util.Collection)var22);
    java.util.NavigableSet var27 = var22.descendingSet();
    boolean var28 = var14.addAll((java.util.Collection)var27);
    java.lang.Object var29 = var2.floor((java.lang.Object)var28);
    java.lang.Object var30 = var2.clone();
    java.util.TreeSet var31 = new java.util.TreeSet();
    var31.clear();
    java.util.TreeSet var33 = new java.util.TreeSet();
    var33.clear();
    java.util.TreeSet var35 = new java.util.TreeSet();
    boolean var36 = var33.addAll((java.util.Collection)var35);
    java.lang.Object var37 = var33.pollLast();
    java.util.TreeSet var38 = new java.util.TreeSet();
    java.lang.Object var39 = var33.floor((java.lang.Object)var38);
    boolean var40 = var31.containsAll((java.util.Collection)var38);
    java.util.Set var41 = java.util.Collections.synchronizedSet((java.util.Set)var31);
    int var42 = java.util.Collections.frequency((java.util.Collection)var2, (java.lang.Object)var41);
    java.lang.Object var43 = var2.pollLast();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var43);

  }

  public void test162() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test162");


    java.util.TreeSet var0 = new java.util.TreeSet();
    var0.clear();
    java.util.TreeSet var2 = new java.util.TreeSet();
    boolean var3 = var0.addAll((java.util.Collection)var2);
    java.util.Enumeration var4 = java.util.Collections.enumeration((java.util.Collection)var0);
    java.util.ArrayList var5 = java.util.Collections.list(var4);
    java.util.ArrayList var6 = java.util.Collections.list(var4);
    java.util.Comparator var7 = java.util.Collections.reverseOrder();
    java.util.Collections.sort((java.util.List)var6, var7);
    java.util.TreeSet var9 = new java.util.TreeSet();
    var9.clear();
    java.util.TreeSet var11 = new java.util.TreeSet();
    boolean var12 = var9.addAll((java.util.Collection)var11);
    java.util.Enumeration var13 = java.util.Collections.enumeration((java.util.Collection)var9);
    java.util.ArrayList var14 = java.util.Collections.list(var13);
    java.util.ArrayList var15 = java.util.Collections.list(var13);
    java.util.Comparator var16 = java.util.Collections.reverseOrder();
    java.util.Collections.sort((java.util.List)var15, var16);
    java.util.Collections.copy((java.util.List)var6, (java.util.List)var15);
    java.util.List var19 = java.util.Collections.unmodifiableList((java.util.List)var15);
    java.util.Collections.rotate(var19, (-1));
    java.util.Collections.reverse(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);

  }

  public void test163() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test163");


    java.util.TreeSet var0 = new java.util.TreeSet();
    var0.clear();
    java.util.TreeSet var2 = new java.util.TreeSet();
    boolean var3 = var0.addAll((java.util.Collection)var2);
    java.util.Enumeration var4 = java.util.Collections.enumeration((java.util.Collection)var0);
    java.util.TreeSet var5 = new java.util.TreeSet((java.util.Collection)var0);
    java.util.Iterator var6 = var5.descendingIterator();
    java.util.TreeSet var7 = new java.util.TreeSet();
    var7.clear();
    java.util.TreeSet var9 = new java.util.TreeSet();
    boolean var10 = var7.addAll((java.util.Collection)var9);
    java.util.Enumeration var11 = java.util.Collections.enumeration((java.util.Collection)var7);
    java.util.ArrayList var12 = java.util.Collections.list(var11);
    java.util.ArrayList var13 = java.util.Collections.list(var11);
    java.util.Collection var14 = java.util.Collections.unmodifiableCollection((java.util.Collection)var13);
    boolean var15 = var5.containsAll((java.util.Collection)var13);
    java.util.TreeSet var16 = new java.util.TreeSet();
    var16.clear();
    java.util.TreeSet var18 = new java.util.TreeSet();
    var18.clear();
    java.util.TreeSet var20 = new java.util.TreeSet();
    boolean var21 = var18.addAll((java.util.Collection)var20);
    java.lang.Object var22 = var18.pollLast();
    java.util.TreeSet var23 = new java.util.TreeSet();
    java.lang.Object var24 = var18.floor((java.lang.Object)var23);
    boolean var25 = var16.containsAll((java.util.Collection)var23);
    boolean var27 = var23.add((java.lang.Object)10.0d);
    java.lang.Object var28 = var5.floor((java.lang.Object)10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var28);

  }

  public void test164() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test164");


    java.util.TreeSet var0 = new java.util.TreeSet();
    var0.clear();
    java.util.TreeSet var2 = new java.util.TreeSet();
    boolean var3 = var0.addAll((java.util.Collection)var2);
    java.util.Enumeration var4 = java.util.Collections.enumeration((java.util.Collection)var0);
    java.util.TreeSet var5 = new java.util.TreeSet((java.util.Collection)var0);
    java.util.Set var6 = java.util.Collections.unmodifiableSet((java.util.Set)var5);
    java.util.TreeSet var7 = new java.util.TreeSet();
    var7.clear();
    java.util.TreeSet var9 = new java.util.TreeSet();
    boolean var10 = var7.addAll((java.util.Collection)var9);
    java.lang.Object var11 = var7.pollLast();
    java.util.TreeSet var12 = new java.util.TreeSet();
    java.lang.Object var13 = var7.floor((java.lang.Object)var12);
    java.lang.Object var15 = var12.floor((java.lang.Object)(byte)1);
    java.util.TreeSet var16 = new java.util.TreeSet();
    var16.clear();
    java.util.TreeSet var18 = new java.util.TreeSet();
    boolean var19 = var16.addAll((java.util.Collection)var18);
    boolean var20 = var12.removeAll((java.util.Collection)var16);
    boolean var21 = var5.addAll((java.util.Collection)var12);
    java.lang.Object var22 = var12.clone();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);

  }

  public void test165() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test165");


    java.util.TreeSet var0 = new java.util.TreeSet();
    var0.clear();
    java.util.TreeSet var2 = new java.util.TreeSet();
    boolean var3 = var0.addAll((java.util.Collection)var2);
    java.lang.Object var4 = var2.pollFirst();
    java.lang.Object var6 = var2.higher((java.lang.Object)10.0f);
    java.util.NavigableSet var7 = var2.descendingSet();
    java.util.Set var8 = java.util.Collections.synchronizedSet((java.util.Set)var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test166() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test166");


    java.util.TreeSet var0 = new java.util.TreeSet();
    var0.clear();
    java.util.TreeSet var2 = new java.util.TreeSet();
    boolean var3 = var0.addAll((java.util.Collection)var2);
    java.util.Enumeration var4 = java.util.Collections.enumeration((java.util.Collection)var0);
    java.util.TreeSet var5 = new java.util.TreeSet((java.util.Collection)var0);
    java.lang.Object var7 = var0.floor((java.lang.Object)false);
    java.util.Iterator var8 = var0.descendingIterator();
    java.lang.Object var9 = var0.pollFirst();
    int var10 = var0.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);

  }

  public void test167() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test167");


    java.util.TreeSet var0 = new java.util.TreeSet();
    var0.clear();
    java.util.TreeSet var2 = new java.util.TreeSet();
    boolean var3 = var0.addAll((java.util.Collection)var2);
    java.util.Enumeration var4 = java.util.Collections.enumeration((java.util.Collection)var0);
    java.util.ArrayList var5 = java.util.Collections.list(var4);
    java.util.ArrayList var6 = java.util.Collections.list(var4);
    java.util.ArrayList var7 = java.util.Collections.list(var4);
    java.util.TreeSet var8 = new java.util.TreeSet();
    var8.clear();
    java.util.TreeSet var10 = new java.util.TreeSet();
    var10.clear();
    java.util.TreeSet var12 = new java.util.TreeSet();
    boolean var13 = var10.addAll((java.util.Collection)var12);
    java.lang.Object var14 = var10.pollLast();
    java.util.TreeSet var15 = new java.util.TreeSet();
    java.lang.Object var16 = var10.floor((java.lang.Object)var15);
    boolean var17 = var8.containsAll((java.util.Collection)var15);
    java.util.TreeSet var18 = new java.util.TreeSet();
    var18.clear();
    java.util.TreeSet var20 = new java.util.TreeSet();
    var20.clear();
    java.util.TreeSet var22 = new java.util.TreeSet();
    boolean var23 = var20.addAll((java.util.Collection)var22);
    java.lang.Object var24 = var20.pollLast();
    java.util.TreeSet var25 = new java.util.TreeSet();
    java.lang.Object var26 = var20.floor((java.lang.Object)var25);
    boolean var27 = var18.containsAll((java.util.Collection)var25);
    java.lang.Object[] var28 = new java.lang.Object[] { var27};
    java.lang.Object[] var29 = var15.toArray(var28);
    java.lang.Object[] var30 = var7.toArray(var28);
    java.util.Collections.shuffle((java.util.List)var7);
    java.util.TreeSet var32 = new java.util.TreeSet();
    var32.clear();
    java.util.TreeSet var34 = new java.util.TreeSet();
    boolean var35 = var32.addAll((java.util.Collection)var34);
    java.util.Enumeration var36 = java.util.Collections.enumeration((java.util.Collection)var32);
    java.util.ArrayList var37 = java.util.Collections.list(var36);
    java.util.ArrayList var38 = java.util.Collections.list(var36);
    java.util.TreeSet var39 = new java.util.TreeSet();
    var39.clear();
    java.util.TreeSet var41 = new java.util.TreeSet();
    boolean var42 = var39.addAll((java.util.Collection)var41);
    java.lang.Object var43 = var41.pollFirst();
    boolean var45 = var41.remove((java.lang.Object)'#');
    java.util.Collections.fill((java.util.List)var38, (java.lang.Object)var45);
    int var47 = java.util.Collections.indexOfSubList((java.util.List)var7, (java.util.List)var38);
    java.util.TreeSet var48 = new java.util.TreeSet();
    var48.clear();
    java.util.TreeSet var50 = new java.util.TreeSet();
    boolean var51 = var48.addAll((java.util.Collection)var50);
    java.lang.Object var52 = var48.pollLast();
    java.util.TreeSet var53 = new java.util.TreeSet();
    java.lang.Object var54 = var48.floor((java.lang.Object)var53);
    java.util.TreeSet var55 = new java.util.TreeSet();
    var55.clear();
    java.util.TreeSet var57 = new java.util.TreeSet();
    boolean var58 = var55.addAll((java.util.Collection)var57);
    java.util.Enumeration var59 = java.util.Collections.enumeration((java.util.Collection)var55);
    java.util.TreeSet var60 = new java.util.TreeSet((java.util.Collection)var55);
    java.util.Iterator var61 = var60.descendingIterator();
    boolean var62 = var60.isEmpty();
    java.util.NavigableSet var64 = var48.headSet((java.lang.Object)var62, false);
    boolean var65 = var38.retainAll((java.util.Collection)var48);
    java.lang.Object var66 = var48.clone();
    java.util.TreeSet var67 = new java.util.TreeSet();
    var67.clear();
    java.util.TreeSet var69 = new java.util.TreeSet();
    boolean var70 = var67.addAll((java.util.Collection)var69);
    java.util.Enumeration var71 = java.util.Collections.enumeration((java.util.Collection)var67);
    java.util.ArrayList var72 = java.util.Collections.list(var71);
    java.util.ArrayList var73 = java.util.Collections.list(var71);
    java.util.Comparator var74 = java.util.Collections.reverseOrder();
    java.util.Collections.sort((java.util.List)var73, var74);
    java.util.TreeSet var76 = new java.util.TreeSet(var74);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var77 = java.util.Collections.max((java.util.Collection)var48, var74);
      fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var70 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);

  }

  public void test168() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test168");


    java.util.TreeSet var0 = new java.util.TreeSet();
    var0.clear();
    java.util.TreeSet var2 = new java.util.TreeSet();
    boolean var3 = var0.addAll((java.util.Collection)var2);
    java.util.Enumeration var4 = java.util.Collections.enumeration((java.util.Collection)var0);
    java.util.ArrayList var5 = java.util.Collections.list(var4);
    java.util.ArrayList var6 = java.util.Collections.list(var4);
    java.util.ArrayList var7 = java.util.Collections.list(var4);
    java.util.ArrayList var8 = java.util.Collections.list(var4);
    java.util.TreeSet var9 = new java.util.TreeSet();
    var9.clear();
    java.util.TreeSet var11 = new java.util.TreeSet();
    boolean var12 = var9.addAll((java.util.Collection)var11);
    java.lang.Object var13 = var9.pollLast();
    java.util.TreeSet var14 = new java.util.TreeSet();
    java.lang.Object var15 = var9.floor((java.lang.Object)var14);
    java.util.TreeSet var16 = new java.util.TreeSet();
    var16.clear();
    java.util.TreeSet var18 = new java.util.TreeSet();
    boolean var19 = var16.addAll((java.util.Collection)var18);
    java.util.Enumeration var20 = java.util.Collections.enumeration((java.util.Collection)var16);
    java.lang.String var21 = var16.toString();
    boolean var22 = java.util.Collections.disjoint((java.util.Collection)var9, (java.util.Collection)var16);
    int var23 = java.util.Collections.binarySearch((java.util.List)var8, (java.lang.Object)var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "[]"+ "'", var21.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == (-1));

  }

  public void test169() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test169");


    java.util.TreeSet var0 = new java.util.TreeSet();
    var0.clear();
    java.util.TreeSet var2 = new java.util.TreeSet();
    boolean var3 = var0.addAll((java.util.Collection)var2);
    java.util.Enumeration var4 = java.util.Collections.enumeration((java.util.Collection)var0);
    java.util.TreeSet var5 = new java.util.TreeSet((java.util.Collection)var0);
    java.util.Iterator var6 = var5.descendingIterator();
    java.util.TreeSet var7 = new java.util.TreeSet();
    var7.clear();
    java.util.TreeSet var9 = new java.util.TreeSet();
    boolean var10 = var7.addAll((java.util.Collection)var9);
    java.util.TreeSet var11 = new java.util.TreeSet();
    var11.clear();
    java.util.TreeSet var13 = new java.util.TreeSet();
    boolean var14 = var11.addAll((java.util.Collection)var13);
    java.lang.Object var15 = var13.pollFirst();
    java.lang.Object var17 = var13.higher((java.lang.Object)10.0f);
    boolean var18 = java.util.Collections.disjoint((java.util.Collection)var7, (java.util.Collection)var13);
    java.lang.Object var19 = var7.clone();
    java.lang.String var20 = var7.toString();
    boolean var21 = var5.addAll((java.util.Collection)var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "[]"+ "'", var20.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);

  }

  public void test170() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test170");


    java.util.TreeSet var0 = new java.util.TreeSet();
    var0.clear();
    java.util.TreeSet var2 = new java.util.TreeSet();
    boolean var3 = var0.addAll((java.util.Collection)var2);
    java.util.TreeSet var4 = new java.util.TreeSet();
    var4.clear();
    java.util.TreeSet var6 = new java.util.TreeSet();
    boolean var7 = var4.addAll((java.util.Collection)var6);
    java.util.Enumeration var8 = java.util.Collections.enumeration((java.util.Collection)var4);
    java.util.Map var9 = java.util.Collections.singletonMap((java.lang.Object)var0, (java.lang.Object)var8);
    java.util.Enumeration var10 = java.util.Collections.enumeration((java.util.Collection)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test171() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test171");


    java.util.TreeSet var0 = new java.util.TreeSet();
    var0.clear();
    java.util.TreeSet var2 = new java.util.TreeSet();
    boolean var3 = var0.addAll((java.util.Collection)var2);
    java.util.Enumeration var4 = java.util.Collections.enumeration((java.util.Collection)var0);
    java.util.TreeSet var5 = new java.util.TreeSet((java.util.Collection)var0);
    java.util.Set var6 = java.util.Collections.unmodifiableSet((java.util.Set)var5);
    java.util.TreeSet var7 = new java.util.TreeSet();
    var7.clear();
    java.util.TreeSet var9 = new java.util.TreeSet();
    boolean var10 = var7.addAll((java.util.Collection)var9);
    java.lang.Object var11 = var7.pollLast();
    java.util.TreeSet var12 = new java.util.TreeSet();
    java.lang.Object var13 = var7.floor((java.lang.Object)var12);
    java.lang.Object var15 = var12.floor((java.lang.Object)(byte)1);
    java.util.TreeSet var16 = new java.util.TreeSet();
    var16.clear();
    java.util.TreeSet var18 = new java.util.TreeSet();
    boolean var19 = var16.addAll((java.util.Collection)var18);
    boolean var20 = var12.removeAll((java.util.Collection)var16);
    boolean var21 = var5.addAll((java.util.Collection)var12);
    java.lang.Object var22 = var5.pollLast();
    java.lang.Object var23 = var5.pollFirst();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);

  }

  public void test172() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test172");


    java.util.TreeSet var0 = new java.util.TreeSet();
    var0.clear();
    java.util.TreeSet var2 = new java.util.TreeSet();
    boolean var3 = var0.addAll((java.util.Collection)var2);
    java.util.Enumeration var4 = java.util.Collections.enumeration((java.util.Collection)var0);
    java.util.ArrayList var5 = java.util.Collections.list(var4);
    java.util.ArrayList var6 = java.util.Collections.list(var4);
    java.util.Comparator var7 = java.util.Collections.reverseOrder();
    java.util.Collections.sort((java.util.List)var6, var7);
    java.util.TreeSet var9 = new java.util.TreeSet();
    var9.clear();
    java.util.TreeSet var11 = new java.util.TreeSet();
    boolean var12 = var9.addAll((java.util.Collection)var11);
    java.util.Enumeration var13 = java.util.Collections.enumeration((java.util.Collection)var9);
    java.util.ArrayList var14 = java.util.Collections.list(var13);
    java.util.ArrayList var15 = java.util.Collections.list(var13);
    java.util.Comparator var16 = java.util.Collections.reverseOrder();
    java.util.Collections.sort((java.util.List)var15, var16);
    java.util.Collections.copy((java.util.List)var6, (java.util.List)var15);
    java.util.List var19 = java.util.Collections.unmodifiableList((java.util.List)var15);
    java.util.TreeSet var20 = new java.util.TreeSet();
    var20.clear();
    java.util.TreeSet var22 = new java.util.TreeSet();
    boolean var23 = var20.addAll((java.util.Collection)var22);
    java.util.Enumeration var24 = java.util.Collections.enumeration((java.util.Collection)var20);
    java.util.ArrayList var25 = java.util.Collections.list(var24);
    java.util.TreeSet var26 = new java.util.TreeSet();
    var26.clear();
    java.util.TreeSet var28 = new java.util.TreeSet();
    boolean var29 = var26.addAll((java.util.Collection)var28);
    java.util.Enumeration var30 = java.util.Collections.enumeration((java.util.Collection)var26);
    java.util.Iterator var31 = var26.descendingIterator();
    java.util.List var32 = java.util.Collections.singletonList((java.lang.Object)var31);
    java.util.TreeSet var33 = new java.util.TreeSet();
    var33.clear();
    java.util.TreeSet var35 = new java.util.TreeSet();
    boolean var36 = var33.addAll((java.util.Collection)var35);
    java.util.Enumeration var37 = java.util.Collections.enumeration((java.util.Collection)var33);
    java.util.ArrayList var38 = java.util.Collections.list(var37);
    java.util.Collections.copy(var32, (java.util.List)var38);
    int var40 = java.util.Collections.lastIndexOfSubList((java.util.List)var25, (java.util.List)var38);
    java.util.TreeSet var42 = new java.util.TreeSet();
    var42.clear();
    java.util.TreeSet var44 = new java.util.TreeSet();
    var44.clear();
    java.util.TreeSet var46 = new java.util.TreeSet();
    boolean var47 = var44.addAll((java.util.Collection)var46);
    java.lang.Object var48 = var44.pollLast();
    java.util.TreeSet var49 = new java.util.TreeSet();
    java.lang.Object var50 = var44.floor((java.lang.Object)var49);
    boolean var51 = var42.containsAll((java.util.Collection)var49);
    boolean var52 = java.util.Collections.replaceAll((java.util.List)var25, (java.lang.Object)"hi!", (java.lang.Object)var42);
    int var53 = java.util.Collections.binarySearch(var19, (java.lang.Object)var42);
    java.util.Collections.reverse(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == (-1));

  }

  public void test173() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test173");


    java.util.TreeSet var0 = new java.util.TreeSet();
    var0.clear();
    java.util.TreeSet var2 = new java.util.TreeSet();
    boolean var3 = var0.addAll((java.util.Collection)var2);
    java.lang.Object var4 = var2.pollFirst();
    boolean var6 = var2.remove((java.lang.Object)'#');
    java.util.List var7 = java.util.Collections.emptyList();
    java.lang.Object var8 = var2.ceiling((java.lang.Object)var7);
    java.util.Collections.reverse(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);

  }

  public void test174() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test174");


    java.util.TreeSet var0 = new java.util.TreeSet();
    var0.clear();
    java.util.TreeSet var2 = new java.util.TreeSet();
    var2.clear();
    java.util.TreeSet var4 = new java.util.TreeSet();
    boolean var5 = var2.addAll((java.util.Collection)var4);
    java.lang.Object var6 = var2.pollLast();
    java.util.TreeSet var7 = new java.util.TreeSet();
    java.lang.Object var8 = var2.floor((java.lang.Object)var7);
    boolean var9 = var0.containsAll((java.util.Collection)var7);
    java.util.Set var10 = java.util.Collections.synchronizedSet((java.util.Set)var0);
    java.util.TreeSet var11 = new java.util.TreeSet();
    var11.clear();
    java.util.TreeSet var13 = new java.util.TreeSet();
    boolean var14 = var11.addAll((java.util.Collection)var13);
    java.util.Enumeration var15 = java.util.Collections.enumeration((java.util.Collection)var11);
    java.util.ArrayList var16 = java.util.Collections.list(var15);
    java.util.ArrayList var17 = java.util.Collections.list(var15);
    java.util.Comparator var18 = java.util.Collections.reverseOrder();
    java.util.Collections.sort((java.util.List)var17, var18);
    java.util.TreeSet var20 = new java.util.TreeSet(var18);
    java.util.Comparator var21 = java.util.Collections.reverseOrder(var18);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.SortedSet var22 = var0.headSet((java.lang.Object)var18);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);

  }

  public void test175() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test175");


    java.util.TreeSet var0 = new java.util.TreeSet();
    var0.clear();
    java.util.TreeSet var2 = new java.util.TreeSet();
    boolean var3 = var0.addAll((java.util.Collection)var2);
    java.lang.Object var4 = var0.pollLast();
    java.util.TreeSet var5 = new java.util.TreeSet();
    java.lang.Object var6 = var0.floor((java.lang.Object)var5);
    java.lang.Object var7 = var5.pollLast();
    java.util.SortedSet var8 = java.util.Collections.synchronizedSortedSet((java.util.SortedSet)var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test176() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test176");


    java.util.TreeSet var0 = new java.util.TreeSet();
    var0.clear();
    java.util.TreeSet var2 = new java.util.TreeSet();
    var2.clear();
    java.util.TreeSet var4 = new java.util.TreeSet();
    boolean var5 = var2.addAll((java.util.Collection)var4);
    java.lang.Object var6 = var2.pollLast();
    java.util.TreeSet var7 = new java.util.TreeSet();
    java.lang.Object var8 = var2.floor((java.lang.Object)var7);
    boolean var9 = var0.containsAll((java.util.Collection)var7);
    java.util.Set var10 = java.util.Collections.synchronizedSet((java.util.Set)var0);
    java.util.TreeSet var11 = new java.util.TreeSet();
    var11.clear();
    java.util.TreeSet var13 = new java.util.TreeSet();
    boolean var14 = var11.addAll((java.util.Collection)var13);
    java.util.Enumeration var15 = java.util.Collections.enumeration((java.util.Collection)var11);
    java.util.TreeSet var16 = new java.util.TreeSet((java.util.Collection)var11);
    java.util.Iterator var17 = var16.descendingIterator();
    java.util.TreeSet var18 = new java.util.TreeSet();
    var18.clear();
    java.util.TreeSet var20 = new java.util.TreeSet();
    boolean var21 = var18.addAll((java.util.Collection)var20);
    java.util.Enumeration var22 = java.util.Collections.enumeration((java.util.Collection)var18);
    java.util.ArrayList var23 = java.util.Collections.list(var22);
    java.util.ArrayList var24 = java.util.Collections.list(var22);
    java.util.Collection var25 = java.util.Collections.unmodifiableCollection((java.util.Collection)var24);
    boolean var26 = var16.containsAll((java.util.Collection)var24);
    java.lang.Object var27 = var16.pollFirst();
    java.lang.Object var28 = var0.floor((java.lang.Object)var16);
    java.util.TreeSet var29 = new java.util.TreeSet((java.util.Collection)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var28);

  }

  public void test177() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test177");


    java.util.TreeSet var0 = new java.util.TreeSet();
    var0.clear();
    java.util.TreeSet var2 = new java.util.TreeSet();
    boolean var3 = var0.addAll((java.util.Collection)var2);
    java.util.Enumeration var4 = java.util.Collections.enumeration((java.util.Collection)var0);
    java.lang.String var5 = var0.toString();
    java.util.TreeSet var6 = new java.util.TreeSet();
    var6.clear();
    java.util.TreeSet var8 = new java.util.TreeSet();
    boolean var9 = var6.addAll((java.util.Collection)var8);
    java.util.Enumeration var10 = java.util.Collections.enumeration((java.util.Collection)var6);
    java.util.NavigableSet var11 = var6.descendingSet();
    java.util.TreeSet var12 = new java.util.TreeSet();
    var12.clear();
    java.util.TreeSet var14 = new java.util.TreeSet();
    boolean var15 = var12.addAll((java.util.Collection)var14);
    java.util.Enumeration var16 = java.util.Collections.enumeration((java.util.Collection)var12);
    java.util.TreeSet var17 = new java.util.TreeSet((java.util.Collection)var12);
    java.lang.Object var19 = var12.floor((java.lang.Object)false);
    java.lang.Object var21 = var12.floor((java.lang.Object)(short)(-1));
    java.util.TreeSet var22 = new java.util.TreeSet();
    var22.clear();
    java.util.TreeSet var24 = new java.util.TreeSet();
    boolean var25 = var22.addAll((java.util.Collection)var24);
    java.util.Enumeration var26 = java.util.Collections.enumeration((java.util.Collection)var22);
    java.util.TreeSet var27 = new java.util.TreeSet((java.util.Collection)var22);
    java.lang.Object var29 = var22.floor((java.lang.Object)false);
    java.util.TreeSet var30 = new java.util.TreeSet();
    var30.clear();
    java.util.TreeSet var32 = new java.util.TreeSet();
    boolean var33 = var30.addAll((java.util.Collection)var32);
    java.util.Enumeration var34 = java.util.Collections.enumeration((java.util.Collection)var30);
    java.util.NavigableSet var35 = var30.descendingSet();
    boolean var36 = var22.addAll((java.util.Collection)var35);
    java.lang.Object[] var37 = new java.lang.Object[] { var36};
    boolean var38 = java.util.Collections.addAll((java.util.Collection)var12, var37);
    java.util.Map var39 = java.util.Collections.singletonMap((java.lang.Object)var11, (java.lang.Object)var12);
    boolean var40 = java.util.Collections.disjoint((java.util.Collection)var0, (java.util.Collection)var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "[]"+ "'", var5.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == true);

  }

  public void test178() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test178");


    java.util.TreeSet var0 = new java.util.TreeSet();
    java.lang.Object var2 = var0.ceiling((java.lang.Object)false);
    java.lang.Object var3 = var0.clone();
    java.util.TreeSet var4 = new java.util.TreeSet();
    var4.clear();
    java.util.TreeSet var6 = new java.util.TreeSet();
    boolean var7 = var4.addAll((java.util.Collection)var6);
    java.util.Enumeration var8 = java.util.Collections.enumeration((java.util.Collection)var4);
    java.util.TreeSet var9 = new java.util.TreeSet();
    var9.clear();
    java.util.TreeSet var11 = new java.util.TreeSet();
    boolean var12 = var9.addAll((java.util.Collection)var11);
    java.lang.Object var13 = var9.pollLast();
    java.util.TreeSet var14 = new java.util.TreeSet();
    java.lang.Object var15 = var9.floor((java.lang.Object)var14);
    java.lang.Object var17 = var14.floor((java.lang.Object)(byte)1);
    int var18 = java.util.Collections.frequency((java.util.Collection)var4, (java.lang.Object)var14);
    java.lang.Object[] var19 = var4.toArray();
    boolean var20 = java.util.Collections.addAll((java.util.Collection)var0, var19);
    java.util.TreeSet var21 = new java.util.TreeSet();
    var21.clear();
    java.util.TreeSet var23 = new java.util.TreeSet();
    boolean var24 = var21.addAll((java.util.Collection)var23);
    java.util.Enumeration var25 = java.util.Collections.enumeration((java.util.Collection)var21);
    java.util.ArrayList var26 = java.util.Collections.list(var25);
    java.util.ArrayList var27 = java.util.Collections.list(var25);
    java.util.TreeSet var28 = new java.util.TreeSet();
    var28.clear();
    java.util.TreeSet var30 = new java.util.TreeSet();
    boolean var31 = var28.addAll((java.util.Collection)var30);
    java.util.Enumeration var32 = java.util.Collections.enumeration((java.util.Collection)var28);
    java.util.Iterator var33 = var28.descendingIterator();
    java.util.List var34 = java.util.Collections.singletonList((java.lang.Object)var33);
    java.util.TreeSet var35 = new java.util.TreeSet();
    var35.clear();
    java.util.TreeSet var37 = new java.util.TreeSet();
    boolean var38 = var35.addAll((java.util.Collection)var37);
    java.util.Enumeration var39 = java.util.Collections.enumeration((java.util.Collection)var35);
    java.util.ArrayList var40 = java.util.Collections.list(var39);
    java.util.Collections.copy(var34, (java.util.List)var40);
    java.util.TreeSet var43 = new java.util.TreeSet();
    var43.clear();
    java.util.TreeSet var45 = new java.util.TreeSet();
    boolean var46 = var43.addAll((java.util.Collection)var45);
    java.lang.Object var47 = var45.pollFirst();
    boolean var48 = java.util.Collections.replaceAll(var34, (java.lang.Object)1L, (java.lang.Object)var45);
    java.util.Collections.fill((java.util.List)var27, (java.lang.Object)var45);
    boolean var50 = var0.retainAll((java.util.Collection)var27);
    java.util.NavigableSet var53 = var0.tailSet((java.lang.Object)10, true);
    java.util.Collection var54 = java.util.Collections.synchronizedCollection((java.util.Collection)var53);
    java.util.TreeSet var55 = new java.util.TreeSet();
    var55.clear();
    java.util.TreeSet var57 = new java.util.TreeSet();
    boolean var58 = var55.addAll((java.util.Collection)var57);
    java.util.Enumeration var59 = java.util.Collections.enumeration((java.util.Collection)var55);
    java.util.TreeSet var60 = new java.util.TreeSet((java.util.Collection)var55);
    java.util.TreeSet var61 = new java.util.TreeSet((java.util.SortedSet)var60);
    int var62 = java.util.Collections.frequency(var54, (java.lang.Object)var61);
    boolean var64 = var61.remove((java.lang.Object)"[]");
    boolean var66 = var61.remove((java.lang.Object)(-1L));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var66 == false);

  }

  public void test179() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test179");


    java.util.Comparator var0 = java.util.Collections.reverseOrder();
    java.util.Comparator var1 = java.util.Collections.reverseOrder(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test180() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test180");


    java.util.TreeSet var0 = new java.util.TreeSet();
    var0.clear();
    java.util.TreeSet var2 = new java.util.TreeSet();
    boolean var3 = var0.addAll((java.util.Collection)var2);
    java.lang.Object var4 = var0.pollLast();
    java.util.TreeSet var5 = new java.util.TreeSet();
    java.lang.Object var6 = var0.floor((java.lang.Object)var5);
    java.lang.Object var8 = var5.floor((java.lang.Object)(byte)1);
    java.util.TreeSet var9 = new java.util.TreeSet();
    var9.clear();
    java.util.TreeSet var11 = new java.util.TreeSet();
    boolean var12 = var9.addAll((java.util.Collection)var11);
    boolean var13 = var5.removeAll((java.util.Collection)var9);
    java.util.Iterator var14 = var9.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test181() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test181");


    java.util.TreeSet var0 = new java.util.TreeSet();
    var0.clear();
    java.util.TreeSet var2 = new java.util.TreeSet();
    boolean var3 = var0.addAll((java.util.Collection)var2);
    java.util.Enumeration var4 = java.util.Collections.enumeration((java.util.Collection)var0);
    java.util.TreeSet var5 = new java.util.TreeSet((java.util.Collection)var0);
    java.util.TreeSet var6 = new java.util.TreeSet((java.util.SortedSet)var5);
    java.util.TreeSet var7 = new java.util.TreeSet();
    var7.clear();
    java.util.TreeSet var9 = new java.util.TreeSet();
    boolean var10 = var7.addAll((java.util.Collection)var9);
    java.util.Enumeration var11 = java.util.Collections.enumeration((java.util.Collection)var7);
    java.util.TreeSet var12 = new java.util.TreeSet((java.util.Collection)var7);
    java.util.TreeSet var13 = new java.util.TreeSet((java.util.SortedSet)var12);
    java.lang.Object var14 = var6.lower((java.lang.Object)var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);

  }

  public void test182() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test182");


    java.util.TreeSet var0 = new java.util.TreeSet();
    java.lang.Object var2 = var0.ceiling((java.lang.Object)false);
    java.lang.Object var3 = var0.clone();
    java.util.Comparator var4 = var0.comparator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test183() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test183");


    java.util.TreeSet var0 = new java.util.TreeSet();
    var0.clear();
    java.util.TreeSet var2 = new java.util.TreeSet();
    boolean var3 = var0.addAll((java.util.Collection)var2);
    java.util.Enumeration var4 = java.util.Collections.enumeration((java.util.Collection)var0);
    java.util.ArrayList var5 = java.util.Collections.list(var4);
    java.util.ArrayList var6 = java.util.Collections.list(var4);
    java.util.Comparator var7 = java.util.Collections.reverseOrder();
    java.util.Collections.sort((java.util.List)var6, var7);
    java.util.TreeSet var9 = new java.util.TreeSet();
    var9.clear();
    java.util.TreeSet var11 = new java.util.TreeSet();
    boolean var12 = var9.addAll((java.util.Collection)var11);
    java.util.Enumeration var13 = java.util.Collections.enumeration((java.util.Collection)var9);
    java.util.ArrayList var14 = java.util.Collections.list(var13);
    java.util.ArrayList var15 = java.util.Collections.list(var13);
    java.util.Comparator var16 = java.util.Collections.reverseOrder();
    java.util.Collections.sort((java.util.List)var15, var16);
    java.util.Collections.copy((java.util.List)var6, (java.util.List)var15);
    java.util.List var19 = java.util.Collections.unmodifiableList((java.util.List)var15);
    java.util.TreeSet var20 = new java.util.TreeSet();
    var20.clear();
    java.util.TreeSet var22 = new java.util.TreeSet();
    boolean var23 = var20.addAll((java.util.Collection)var22);
    java.util.Enumeration var24 = java.util.Collections.enumeration((java.util.Collection)var20);
    java.util.ArrayList var25 = java.util.Collections.list(var24);
    java.util.TreeSet var26 = new java.util.TreeSet();
    var26.clear();
    java.util.TreeSet var28 = new java.util.TreeSet();
    boolean var29 = var26.addAll((java.util.Collection)var28);
    java.util.Enumeration var30 = java.util.Collections.enumeration((java.util.Collection)var26);
    java.util.Iterator var31 = var26.descendingIterator();
    java.util.List var32 = java.util.Collections.singletonList((java.lang.Object)var31);
    java.util.TreeSet var33 = new java.util.TreeSet();
    var33.clear();
    java.util.TreeSet var35 = new java.util.TreeSet();
    boolean var36 = var33.addAll((java.util.Collection)var35);
    java.util.Enumeration var37 = java.util.Collections.enumeration((java.util.Collection)var33);
    java.util.ArrayList var38 = java.util.Collections.list(var37);
    java.util.Collections.copy(var32, (java.util.List)var38);
    int var40 = java.util.Collections.lastIndexOfSubList((java.util.List)var25, (java.util.List)var38);
    java.util.TreeSet var42 = new java.util.TreeSet();
    var42.clear();
    java.util.TreeSet var44 = new java.util.TreeSet();
    var44.clear();
    java.util.TreeSet var46 = new java.util.TreeSet();
    boolean var47 = var44.addAll((java.util.Collection)var46);
    java.lang.Object var48 = var44.pollLast();
    java.util.TreeSet var49 = new java.util.TreeSet();
    java.lang.Object var50 = var44.floor((java.lang.Object)var49);
    boolean var51 = var42.containsAll((java.util.Collection)var49);
    boolean var52 = java.util.Collections.replaceAll((java.util.List)var25, (java.lang.Object)"hi!", (java.lang.Object)var42);
    int var53 = java.util.Collections.binarySearch(var19, (java.lang.Object)var42);
    int var55 = java.util.Collections.frequency((java.util.Collection)var42, (java.lang.Object)(short)100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == 0);

  }

  public void test184() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test184");


    java.util.TreeSet var0 = new java.util.TreeSet();
    var0.clear();
    java.util.TreeSet var2 = new java.util.TreeSet();
    boolean var3 = var0.addAll((java.util.Collection)var2);
    java.util.Enumeration var4 = java.util.Collections.enumeration((java.util.Collection)var0);
    java.util.Iterator var5 = var0.descendingIterator();
    java.util.List var6 = java.util.Collections.singletonList((java.lang.Object)var5);
    java.util.TreeSet var7 = new java.util.TreeSet();
    var7.clear();
    java.util.TreeSet var9 = new java.util.TreeSet();
    boolean var10 = var7.addAll((java.util.Collection)var9);
    java.util.Enumeration var11 = java.util.Collections.enumeration((java.util.Collection)var7);
    java.util.ArrayList var12 = java.util.Collections.list(var11);
    java.util.Collections.copy(var6, (java.util.List)var12);
    java.util.TreeSet var15 = new java.util.TreeSet();
    var15.clear();
    java.util.TreeSet var17 = new java.util.TreeSet();
    boolean var18 = var15.addAll((java.util.Collection)var17);
    java.lang.Object var19 = var17.pollFirst();
    boolean var20 = java.util.Collections.replaceAll(var6, (java.lang.Object)1L, (java.lang.Object)var17);
    java.util.List var21 = java.util.Collections.singletonList((java.lang.Object)var20);
    java.util.List var22 = java.util.Collections.unmodifiableList(var21);
    java.util.TreeSet var24 = new java.util.TreeSet();
    var24.clear();
    java.util.TreeSet var26 = new java.util.TreeSet();
    boolean var27 = var24.addAll((java.util.Collection)var26);
    java.util.Enumeration var28 = java.util.Collections.enumeration((java.util.Collection)var24);
    java.util.TreeSet var29 = new java.util.TreeSet((java.util.Collection)var24);
    java.util.Iterator var30 = var29.descendingIterator();
    java.util.TreeSet var31 = new java.util.TreeSet();
    var31.clear();
    java.util.TreeSet var33 = new java.util.TreeSet();
    boolean var34 = var31.addAll((java.util.Collection)var33);
    java.util.Enumeration var35 = java.util.Collections.enumeration((java.util.Collection)var31);
    java.util.ArrayList var36 = java.util.Collections.list(var35);
    java.util.ArrayList var37 = java.util.Collections.list(var35);
    java.util.Collection var38 = java.util.Collections.unmodifiableCollection((java.util.Collection)var37);
    boolean var39 = var29.containsAll((java.util.Collection)var37);
    java.util.List var40 = java.util.Collections.synchronizedList((java.util.List)var37);
    java.util.TreeSet var41 = new java.util.TreeSet();
    var41.clear();
    java.util.TreeSet var43 = new java.util.TreeSet();
    boolean var44 = var41.addAll((java.util.Collection)var43);
    java.util.Enumeration var45 = java.util.Collections.enumeration((java.util.Collection)var41);
    java.util.ArrayList var46 = java.util.Collections.list(var45);
    java.util.ArrayList var47 = java.util.Collections.list(var45);
    java.util.Comparator var48 = java.util.Collections.reverseOrder();
    java.util.Collections.sort((java.util.List)var47, var48);
    java.util.Collections.sort((java.util.List)var37, var48);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var51 = java.util.Collections.binarySearch(var21, (java.lang.Object)1L, var48);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);

  }

  public void test185() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test185");


    java.util.TreeSet var0 = new java.util.TreeSet();
    var0.clear();
    java.util.TreeSet var2 = new java.util.TreeSet();
    boolean var3 = var0.addAll((java.util.Collection)var2);
    java.lang.Object var4 = var2.pollFirst();
    boolean var6 = var2.remove((java.lang.Object)'#');
    java.util.TreeSet var7 = new java.util.TreeSet();
    var7.clear();
    java.util.TreeSet var9 = new java.util.TreeSet();
    boolean var10 = var7.addAll((java.util.Collection)var9);
    java.util.Enumeration var11 = java.util.Collections.enumeration((java.util.Collection)var7);
    java.util.Iterator var12 = var7.descendingIterator();
    java.lang.Object var13 = var2.higher((java.lang.Object)var12);
    java.lang.Object[] var14 = var2.toArray();
    java.lang.Object var15 = var2.pollLast();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);

  }

  public void test186() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test186");


    java.util.TreeSet var0 = new java.util.TreeSet();
    var0.clear();
    java.util.TreeSet var2 = new java.util.TreeSet();
    boolean var3 = var0.addAll((java.util.Collection)var2);
    java.lang.Object var4 = var2.pollFirst();
    boolean var6 = var2.remove((java.lang.Object)'#');
    java.util.TreeSet var7 = new java.util.TreeSet();
    var7.clear();
    java.util.TreeSet var9 = new java.util.TreeSet();
    boolean var10 = var7.addAll((java.util.Collection)var9);
    java.util.Enumeration var11 = java.util.Collections.enumeration((java.util.Collection)var7);
    java.util.Iterator var12 = var7.descendingIterator();
    java.lang.Object var13 = var2.higher((java.lang.Object)var12);
    java.util.TreeSet var14 = new java.util.TreeSet();
    var14.clear();
    java.util.TreeSet var16 = new java.util.TreeSet();
    boolean var17 = var14.addAll((java.util.Collection)var16);
    java.util.Enumeration var18 = java.util.Collections.enumeration((java.util.Collection)var14);
    java.util.TreeSet var19 = new java.util.TreeSet((java.util.Collection)var14);
    java.lang.Object var21 = var14.floor((java.lang.Object)false);
    java.util.TreeSet var22 = new java.util.TreeSet();
    var22.clear();
    java.util.TreeSet var24 = new java.util.TreeSet();
    boolean var25 = var22.addAll((java.util.Collection)var24);
    java.util.Enumeration var26 = java.util.Collections.enumeration((java.util.Collection)var22);
    java.util.NavigableSet var27 = var22.descendingSet();
    boolean var28 = var14.addAll((java.util.Collection)var27);
    java.lang.Object var29 = var2.floor((java.lang.Object)var28);
    java.lang.Object var30 = var2.clone();
    java.util.Set var31 = java.util.Collections.unmodifiableSet((java.util.Set)var2);
    java.util.TreeSet var32 = new java.util.TreeSet();
    var32.clear();
    java.util.TreeSet var34 = new java.util.TreeSet();
    boolean var35 = var32.addAll((java.util.Collection)var34);
    java.lang.Object var36 = var34.pollFirst();
    java.lang.Object var38 = var34.higher((java.lang.Object)10.0f);
    java.util.Iterator var39 = var34.descendingIterator();
    java.util.TreeSet var40 = new java.util.TreeSet();
    var40.clear();
    java.util.TreeSet var42 = new java.util.TreeSet();
    boolean var43 = var40.addAll((java.util.Collection)var42);
    java.util.Enumeration var44 = java.util.Collections.enumeration((java.util.Collection)var40);
    java.util.TreeSet var45 = new java.util.TreeSet((java.util.Collection)var40);
    java.lang.Object var47 = var40.floor((java.lang.Object)false);
    java.lang.Object var49 = var40.floor((java.lang.Object)(short)(-1));
    java.util.TreeSet var50 = new java.util.TreeSet();
    var50.clear();
    java.util.TreeSet var52 = new java.util.TreeSet();
    boolean var53 = var50.addAll((java.util.Collection)var52);
    java.util.Enumeration var54 = java.util.Collections.enumeration((java.util.Collection)var50);
    java.util.TreeSet var55 = new java.util.TreeSet((java.util.Collection)var50);
    java.lang.Object var57 = var50.floor((java.lang.Object)false);
    java.util.TreeSet var58 = new java.util.TreeSet();
    var58.clear();
    java.util.TreeSet var60 = new java.util.TreeSet();
    boolean var61 = var58.addAll((java.util.Collection)var60);
    java.util.Enumeration var62 = java.util.Collections.enumeration((java.util.Collection)var58);
    java.util.NavigableSet var63 = var58.descendingSet();
    boolean var64 = var50.addAll((java.util.Collection)var63);
    java.lang.Object[] var65 = new java.lang.Object[] { var64};
    boolean var66 = java.util.Collections.addAll((java.util.Collection)var40, var65);
    java.lang.Object[] var67 = var34.toArray(var65);
    java.util.Set var68 = java.util.Collections.synchronizedSet((java.util.Set)var34);
    java.lang.Object[] var69 = var34.toArray();
    java.lang.Object var70 = var2.higher((java.lang.Object)var34);
    java.util.TreeSet var71 = new java.util.TreeSet();
    java.util.TreeSet var72 = new java.util.TreeSet();
    var72.clear();
    java.util.TreeSet var74 = new java.util.TreeSet();
    boolean var75 = var72.addAll((java.util.Collection)var74);
    java.util.Enumeration var76 = java.util.Collections.enumeration((java.util.Collection)var72);
    java.util.TreeSet var77 = new java.util.TreeSet((java.util.Collection)var72);
    java.lang.Object var79 = var72.floor((java.lang.Object)false);
    java.util.TreeSet var80 = new java.util.TreeSet();
    var80.clear();
    java.util.TreeSet var82 = new java.util.TreeSet();
    boolean var83 = var80.addAll((java.util.Collection)var82);
    java.util.Enumeration var84 = java.util.Collections.enumeration((java.util.Collection)var80);
    java.util.NavigableSet var85 = var80.descendingSet();
    boolean var86 = var72.addAll((java.util.Collection)var85);
    java.util.Map var87 = java.util.Collections.singletonMap((java.lang.Object)var71, (java.lang.Object)var72);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.NavigableSet var89 = var34.tailSet((java.lang.Object)var87, true);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var66 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var75 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var79);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var83 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var84);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var85);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var86 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var87);

  }

  public void test187() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test187");


    java.util.TreeSet var0 = new java.util.TreeSet();
    var0.clear();
    java.util.TreeSet var2 = new java.util.TreeSet();
    boolean var3 = var0.addAll((java.util.Collection)var2);
    java.util.Enumeration var4 = java.util.Collections.enumeration((java.util.Collection)var0);
    java.util.ArrayList var5 = java.util.Collections.list(var4);
    java.util.Collections.reverse((java.util.List)var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test188() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test188");


    java.util.TreeSet var0 = new java.util.TreeSet();
    var0.clear();
    java.util.TreeSet var2 = new java.util.TreeSet();
    boolean var3 = var0.addAll((java.util.Collection)var2);
    java.util.Enumeration var4 = java.util.Collections.enumeration((java.util.Collection)var0);
    java.lang.String var5 = var0.toString();
    java.util.Comparator var6 = var0.comparator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "[]"+ "'", var5.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);

  }

  public void test189() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test189");


    java.util.TreeSet var0 = new java.util.TreeSet();
    var0.clear();
    java.util.TreeSet var2 = new java.util.TreeSet();
    boolean var3 = var0.addAll((java.util.Collection)var2);
    java.lang.Object var4 = var0.pollLast();
    java.util.TreeSet var5 = new java.util.TreeSet();
    java.lang.Object var6 = var0.floor((java.lang.Object)var5);
    java.util.TreeSet var7 = new java.util.TreeSet();
    var7.clear();
    java.util.TreeSet var9 = new java.util.TreeSet();
    boolean var10 = var7.addAll((java.util.Collection)var9);
    java.util.Enumeration var11 = java.util.Collections.enumeration((java.util.Collection)var7);
    java.util.TreeSet var12 = new java.util.TreeSet((java.util.Collection)var7);
    java.util.Iterator var13 = var12.descendingIterator();
    java.lang.Object var14 = var5.higher((java.lang.Object)var13);
    java.util.TreeSet var15 = new java.util.TreeSet((java.util.SortedSet)var5);
    java.util.Collection var16 = java.util.Collections.unmodifiableCollection((java.util.Collection)var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test190() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test190");


    java.util.TreeSet var0 = new java.util.TreeSet();
    var0.clear();
    java.util.TreeSet var2 = new java.util.TreeSet();
    boolean var3 = var0.addAll((java.util.Collection)var2);
    java.lang.Object var4 = var2.pollFirst();
    java.util.TreeSet var5 = new java.util.TreeSet();
    var5.clear();
    java.util.TreeSet var7 = new java.util.TreeSet();
    boolean var8 = var5.addAll((java.util.Collection)var7);
    java.util.Enumeration var9 = java.util.Collections.enumeration((java.util.Collection)var5);
    java.util.ArrayList var10 = java.util.Collections.list(var9);
    java.util.ArrayList var11 = java.util.Collections.list(var9);
    java.util.TreeSet var12 = new java.util.TreeSet();
    var12.clear();
    java.util.TreeSet var14 = new java.util.TreeSet();
    boolean var15 = var12.addAll((java.util.Collection)var14);
    java.lang.Object var16 = var14.pollFirst();
    boolean var18 = var14.remove((java.lang.Object)'#');
    java.util.Collections.fill((java.util.List)var11, (java.lang.Object)var18);
    java.util.Collection var20 = java.util.Collections.unmodifiableCollection((java.util.Collection)var11);
    boolean var21 = java.util.Collections.disjoint((java.util.Collection)var2, (java.util.Collection)var11);
    java.util.TreeSet var22 = new java.util.TreeSet((java.util.SortedSet)var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);

  }

  public void test191() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test191");


    java.util.TreeSet var0 = new java.util.TreeSet();
    var0.clear();
    java.util.TreeSet var2 = new java.util.TreeSet();
    boolean var3 = var0.addAll((java.util.Collection)var2);
    java.util.Enumeration var4 = java.util.Collections.enumeration((java.util.Collection)var0);
    java.util.ArrayList var5 = java.util.Collections.list(var4);
    java.util.TreeSet var6 = new java.util.TreeSet();
    var6.clear();
    java.util.TreeSet var8 = new java.util.TreeSet();
    boolean var9 = var6.addAll((java.util.Collection)var8);
    java.util.Enumeration var10 = java.util.Collections.enumeration((java.util.Collection)var6);
    java.util.Iterator var11 = var6.descendingIterator();
    java.util.List var12 = java.util.Collections.singletonList((java.lang.Object)var11);
    java.util.TreeSet var13 = new java.util.TreeSet();
    var13.clear();
    java.util.TreeSet var15 = new java.util.TreeSet();
    boolean var16 = var13.addAll((java.util.Collection)var15);
    java.util.Enumeration var17 = java.util.Collections.enumeration((java.util.Collection)var13);
    java.util.ArrayList var18 = java.util.Collections.list(var17);
    java.util.Collections.copy(var12, (java.util.List)var18);
    int var20 = java.util.Collections.lastIndexOfSubList((java.util.List)var5, (java.util.List)var18);
    java.util.TreeSet var22 = new java.util.TreeSet();
    var22.clear();
    java.util.TreeSet var24 = new java.util.TreeSet();
    var24.clear();
    java.util.TreeSet var26 = new java.util.TreeSet();
    boolean var27 = var24.addAll((java.util.Collection)var26);
    java.lang.Object var28 = var24.pollLast();
    java.util.TreeSet var29 = new java.util.TreeSet();
    java.lang.Object var30 = var24.floor((java.lang.Object)var29);
    boolean var31 = var22.containsAll((java.util.Collection)var29);
    boolean var32 = java.util.Collections.replaceAll((java.util.List)var5, (java.lang.Object)"hi!", (java.lang.Object)var22);
    java.lang.Object[] var33 = var5.toArray();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);

  }

  public void test192() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test192");


    java.util.TreeSet var0 = new java.util.TreeSet();
    var0.clear();
    java.util.TreeSet var2 = new java.util.TreeSet();
    boolean var3 = var0.addAll((java.util.Collection)var2);
    java.util.TreeSet var4 = new java.util.TreeSet();
    var4.clear();
    java.util.TreeSet var6 = new java.util.TreeSet();
    boolean var7 = var4.addAll((java.util.Collection)var6);
    java.lang.Object var8 = var6.pollFirst();
    java.lang.Object var10 = var6.higher((java.lang.Object)10.0f);
    boolean var11 = java.util.Collections.disjoint((java.util.Collection)var0, (java.util.Collection)var6);
    java.util.TreeSet var12 = new java.util.TreeSet();
    var12.clear();
    java.util.TreeSet var14 = new java.util.TreeSet();
    boolean var15 = var12.addAll((java.util.Collection)var14);
    java.util.Enumeration var16 = java.util.Collections.enumeration((java.util.Collection)var12);
    java.util.ArrayList var17 = java.util.Collections.list(var16);
    java.util.ArrayList var18 = java.util.Collections.list(var16);
    java.util.ArrayList var19 = java.util.Collections.list(var16);
    java.util.TreeSet var20 = new java.util.TreeSet();
    var20.clear();
    java.util.TreeSet var22 = new java.util.TreeSet();
    var22.clear();
    java.util.TreeSet var24 = new java.util.TreeSet();
    boolean var25 = var22.addAll((java.util.Collection)var24);
    java.lang.Object var26 = var22.pollLast();
    java.util.TreeSet var27 = new java.util.TreeSet();
    java.lang.Object var28 = var22.floor((java.lang.Object)var27);
    boolean var29 = var20.containsAll((java.util.Collection)var27);
    java.util.TreeSet var30 = new java.util.TreeSet();
    var30.clear();
    java.util.TreeSet var32 = new java.util.TreeSet();
    var32.clear();
    java.util.TreeSet var34 = new java.util.TreeSet();
    boolean var35 = var32.addAll((java.util.Collection)var34);
    java.lang.Object var36 = var32.pollLast();
    java.util.TreeSet var37 = new java.util.TreeSet();
    java.lang.Object var38 = var32.floor((java.lang.Object)var37);
    boolean var39 = var30.containsAll((java.util.Collection)var37);
    java.lang.Object[] var40 = new java.lang.Object[] { var39};
    java.lang.Object[] var41 = var27.toArray(var40);
    java.lang.Object[] var42 = var19.toArray(var40);
    java.util.Collections.shuffle((java.util.List)var19);
    java.util.TreeSet var44 = new java.util.TreeSet();
    var44.clear();
    java.util.TreeSet var46 = new java.util.TreeSet();
    boolean var47 = var44.addAll((java.util.Collection)var46);
    java.util.Enumeration var48 = java.util.Collections.enumeration((java.util.Collection)var44);
    java.util.ArrayList var49 = java.util.Collections.list(var48);
    java.util.ArrayList var50 = java.util.Collections.list(var48);
    java.util.TreeSet var51 = new java.util.TreeSet();
    var51.clear();
    java.util.TreeSet var53 = new java.util.TreeSet();
    boolean var54 = var51.addAll((java.util.Collection)var53);
    java.lang.Object var55 = var53.pollFirst();
    boolean var57 = var53.remove((java.lang.Object)'#');
    java.util.Collections.fill((java.util.List)var50, (java.lang.Object)var57);
    int var59 = java.util.Collections.indexOfSubList((java.util.List)var19, (java.util.List)var50);
    java.util.TreeSet var60 = new java.util.TreeSet();
    var60.clear();
    java.util.TreeSet var62 = new java.util.TreeSet();
    boolean var63 = var60.addAll((java.util.Collection)var62);
    java.lang.Object var64 = var60.pollLast();
    java.util.TreeSet var65 = new java.util.TreeSet();
    java.lang.Object var66 = var60.floor((java.lang.Object)var65);
    java.util.TreeSet var67 = new java.util.TreeSet();
    var67.clear();
    java.util.TreeSet var69 = new java.util.TreeSet();
    boolean var70 = var67.addAll((java.util.Collection)var69);
    java.util.Enumeration var71 = java.util.Collections.enumeration((java.util.Collection)var67);
    java.util.TreeSet var72 = new java.util.TreeSet((java.util.Collection)var67);
    java.util.Iterator var73 = var72.descendingIterator();
    boolean var74 = var72.isEmpty();
    java.util.NavigableSet var76 = var60.headSet((java.lang.Object)var74, false);
    boolean var77 = var50.retainAll((java.util.Collection)var60);
    boolean var78 = var0.containsAll((java.util.Collection)var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var70 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var74 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var77 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var78 == true);

  }

  public void test193() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test193");


    java.util.TreeSet var0 = new java.util.TreeSet();
    java.util.TreeSet var1 = new java.util.TreeSet();
    var1.clear();
    java.util.TreeSet var3 = new java.util.TreeSet();
    boolean var4 = var1.addAll((java.util.Collection)var3);
    java.util.Enumeration var5 = java.util.Collections.enumeration((java.util.Collection)var1);
    java.util.TreeSet var6 = new java.util.TreeSet((java.util.Collection)var1);
    java.util.Iterator var7 = var6.descendingIterator();
    boolean var8 = var0.addAll((java.util.Collection)var6);
    java.lang.Object var9 = var6.pollLast();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);

  }

  public void test194() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test194");


    java.util.TreeSet var0 = new java.util.TreeSet();
    var0.clear();
    java.util.TreeSet var2 = new java.util.TreeSet();
    var2.clear();
    java.util.TreeSet var4 = new java.util.TreeSet();
    boolean var5 = var2.addAll((java.util.Collection)var4);
    java.lang.Object var6 = var2.pollLast();
    java.util.TreeSet var7 = new java.util.TreeSet();
    java.lang.Object var8 = var2.floor((java.lang.Object)var7);
    boolean var9 = var0.containsAll((java.util.Collection)var7);
    java.util.Set var10 = java.util.Collections.synchronizedSet((java.util.Set)var0);
    java.util.TreeSet var11 = new java.util.TreeSet();
    var11.clear();
    java.util.TreeSet var13 = new java.util.TreeSet();
    boolean var14 = var11.addAll((java.util.Collection)var13);
    java.util.Enumeration var15 = java.util.Collections.enumeration((java.util.Collection)var11);
    java.util.TreeSet var16 = new java.util.TreeSet((java.util.Collection)var11);
    java.util.Iterator var17 = var16.descendingIterator();
    java.util.TreeSet var18 = new java.util.TreeSet();
    var18.clear();
    java.util.TreeSet var20 = new java.util.TreeSet();
    boolean var21 = var18.addAll((java.util.Collection)var20);
    java.util.Enumeration var22 = java.util.Collections.enumeration((java.util.Collection)var18);
    java.util.ArrayList var23 = java.util.Collections.list(var22);
    java.util.ArrayList var24 = java.util.Collections.list(var22);
    java.util.Collection var25 = java.util.Collections.unmodifiableCollection((java.util.Collection)var24);
    boolean var26 = var16.containsAll((java.util.Collection)var24);
    java.lang.Object var27 = var16.pollFirst();
    java.lang.Object var28 = var0.floor((java.lang.Object)var16);
    java.util.TreeSet var29 = new java.util.TreeSet();
    var29.clear();
    java.util.TreeSet var31 = new java.util.TreeSet();
    boolean var32 = var29.addAll((java.util.Collection)var31);
    java.util.Enumeration var33 = java.util.Collections.enumeration((java.util.Collection)var29);
    java.util.TreeSet var34 = new java.util.TreeSet((java.util.Collection)var29);
    boolean var35 = var16.removeAll((java.util.Collection)var34);
    java.util.NavigableSet var36 = var16.descendingSet();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);

  }

  public void test195() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test195");


    java.util.TreeSet var0 = new java.util.TreeSet();
    var0.clear();
    java.util.TreeSet var2 = new java.util.TreeSet();
    boolean var3 = var0.addAll((java.util.Collection)var2);
    java.lang.Object var4 = var2.pollFirst();
    boolean var6 = var2.remove((java.lang.Object)'#');
    java.util.TreeSet var7 = new java.util.TreeSet();
    var7.clear();
    java.util.TreeSet var9 = new java.util.TreeSet();
    boolean var10 = var7.addAll((java.util.Collection)var9);
    java.util.Enumeration var11 = java.util.Collections.enumeration((java.util.Collection)var7);
    java.util.Iterator var12 = var7.descendingIterator();
    java.lang.Object var13 = var2.higher((java.lang.Object)var12);
    java.util.TreeSet var14 = new java.util.TreeSet();
    var14.clear();
    java.util.TreeSet var16 = new java.util.TreeSet();
    boolean var17 = var14.addAll((java.util.Collection)var16);
    java.util.Enumeration var18 = java.util.Collections.enumeration((java.util.Collection)var14);
    java.util.TreeSet var19 = new java.util.TreeSet((java.util.Collection)var14);
    java.lang.Object var21 = var14.floor((java.lang.Object)false);
    java.util.TreeSet var22 = new java.util.TreeSet();
    var22.clear();
    java.util.TreeSet var24 = new java.util.TreeSet();
    boolean var25 = var22.addAll((java.util.Collection)var24);
    java.util.Enumeration var26 = java.util.Collections.enumeration((java.util.Collection)var22);
    java.util.NavigableSet var27 = var22.descendingSet();
    boolean var28 = var14.addAll((java.util.Collection)var27);
    java.lang.Object var29 = var2.floor((java.lang.Object)var28);
    java.util.TreeSet var30 = new java.util.TreeSet();
    var30.clear();
    java.util.TreeSet var32 = new java.util.TreeSet();
    boolean var33 = var30.addAll((java.util.Collection)var32);
    java.util.Enumeration var34 = java.util.Collections.enumeration((java.util.Collection)var30);
    java.util.Iterator var35 = var30.descendingIterator();
    java.util.List var36 = java.util.Collections.singletonList((java.lang.Object)var35);
    java.util.TreeSet var37 = new java.util.TreeSet();
    var37.clear();
    java.util.TreeSet var39 = new java.util.TreeSet();
    boolean var40 = var37.addAll((java.util.Collection)var39);
    java.util.Enumeration var41 = java.util.Collections.enumeration((java.util.Collection)var37);
    java.util.ArrayList var42 = java.util.Collections.list(var41);
    java.util.Collections.copy(var36, (java.util.List)var42);
    java.lang.Object var44 = var2.higher((java.lang.Object)var36);
    java.util.List var45 = java.util.Collections.synchronizedList(var36);
    java.util.List var46 = java.util.Collections.synchronizedList(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);

  }

  public void test196() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test196");


    java.util.TreeSet var0 = new java.util.TreeSet();
    var0.clear();
    java.util.TreeSet var2 = new java.util.TreeSet();
    boolean var3 = var0.addAll((java.util.Collection)var2);
    java.lang.Object var4 = var0.pollLast();
    java.util.TreeSet var5 = new java.util.TreeSet();
    java.lang.Object var6 = var0.floor((java.lang.Object)var5);
    java.util.TreeSet var7 = new java.util.TreeSet();
    var7.clear();
    java.util.TreeSet var9 = new java.util.TreeSet();
    boolean var10 = var7.addAll((java.util.Collection)var9);
    java.util.Enumeration var11 = java.util.Collections.enumeration((java.util.Collection)var7);
    java.util.TreeSet var12 = new java.util.TreeSet((java.util.Collection)var7);
    java.util.Iterator var13 = var12.descendingIterator();
    java.lang.Object var14 = var5.higher((java.lang.Object)var13);
    java.util.TreeSet var15 = new java.util.TreeSet();
    var15.clear();
    java.util.TreeSet var17 = new java.util.TreeSet();
    boolean var18 = var15.addAll((java.util.Collection)var17);
    java.util.Enumeration var19 = java.util.Collections.enumeration((java.util.Collection)var15);
    java.util.ArrayList var20 = java.util.Collections.list(var19);
    java.util.ArrayList var21 = java.util.Collections.list(var19);
    java.util.ArrayList var22 = java.util.Collections.list(var19);
    java.util.TreeSet var23 = new java.util.TreeSet();
    var23.clear();
    java.util.TreeSet var25 = new java.util.TreeSet();
    var25.clear();
    java.util.TreeSet var27 = new java.util.TreeSet();
    boolean var28 = var25.addAll((java.util.Collection)var27);
    java.lang.Object var29 = var25.pollLast();
    java.util.TreeSet var30 = new java.util.TreeSet();
    java.lang.Object var31 = var25.floor((java.lang.Object)var30);
    boolean var32 = var23.containsAll((java.util.Collection)var30);
    java.util.TreeSet var33 = new java.util.TreeSet();
    var33.clear();
    java.util.TreeSet var35 = new java.util.TreeSet();
    var35.clear();
    java.util.TreeSet var37 = new java.util.TreeSet();
    boolean var38 = var35.addAll((java.util.Collection)var37);
    java.lang.Object var39 = var35.pollLast();
    java.util.TreeSet var40 = new java.util.TreeSet();
    java.lang.Object var41 = var35.floor((java.lang.Object)var40);
    boolean var42 = var33.containsAll((java.util.Collection)var40);
    java.lang.Object[] var43 = new java.lang.Object[] { var42};
    java.lang.Object[] var44 = var30.toArray(var43);
    java.lang.Object[] var45 = var22.toArray(var43);
    java.util.Collections.shuffle((java.util.List)var22);
    java.util.TreeSet var47 = new java.util.TreeSet();
    var47.clear();
    java.util.TreeSet var49 = new java.util.TreeSet();
    boolean var50 = var47.addAll((java.util.Collection)var49);
    java.util.Enumeration var51 = java.util.Collections.enumeration((java.util.Collection)var47);
    java.util.ArrayList var52 = java.util.Collections.list(var51);
    java.util.ArrayList var53 = java.util.Collections.list(var51);
    java.util.TreeSet var54 = new java.util.TreeSet();
    var54.clear();
    java.util.TreeSet var56 = new java.util.TreeSet();
    boolean var57 = var54.addAll((java.util.Collection)var56);
    java.lang.Object var58 = var56.pollFirst();
    boolean var60 = var56.remove((java.lang.Object)'#');
    java.util.Collections.fill((java.util.List)var53, (java.lang.Object)var60);
    int var62 = java.util.Collections.indexOfSubList((java.util.List)var22, (java.util.List)var53);
    java.util.TreeSet var63 = new java.util.TreeSet();
    var63.clear();
    java.util.TreeSet var65 = new java.util.TreeSet();
    boolean var66 = var63.addAll((java.util.Collection)var65);
    java.lang.Object var67 = var63.pollLast();
    java.util.TreeSet var68 = new java.util.TreeSet();
    java.lang.Object var69 = var63.floor((java.lang.Object)var68);
    java.util.TreeSet var70 = new java.util.TreeSet();
    var70.clear();
    java.util.TreeSet var72 = new java.util.TreeSet();
    boolean var73 = var70.addAll((java.util.Collection)var72);
    java.util.Enumeration var74 = java.util.Collections.enumeration((java.util.Collection)var70);
    java.util.TreeSet var75 = new java.util.TreeSet((java.util.Collection)var70);
    java.util.Iterator var76 = var75.descendingIterator();
    boolean var77 = var75.isEmpty();
    java.util.NavigableSet var79 = var63.headSet((java.lang.Object)var77, false);
    boolean var80 = var53.retainAll((java.util.Collection)var63);
    boolean var81 = var5.add((java.lang.Object)var80);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var66 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var73 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var77 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var79);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var80 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var81 == true);

  }

  public void test197() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test197");


    java.util.TreeSet var0 = new java.util.TreeSet();
    var0.clear();
    java.util.TreeSet var2 = new java.util.TreeSet();
    boolean var3 = var0.addAll((java.util.Collection)var2);
    java.lang.Object var4 = var2.pollFirst();
    boolean var6 = var2.remove((java.lang.Object)'#');
    java.util.TreeSet var7 = new java.util.TreeSet();
    var7.clear();
    java.util.TreeSet var9 = new java.util.TreeSet();
    boolean var10 = var7.addAll((java.util.Collection)var9);
    java.util.Enumeration var11 = java.util.Collections.enumeration((java.util.Collection)var7);
    java.util.Iterator var12 = var7.descendingIterator();
    java.lang.Object var13 = var2.higher((java.lang.Object)var12);
    java.util.TreeSet var14 = new java.util.TreeSet();
    var14.clear();
    java.util.TreeSet var16 = new java.util.TreeSet();
    boolean var17 = var14.addAll((java.util.Collection)var16);
    java.lang.Object var18 = var14.pollLast();
    java.util.TreeSet var19 = new java.util.TreeSet();
    java.lang.Object var20 = var14.floor((java.lang.Object)var19);
    java.lang.Object var21 = var2.floor((java.lang.Object)var14);
    java.util.TreeSet var22 = new java.util.TreeSet();
    var22.clear();
    java.util.TreeSet var24 = new java.util.TreeSet();
    var24.clear();
    java.util.TreeSet var26 = new java.util.TreeSet();
    boolean var27 = var24.addAll((java.util.Collection)var26);
    java.lang.Object var28 = var24.pollLast();
    java.util.TreeSet var29 = new java.util.TreeSet();
    java.lang.Object var30 = var24.floor((java.lang.Object)var29);
    boolean var31 = var22.containsAll((java.util.Collection)var29);
    java.util.Set var32 = java.util.Collections.singleton((java.lang.Object)var22);
    java.util.Comparator var33 = var22.comparator();
    boolean var35 = var22.add((java.lang.Object)100);
    java.lang.Object var36 = var2.higher((java.lang.Object)100);
    java.lang.String var37 = var2.toString();
    java.util.TreeSet var38 = new java.util.TreeSet((java.util.SortedSet)var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var37 + "' != '" + "[]"+ "'", var37.equals("[]"));

  }

  public void test198() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test198");


    java.util.TreeSet var0 = new java.util.TreeSet();
    var0.clear();
    java.util.TreeSet var2 = new java.util.TreeSet();
    boolean var3 = var0.addAll((java.util.Collection)var2);
    java.lang.Object var4 = var2.pollFirst();
    java.util.TreeSet var5 = new java.util.TreeSet();
    var5.clear();
    java.util.TreeSet var7 = new java.util.TreeSet();
    boolean var8 = var5.addAll((java.util.Collection)var7);
    java.util.Map var9 = java.util.Collections.singletonMap((java.lang.Object)var2, (java.lang.Object)var5);
    java.util.Iterator var10 = var2.iterator();
    java.util.TreeSet var11 = new java.util.TreeSet();
    java.lang.Object var13 = var11.ceiling((java.lang.Object)false);
    java.lang.Object var14 = var11.clone();
    java.util.TreeSet var15 = new java.util.TreeSet();
    var15.clear();
    java.util.TreeSet var17 = new java.util.TreeSet();
    boolean var18 = var15.addAll((java.util.Collection)var17);
    java.util.Enumeration var19 = java.util.Collections.enumeration((java.util.Collection)var15);
    java.util.TreeSet var20 = new java.util.TreeSet();
    var20.clear();
    java.util.TreeSet var22 = new java.util.TreeSet();
    boolean var23 = var20.addAll((java.util.Collection)var22);
    java.lang.Object var24 = var20.pollLast();
    java.util.TreeSet var25 = new java.util.TreeSet();
    java.lang.Object var26 = var20.floor((java.lang.Object)var25);
    java.lang.Object var28 = var25.floor((java.lang.Object)(byte)1);
    int var29 = java.util.Collections.frequency((java.util.Collection)var15, (java.lang.Object)var25);
    java.lang.Object[] var30 = var15.toArray();
    boolean var31 = java.util.Collections.addAll((java.util.Collection)var11, var30);
    java.util.SortedSet var32 = java.util.Collections.synchronizedSortedSet((java.util.SortedSet)var11);
    java.util.Map var33 = java.util.Collections.singletonMap((java.lang.Object)var10, (java.lang.Object)var11);
    java.util.Map var34 = java.util.Collections.synchronizedMap(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);

  }

  public void test199() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test199");


    java.util.TreeSet var0 = new java.util.TreeSet();
    var0.clear();
    java.util.TreeSet var2 = new java.util.TreeSet();
    boolean var3 = var0.addAll((java.util.Collection)var2);
    java.util.Enumeration var4 = java.util.Collections.enumeration((java.util.Collection)var0);
    java.util.ArrayList var5 = java.util.Collections.list(var4);
    java.util.ArrayList var6 = java.util.Collections.list(var4);
    java.util.ArrayList var7 = java.util.Collections.list(var4);
    java.util.TreeSet var8 = new java.util.TreeSet();
    var8.clear();
    java.util.TreeSet var10 = new java.util.TreeSet();
    var10.clear();
    java.util.TreeSet var12 = new java.util.TreeSet();
    boolean var13 = var10.addAll((java.util.Collection)var12);
    java.lang.Object var14 = var10.pollLast();
    java.util.TreeSet var15 = new java.util.TreeSet();
    java.lang.Object var16 = var10.floor((java.lang.Object)var15);
    boolean var17 = var8.containsAll((java.util.Collection)var15);
    java.util.TreeSet var18 = new java.util.TreeSet();
    var18.clear();
    java.util.TreeSet var20 = new java.util.TreeSet();
    var20.clear();
    java.util.TreeSet var22 = new java.util.TreeSet();
    boolean var23 = var20.addAll((java.util.Collection)var22);
    java.lang.Object var24 = var20.pollLast();
    java.util.TreeSet var25 = new java.util.TreeSet();
    java.lang.Object var26 = var20.floor((java.lang.Object)var25);
    boolean var27 = var18.containsAll((java.util.Collection)var25);
    java.lang.Object[] var28 = new java.lang.Object[] { var27};
    java.lang.Object[] var29 = var15.toArray(var28);
    java.lang.Object[] var30 = var7.toArray(var28);
    java.util.Collections.shuffle((java.util.List)var7);
    java.util.TreeSet var32 = new java.util.TreeSet();
    var32.clear();
    java.util.TreeSet var34 = new java.util.TreeSet();
    boolean var35 = var32.addAll((java.util.Collection)var34);
    java.util.TreeSet var36 = new java.util.TreeSet();
    var36.clear();
    java.util.TreeSet var38 = new java.util.TreeSet();
    boolean var39 = var36.addAll((java.util.Collection)var38);
    java.lang.Object var40 = var38.pollFirst();
    java.lang.Object var42 = var38.higher((java.lang.Object)10.0f);
    boolean var43 = java.util.Collections.disjoint((java.util.Collection)var32, (java.util.Collection)var38);
    java.lang.Object var44 = var32.clone();
    java.lang.String var45 = var32.toString();
    java.util.Collections.fill((java.util.List)var7, (java.lang.Object)var32);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var47 = java.util.Collections.max((java.util.Collection)var7);
      fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var45 + "' != '" + "[]"+ "'", var45.equals("[]"));

  }

  public void test200() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test200");


    java.util.TreeSet var0 = new java.util.TreeSet();
    var0.clear();
    java.util.TreeSet var2 = new java.util.TreeSet();
    boolean var3 = var0.addAll((java.util.Collection)var2);
    java.util.Enumeration var4 = java.util.Collections.enumeration((java.util.Collection)var0);
    java.util.ArrayList var5 = java.util.Collections.list(var4);
    java.util.ArrayList var6 = java.util.Collections.list(var4);
    java.util.ArrayList var7 = java.util.Collections.list(var4);
    java.util.TreeSet var8 = new java.util.TreeSet();
    var8.clear();
    java.util.TreeSet var10 = new java.util.TreeSet();
    var10.clear();
    java.util.TreeSet var12 = new java.util.TreeSet();
    boolean var13 = var10.addAll((java.util.Collection)var12);
    java.lang.Object var14 = var10.pollLast();
    java.util.TreeSet var15 = new java.util.TreeSet();
    java.lang.Object var16 = var10.floor((java.lang.Object)var15);
    boolean var17 = var8.containsAll((java.util.Collection)var15);
    java.util.TreeSet var18 = new java.util.TreeSet();
    var18.clear();
    java.util.TreeSet var20 = new java.util.TreeSet();
    var20.clear();
    java.util.TreeSet var22 = new java.util.TreeSet();
    boolean var23 = var20.addAll((java.util.Collection)var22);
    java.lang.Object var24 = var20.pollLast();
    java.util.TreeSet var25 = new java.util.TreeSet();
    java.lang.Object var26 = var20.floor((java.lang.Object)var25);
    boolean var27 = var18.containsAll((java.util.Collection)var25);
    java.lang.Object[] var28 = new java.lang.Object[] { var27};
    java.lang.Object[] var29 = var15.toArray(var28);
    java.lang.Object[] var30 = var7.toArray(var28);
    java.util.Collections.shuffle((java.util.List)var7);
    java.util.TreeSet var32 = new java.util.TreeSet();
    var32.clear();
    java.util.TreeSet var34 = new java.util.TreeSet();
    boolean var35 = var32.addAll((java.util.Collection)var34);
    java.util.Enumeration var36 = java.util.Collections.enumeration((java.util.Collection)var32);
    java.util.ArrayList var37 = java.util.Collections.list(var36);
    java.util.ArrayList var38 = java.util.Collections.list(var36);
    java.util.TreeSet var39 = new java.util.TreeSet();
    var39.clear();
    java.util.TreeSet var41 = new java.util.TreeSet();
    boolean var42 = var39.addAll((java.util.Collection)var41);
    java.lang.Object var43 = var41.pollFirst();
    boolean var45 = var41.remove((java.lang.Object)'#');
    java.util.Collections.fill((java.util.List)var38, (java.lang.Object)var45);
    int var47 = java.util.Collections.indexOfSubList((java.util.List)var7, (java.util.List)var38);
    java.util.List var48 = java.util.Collections.unmodifiableList((java.util.List)var7);
    java.util.TreeSet var49 = new java.util.TreeSet();
    var49.clear();
    java.util.TreeSet var51 = new java.util.TreeSet();
    boolean var52 = var49.addAll((java.util.Collection)var51);
    java.util.Enumeration var53 = java.util.Collections.enumeration((java.util.Collection)var49);
    java.util.ArrayList var54 = java.util.Collections.list(var53);
    java.util.ArrayList var55 = java.util.Collections.list(var53);
    java.util.Comparator var56 = java.util.Collections.reverseOrder();
    java.util.Collections.sort((java.util.List)var55, var56);
    java.util.Comparator var58 = java.util.Collections.reverseOrder(var56);
    java.util.Comparator var59 = java.util.Collections.reverseOrder(var58);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var60 = java.util.Collections.min((java.util.Collection)var48, var58);
      fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);

  }

  public void test201() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test201");


    java.util.TreeSet var0 = new java.util.TreeSet();
    var0.clear();
    java.util.TreeSet var2 = new java.util.TreeSet();
    boolean var3 = var0.addAll((java.util.Collection)var2);
    java.util.Enumeration var4 = java.util.Collections.enumeration((java.util.Collection)var0);
    java.util.ArrayList var5 = java.util.Collections.list(var4);
    java.util.ArrayList var6 = java.util.Collections.list(var4);
    java.util.Comparator var7 = java.util.Collections.reverseOrder();
    java.util.Collections.sort((java.util.List)var6, var7);
    java.util.Collections.rotate((java.util.List)var6, 0);
    java.util.TreeSet var11 = new java.util.TreeSet();
    var11.clear();
    java.util.TreeSet var13 = new java.util.TreeSet();
    boolean var14 = var11.addAll((java.util.Collection)var13);
    java.util.Enumeration var15 = java.util.Collections.enumeration((java.util.Collection)var11);
    java.util.ArrayList var16 = java.util.Collections.list(var15);
    java.util.TreeSet var17 = new java.util.TreeSet();
    var17.clear();
    java.util.TreeSet var19 = new java.util.TreeSet();
    boolean var20 = var17.addAll((java.util.Collection)var19);
    java.util.Enumeration var21 = java.util.Collections.enumeration((java.util.Collection)var17);
    java.util.Iterator var22 = var17.descendingIterator();
    java.util.List var23 = java.util.Collections.singletonList((java.lang.Object)var22);
    java.util.TreeSet var24 = new java.util.TreeSet();
    var24.clear();
    java.util.TreeSet var26 = new java.util.TreeSet();
    boolean var27 = var24.addAll((java.util.Collection)var26);
    java.util.Enumeration var28 = java.util.Collections.enumeration((java.util.Collection)var24);
    java.util.ArrayList var29 = java.util.Collections.list(var28);
    java.util.Collections.copy(var23, (java.util.List)var29);
    int var31 = java.util.Collections.lastIndexOfSubList((java.util.List)var16, (java.util.List)var29);
    java.util.Collections.copy((java.util.List)var6, (java.util.List)var16);
    java.util.Comparator var33 = java.util.Collections.reverseOrder();
    java.util.Collections.sort((java.util.List)var6, var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);

  }

  public void test202() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test202");


    java.util.TreeSet var0 = new java.util.TreeSet();
    var0.clear();
    java.util.TreeSet var2 = new java.util.TreeSet();
    boolean var3 = var0.addAll((java.util.Collection)var2);
    java.util.Enumeration var4 = java.util.Collections.enumeration((java.util.Collection)var0);
    java.util.ArrayList var5 = java.util.Collections.list(var4);
    java.util.Collections.fill((java.util.List)var5, (java.lang.Object)(-1L));
    java.util.TreeSet var8 = new java.util.TreeSet();
    var8.clear();
    java.util.TreeSet var10 = new java.util.TreeSet();
    boolean var11 = var8.addAll((java.util.Collection)var10);
    java.util.Enumeration var12 = java.util.Collections.enumeration((java.util.Collection)var8);
    java.util.ArrayList var13 = java.util.Collections.list(var12);
    java.util.ArrayList var14 = java.util.Collections.list(var12);
    java.util.TreeSet var15 = new java.util.TreeSet();
    var15.clear();
    java.util.TreeSet var17 = new java.util.TreeSet();
    boolean var18 = var15.addAll((java.util.Collection)var17);
    java.lang.Object var19 = var17.pollFirst();
    boolean var21 = var17.remove((java.lang.Object)'#');
    java.util.Collections.fill((java.util.List)var14, (java.lang.Object)var21);
    java.util.Collection var23 = java.util.Collections.unmodifiableCollection((java.util.Collection)var14);
    int var24 = java.util.Collections.lastIndexOfSubList((java.util.List)var5, (java.util.List)var14);
    java.lang.Object[] var25 = var5.toArray();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);

  }

  public void test203() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test203");


    java.util.TreeSet var0 = new java.util.TreeSet();
    var0.clear();
    java.util.TreeSet var2 = new java.util.TreeSet();
    boolean var3 = var0.addAll((java.util.Collection)var2);
    java.util.Enumeration var4 = java.util.Collections.enumeration((java.util.Collection)var0);
    java.util.TreeSet var5 = new java.util.TreeSet((java.util.Collection)var0);
    java.util.Set var6 = java.util.Collections.unmodifiableSet((java.util.Set)var5);
    java.util.TreeSet var7 = new java.util.TreeSet();
    var7.clear();
    java.util.TreeSet var9 = new java.util.TreeSet();
    boolean var10 = var7.addAll((java.util.Collection)var9);
    java.lang.Object var11 = var7.pollLast();
    java.util.TreeSet var12 = new java.util.TreeSet();
    java.lang.Object var13 = var7.floor((java.lang.Object)var12);
    java.lang.Object var15 = var12.floor((java.lang.Object)(byte)1);
    java.util.TreeSet var16 = new java.util.TreeSet();
    var16.clear();
    java.util.TreeSet var18 = new java.util.TreeSet();
    boolean var19 = var16.addAll((java.util.Collection)var18);
    boolean var20 = var12.removeAll((java.util.Collection)var16);
    boolean var21 = var5.addAll((java.util.Collection)var12);
    java.lang.Object var22 = var5.clone();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);

  }

  public void test204() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test204");


    java.util.TreeSet var0 = new java.util.TreeSet();
    var0.clear();
    java.util.TreeSet var2 = new java.util.TreeSet();
    boolean var3 = var0.addAll((java.util.Collection)var2);
    java.util.Enumeration var4 = java.util.Collections.enumeration((java.util.Collection)var0);
    java.util.ArrayList var5 = java.util.Collections.list(var4);
    java.util.ArrayList var6 = java.util.Collections.list(var4);
    java.util.Comparator var7 = java.util.Collections.reverseOrder();
    java.util.Collections.sort((java.util.List)var6, var7);
    java.util.Collections.rotate((java.util.List)var6, 0);
    java.util.TreeSet var11 = new java.util.TreeSet();
    var11.clear();
    java.util.TreeSet var13 = new java.util.TreeSet();
    boolean var14 = var11.addAll((java.util.Collection)var13);
    java.util.Enumeration var15 = java.util.Collections.enumeration((java.util.Collection)var11);
    java.util.ArrayList var16 = java.util.Collections.list(var15);
    java.util.TreeSet var17 = new java.util.TreeSet();
    var17.clear();
    java.util.TreeSet var19 = new java.util.TreeSet();
    boolean var20 = var17.addAll((java.util.Collection)var19);
    java.util.Enumeration var21 = java.util.Collections.enumeration((java.util.Collection)var17);
    java.util.Iterator var22 = var17.descendingIterator();
    java.util.List var23 = java.util.Collections.singletonList((java.lang.Object)var22);
    java.util.TreeSet var24 = new java.util.TreeSet();
    var24.clear();
    java.util.TreeSet var26 = new java.util.TreeSet();
    boolean var27 = var24.addAll((java.util.Collection)var26);
    java.util.Enumeration var28 = java.util.Collections.enumeration((java.util.Collection)var24);
    java.util.ArrayList var29 = java.util.Collections.list(var28);
    java.util.Collections.copy(var23, (java.util.List)var29);
    int var31 = java.util.Collections.lastIndexOfSubList((java.util.List)var16, (java.util.List)var29);
    java.util.Collections.copy((java.util.List)var6, (java.util.List)var16);
    java.util.Collections.<java.lang.Comparable>sort((java.util.List)var16);
    java.util.List var34 = java.util.Collections.singletonList((java.lang.Object)var16);
    java.util.Collections.<java.lang.Comparable>sort((java.util.List)var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);

  }

  public void test205() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test205");


    java.util.List var0 = java.util.Collections.emptyList();
    java.util.TreeSet var1 = new java.util.TreeSet();
    var1.clear();
    java.util.TreeSet var3 = new java.util.TreeSet();
    boolean var4 = var1.addAll((java.util.Collection)var3);
    java.util.Enumeration var5 = java.util.Collections.enumeration((java.util.Collection)var1);
    java.util.ArrayList var6 = java.util.Collections.list(var5);
    java.util.ArrayList var7 = java.util.Collections.list(var5);
    java.util.Comparator var8 = java.util.Collections.reverseOrder();
    java.util.Collections.sort((java.util.List)var7, var8);
    java.util.Comparator var10 = java.util.Collections.reverseOrder(var8);
    java.util.Comparator var11 = java.util.Collections.reverseOrder(var10);
    java.util.Comparator var12 = java.util.Collections.reverseOrder(var10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var13 = java.util.Collections.min((java.util.Collection)var0, var10);
      fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test206() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test206");


    java.util.TreeSet var0 = new java.util.TreeSet();
    var0.clear();
    java.util.TreeSet var2 = new java.util.TreeSet();
    boolean var3 = var0.addAll((java.util.Collection)var2);
    java.util.Enumeration var4 = java.util.Collections.enumeration((java.util.Collection)var0);
    java.util.TreeSet var5 = new java.util.TreeSet((java.util.Collection)var0);
    java.util.Set var6 = java.util.Collections.unmodifiableSet((java.util.Set)var5);
    java.util.TreeSet var7 = new java.util.TreeSet();
    var7.clear();
    java.util.TreeSet var9 = new java.util.TreeSet();
    boolean var10 = var7.addAll((java.util.Collection)var9);
    java.lang.Object var11 = var7.pollLast();
    java.util.TreeSet var12 = new java.util.TreeSet();
    java.lang.Object var13 = var7.floor((java.lang.Object)var12);
    java.lang.Object var15 = var12.floor((java.lang.Object)(byte)1);
    java.util.Map var16 = java.util.Collections.singletonMap((java.lang.Object)var6, (java.lang.Object)(byte)1);
    java.util.Map var17 = java.util.Collections.synchronizedMap(var16);
    java.util.Map var18 = java.util.Collections.synchronizedMap(var16);
    java.util.Map var19 = java.util.Collections.unmodifiableMap(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);

  }

  public void test207() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test207");


    java.util.TreeSet var0 = new java.util.TreeSet();
    java.util.TreeSet var1 = new java.util.TreeSet();
    var1.clear();
    java.util.TreeSet var3 = new java.util.TreeSet();
    boolean var4 = var1.addAll((java.util.Collection)var3);
    java.util.Enumeration var5 = java.util.Collections.enumeration((java.util.Collection)var1);
    java.util.TreeSet var6 = new java.util.TreeSet((java.util.Collection)var1);
    java.util.Iterator var7 = var6.descendingIterator();
    boolean var8 = var0.addAll((java.util.Collection)var6);
    java.util.TreeSet var9 = new java.util.TreeSet((java.util.SortedSet)var6);
    java.util.TreeSet var10 = new java.util.TreeSet((java.util.SortedSet)var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test208() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test208");


    java.util.TreeSet var0 = new java.util.TreeSet();
    var0.clear();
    java.util.TreeSet var2 = new java.util.TreeSet();
    boolean var3 = var0.addAll((java.util.Collection)var2);
    java.util.Enumeration var4 = java.util.Collections.enumeration((java.util.Collection)var0);
    java.util.TreeSet var5 = new java.util.TreeSet((java.util.Collection)var0);
    java.lang.Object var7 = var0.floor((java.lang.Object)false);
    java.util.TreeSet var9 = new java.util.TreeSet();
    var9.clear();
    java.util.TreeSet var11 = new java.util.TreeSet();
    boolean var12 = var9.addAll((java.util.Collection)var11);
    java.util.Enumeration var13 = java.util.Collections.enumeration((java.util.Collection)var9);
    java.util.ArrayList var14 = java.util.Collections.list(var13);
    java.util.ArrayList var15 = java.util.Collections.list(var13);
    java.util.TreeSet var16 = new java.util.TreeSet();
    var16.clear();
    java.util.TreeSet var18 = new java.util.TreeSet();
    boolean var19 = var16.addAll((java.util.Collection)var18);
    java.util.Enumeration var20 = java.util.Collections.enumeration((java.util.Collection)var16);
    java.util.Iterator var21 = var16.descendingIterator();
    java.util.List var22 = java.util.Collections.singletonList((java.lang.Object)var21);
    java.util.TreeSet var23 = new java.util.TreeSet();
    var23.clear();
    java.util.TreeSet var25 = new java.util.TreeSet();
    boolean var26 = var23.addAll((java.util.Collection)var25);
    java.util.Enumeration var27 = java.util.Collections.enumeration((java.util.Collection)var23);
    java.util.ArrayList var28 = java.util.Collections.list(var27);
    java.util.Collections.copy(var22, (java.util.List)var28);
    java.util.TreeSet var31 = new java.util.TreeSet();
    var31.clear();
    java.util.TreeSet var33 = new java.util.TreeSet();
    boolean var34 = var31.addAll((java.util.Collection)var33);
    java.lang.Object var35 = var33.pollFirst();
    boolean var36 = java.util.Collections.replaceAll(var22, (java.lang.Object)1L, (java.lang.Object)var33);
    java.util.Collections.fill((java.util.List)var15, (java.lang.Object)var33);
    java.util.List var38 = java.util.Collections.nCopies(10, (java.lang.Object)var15);
    java.util.TreeSet var40 = new java.util.TreeSet();
    var40.clear();
    java.util.TreeSet var42 = new java.util.TreeSet();
    boolean var43 = var40.addAll((java.util.Collection)var42);
    java.util.Enumeration var44 = java.util.Collections.enumeration((java.util.Collection)var40);
    java.util.ArrayList var45 = java.util.Collections.list(var44);
    java.util.ArrayList var46 = java.util.Collections.list(var44);
    java.util.TreeSet var47 = new java.util.TreeSet();
    var47.clear();
    java.util.TreeSet var49 = new java.util.TreeSet();
    boolean var50 = var47.addAll((java.util.Collection)var49);
    java.util.Enumeration var51 = java.util.Collections.enumeration((java.util.Collection)var47);
    java.util.Iterator var52 = var47.descendingIterator();
    java.util.List var53 = java.util.Collections.singletonList((java.lang.Object)var52);
    java.util.TreeSet var54 = new java.util.TreeSet();
    var54.clear();
    java.util.TreeSet var56 = new java.util.TreeSet();
    boolean var57 = var54.addAll((java.util.Collection)var56);
    java.util.Enumeration var58 = java.util.Collections.enumeration((java.util.Collection)var54);
    java.util.ArrayList var59 = java.util.Collections.list(var58);
    java.util.Collections.copy(var53, (java.util.List)var59);
    java.util.TreeSet var62 = new java.util.TreeSet();
    var62.clear();
    java.util.TreeSet var64 = new java.util.TreeSet();
    boolean var65 = var62.addAll((java.util.Collection)var64);
    java.lang.Object var66 = var64.pollFirst();
    boolean var67 = java.util.Collections.replaceAll(var53, (java.lang.Object)1L, (java.lang.Object)var64);
    java.util.Collections.fill((java.util.List)var46, (java.lang.Object)var64);
    java.util.List var69 = java.util.Collections.nCopies(10, (java.lang.Object)var46);
    boolean var70 = java.util.Collections.disjoint((java.util.Collection)var15, (java.util.Collection)var69);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var71 = var0.addAll((java.util.Collection)var69);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var67 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var70 == true);

  }

  public void test209() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test209");


    java.util.TreeSet var1 = new java.util.TreeSet();
    java.util.TreeSet var2 = new java.util.TreeSet();
    var2.clear();
    java.util.TreeSet var4 = new java.util.TreeSet();
    boolean var5 = var2.addAll((java.util.Collection)var4);
    java.util.Enumeration var6 = java.util.Collections.enumeration((java.util.Collection)var2);
    java.util.TreeSet var7 = new java.util.TreeSet((java.util.Collection)var2);
    java.lang.Object var9 = var2.floor((java.lang.Object)false);
    java.util.TreeSet var10 = new java.util.TreeSet();
    var10.clear();
    java.util.TreeSet var12 = new java.util.TreeSet();
    boolean var13 = var10.addAll((java.util.Collection)var12);
    java.util.Enumeration var14 = java.util.Collections.enumeration((java.util.Collection)var10);
    java.util.NavigableSet var15 = var10.descendingSet();
    boolean var16 = var2.addAll((java.util.Collection)var15);
    java.util.Map var17 = java.util.Collections.singletonMap((java.lang.Object)var1, (java.lang.Object)var2);
    java.util.SortedSet var18 = java.util.Collections.unmodifiableSortedSet((java.util.SortedSet)var1);
    java.util.TreeSet var19 = new java.util.TreeSet();
    var19.clear();
    java.util.TreeSet var21 = new java.util.TreeSet();
    boolean var22 = var19.addAll((java.util.Collection)var21);
    java.util.Enumeration var23 = java.util.Collections.enumeration((java.util.Collection)var19);
    java.util.ArrayList var24 = java.util.Collections.list(var23);
    java.util.ArrayList var25 = java.util.Collections.list(var23);
    java.util.Map var26 = java.util.Collections.singletonMap((java.lang.Object)var1, (java.lang.Object)var25);
    java.util.List var27 = java.util.Collections.nCopies(1, (java.lang.Object)var25);
    java.util.TreeSet var28 = new java.util.TreeSet();
    var28.clear();
    java.util.TreeSet var30 = new java.util.TreeSet();
    boolean var31 = var28.addAll((java.util.Collection)var30);
    java.util.Enumeration var32 = java.util.Collections.enumeration((java.util.Collection)var28);
    java.util.ArrayList var33 = java.util.Collections.list(var32);
    java.util.ArrayList var34 = java.util.Collections.list(var32);
    java.util.ArrayList var35 = java.util.Collections.list(var32);
    java.util.TreeSet var36 = new java.util.TreeSet();
    var36.clear();
    java.util.TreeSet var38 = new java.util.TreeSet();
    var38.clear();
    java.util.TreeSet var40 = new java.util.TreeSet();
    boolean var41 = var38.addAll((java.util.Collection)var40);
    java.lang.Object var42 = var38.pollLast();
    java.util.TreeSet var43 = new java.util.TreeSet();
    java.lang.Object var44 = var38.floor((java.lang.Object)var43);
    boolean var45 = var36.containsAll((java.util.Collection)var43);
    java.util.TreeSet var46 = new java.util.TreeSet();
    var46.clear();
    java.util.TreeSet var48 = new java.util.TreeSet();
    var48.clear();
    java.util.TreeSet var50 = new java.util.TreeSet();
    boolean var51 = var48.addAll((java.util.Collection)var50);
    java.lang.Object var52 = var48.pollLast();
    java.util.TreeSet var53 = new java.util.TreeSet();
    java.lang.Object var54 = var48.floor((java.lang.Object)var53);
    boolean var55 = var46.containsAll((java.util.Collection)var53);
    java.lang.Object[] var56 = new java.lang.Object[] { var55};
    java.lang.Object[] var57 = var43.toArray(var56);
    java.lang.Object[] var58 = var35.toArray(var56);
    java.util.Collections.shuffle((java.util.List)var35);
    java.util.Collections.shuffle((java.util.List)var35);
    int var61 = java.util.Collections.lastIndexOfSubList(var27, (java.util.List)var35);
    java.util.Set var62 = java.util.Collections.singleton((java.lang.Object)var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);

  }

  public void test210() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test210");


    java.util.TreeSet var0 = new java.util.TreeSet();
    var0.clear();
    java.util.TreeSet var2 = new java.util.TreeSet();
    boolean var3 = var0.addAll((java.util.Collection)var2);
    java.util.Enumeration var4 = java.util.Collections.enumeration((java.util.Collection)var0);
    java.util.ArrayList var5 = java.util.Collections.list(var4);
    java.util.ArrayList var6 = java.util.Collections.list(var4);
    java.util.Comparator var7 = java.util.Collections.reverseOrder();
    java.util.Collections.sort((java.util.List)var6, var7);
    java.util.Comparator var9 = java.util.Collections.reverseOrder(var7);
    java.util.Comparator var10 = java.util.Collections.reverseOrder(var9);
    java.util.Comparator var11 = java.util.Collections.reverseOrder(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test211() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test211");


    java.util.TreeSet var0 = new java.util.TreeSet();
    var0.clear();
    java.util.TreeSet var2 = new java.util.TreeSet();
    boolean var3 = var0.addAll((java.util.Collection)var2);
    java.lang.Object var4 = var0.pollLast();
    java.util.TreeSet var5 = new java.util.TreeSet();
    java.lang.Object var6 = var0.floor((java.lang.Object)var5);
    java.util.TreeSet var7 = new java.util.TreeSet();
    var7.clear();
    java.util.TreeSet var9 = new java.util.TreeSet();
    boolean var10 = var7.addAll((java.util.Collection)var9);
    java.util.Enumeration var11 = java.util.Collections.enumeration((java.util.Collection)var7);
    java.util.TreeSet var12 = new java.util.TreeSet((java.util.Collection)var7);
    java.util.Iterator var13 = var12.descendingIterator();
    java.lang.Object var14 = var5.higher((java.lang.Object)var13);
    java.util.TreeSet var15 = new java.util.TreeSet((java.util.SortedSet)var5);
    java.util.TreeSet var16 = new java.util.TreeSet((java.util.Collection)var5);
    java.util.TreeSet var17 = new java.util.TreeSet();
    var17.clear();
    java.util.TreeSet var19 = new java.util.TreeSet();
    boolean var20 = var17.addAll((java.util.Collection)var19);
    java.util.Enumeration var21 = java.util.Collections.enumeration((java.util.Collection)var17);
    java.util.ArrayList var22 = java.util.Collections.list(var21);
    java.util.ArrayList var23 = java.util.Collections.list(var21);
    java.util.TreeSet var24 = new java.util.TreeSet();
    var24.clear();
    java.util.TreeSet var26 = new java.util.TreeSet();
    boolean var27 = var24.addAll((java.util.Collection)var26);
    java.util.Enumeration var28 = java.util.Collections.enumeration((java.util.Collection)var24);
    java.util.Iterator var29 = var24.descendingIterator();
    java.util.List var30 = java.util.Collections.singletonList((java.lang.Object)var29);
    java.util.TreeSet var31 = new java.util.TreeSet();
    var31.clear();
    java.util.TreeSet var33 = new java.util.TreeSet();
    boolean var34 = var31.addAll((java.util.Collection)var33);
    java.util.Enumeration var35 = java.util.Collections.enumeration((java.util.Collection)var31);
    java.util.ArrayList var36 = java.util.Collections.list(var35);
    java.util.Collections.copy(var30, (java.util.List)var36);
    java.util.TreeSet var39 = new java.util.TreeSet();
    var39.clear();
    java.util.TreeSet var41 = new java.util.TreeSet();
    boolean var42 = var39.addAll((java.util.Collection)var41);
    java.lang.Object var43 = var41.pollFirst();
    boolean var44 = java.util.Collections.replaceAll(var30, (java.lang.Object)1L, (java.lang.Object)var41);
    java.util.Collections.fill((java.util.List)var23, (java.lang.Object)var41);
    boolean var46 = var16.retainAll((java.util.Collection)var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == false);

  }

  public void test212() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test212");


    java.util.TreeSet var0 = new java.util.TreeSet();
    var0.clear();
    java.util.TreeSet var2 = new java.util.TreeSet();
    boolean var3 = var0.addAll((java.util.Collection)var2);
    java.lang.Object var4 = var2.pollFirst();
    boolean var6 = var2.remove((java.lang.Object)'#');
    java.util.TreeSet var7 = new java.util.TreeSet();
    var7.clear();
    java.util.TreeSet var9 = new java.util.TreeSet();
    boolean var10 = var7.addAll((java.util.Collection)var9);
    java.util.Enumeration var11 = java.util.Collections.enumeration((java.util.Collection)var7);
    java.util.Iterator var12 = var7.descendingIterator();
    java.lang.Object var13 = var2.higher((java.lang.Object)var12);
    java.util.TreeSet var14 = new java.util.TreeSet();
    var14.clear();
    java.util.TreeSet var16 = new java.util.TreeSet();
    boolean var17 = var14.addAll((java.util.Collection)var16);
    java.lang.Object var18 = var14.pollLast();
    java.util.TreeSet var19 = new java.util.TreeSet();
    java.lang.Object var20 = var14.floor((java.lang.Object)var19);
    java.lang.Object var21 = var2.floor((java.lang.Object)var14);
    java.util.TreeSet var22 = new java.util.TreeSet();
    var22.clear();
    java.util.TreeSet var24 = new java.util.TreeSet();
    var24.clear();
    java.util.TreeSet var26 = new java.util.TreeSet();
    boolean var27 = var24.addAll((java.util.Collection)var26);
    java.lang.Object var28 = var24.pollLast();
    java.util.TreeSet var29 = new java.util.TreeSet();
    java.lang.Object var30 = var24.floor((java.lang.Object)var29);
    boolean var31 = var22.containsAll((java.util.Collection)var29);
    java.util.Set var32 = java.util.Collections.singleton((java.lang.Object)var22);
    java.util.Comparator var33 = var22.comparator();
    boolean var35 = var22.add((java.lang.Object)100);
    java.lang.Object var36 = var2.higher((java.lang.Object)100);
    java.lang.String var37 = var2.toString();
    java.util.TreeSet var38 = new java.util.TreeSet();
    var38.clear();
    java.util.TreeSet var40 = new java.util.TreeSet();
    boolean var41 = var38.addAll((java.util.Collection)var40);
    java.util.Enumeration var42 = java.util.Collections.enumeration((java.util.Collection)var38);
    java.util.TreeSet var43 = new java.util.TreeSet();
    var43.clear();
    java.util.TreeSet var45 = new java.util.TreeSet();
    boolean var46 = var43.addAll((java.util.Collection)var45);
    java.lang.Object var47 = var43.pollLast();
    java.util.TreeSet var48 = new java.util.TreeSet();
    java.lang.Object var49 = var43.floor((java.lang.Object)var48);
    java.lang.Object var51 = var48.floor((java.lang.Object)(byte)1);
    int var52 = java.util.Collections.frequency((java.util.Collection)var38, (java.lang.Object)var48);
    java.lang.Object[] var53 = var38.toArray();
    java.util.TreeSet var54 = new java.util.TreeSet((java.util.Collection)var38);
    java.util.Set var55 = java.util.Collections.unmodifiableSet((java.util.Set)var38);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var56 = var2.contains((java.lang.Object)var55);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var37 + "' != '" + "[]"+ "'", var37.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);

  }

  public void test213() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test213");


    java.util.TreeSet var0 = new java.util.TreeSet();
    var0.clear();
    java.util.TreeSet var2 = new java.util.TreeSet();
    boolean var3 = var0.addAll((java.util.Collection)var2);
    java.util.Enumeration var4 = java.util.Collections.enumeration((java.util.Collection)var0);
    java.util.Iterator var5 = var0.descendingIterator();
    java.util.List var6 = java.util.Collections.singletonList((java.lang.Object)var5);
    java.util.TreeSet var7 = new java.util.TreeSet();
    var7.clear();
    java.util.TreeSet var9 = new java.util.TreeSet();
    boolean var10 = var7.addAll((java.util.Collection)var9);
    java.util.Enumeration var11 = java.util.Collections.enumeration((java.util.Collection)var7);
    java.util.ArrayList var12 = java.util.Collections.list(var11);
    java.util.Collections.copy(var6, (java.util.List)var12);
    java.util.TreeSet var15 = new java.util.TreeSet();
    var15.clear();
    java.util.TreeSet var17 = new java.util.TreeSet();
    boolean var18 = var15.addAll((java.util.Collection)var17);
    java.lang.Object var19 = var17.pollFirst();
    boolean var20 = java.util.Collections.replaceAll(var6, (java.lang.Object)1L, (java.lang.Object)var17);
    java.util.TreeSet var21 = new java.util.TreeSet();
    var21.clear();
    java.util.TreeSet var23 = new java.util.TreeSet();
    var23.clear();
    java.util.TreeSet var25 = new java.util.TreeSet();
    boolean var26 = var23.addAll((java.util.Collection)var25);
    java.lang.Object var27 = var23.pollLast();
    java.util.TreeSet var28 = new java.util.TreeSet();
    java.lang.Object var29 = var23.floor((java.lang.Object)var28);
    boolean var30 = var21.containsAll((java.util.Collection)var28);
    boolean var32 = var28.add((java.lang.Object)10.0d);
    java.util.Set var33 = java.util.Collections.synchronizedSet((java.util.Set)var28);
    boolean var34 = var17.containsAll((java.util.Collection)var33);
    java.util.Iterator var35 = var17.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);

  }

  public void test214() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test214");


    java.util.TreeSet var0 = new java.util.TreeSet();
    var0.clear();
    java.util.TreeSet var2 = new java.util.TreeSet();
    boolean var3 = var0.addAll((java.util.Collection)var2);
    java.util.Enumeration var4 = java.util.Collections.enumeration((java.util.Collection)var0);
    java.util.Iterator var5 = var0.descendingIterator();
    java.util.List var6 = java.util.Collections.singletonList((java.lang.Object)var5);
    java.util.Collections.reverse(var6);
    java.util.TreeSet var8 = new java.util.TreeSet();
    var8.clear();
    java.util.TreeSet var10 = new java.util.TreeSet();
    boolean var11 = var8.addAll((java.util.Collection)var10);
    java.util.Enumeration var12 = java.util.Collections.enumeration((java.util.Collection)var8);
    java.util.ArrayList var13 = java.util.Collections.list(var12);
    int var14 = java.util.Collections.indexOfSubList(var6, (java.util.List)var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);

  }

  public void test215() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test215");


    java.util.TreeSet var0 = new java.util.TreeSet();
    var0.clear();
    java.util.TreeSet var2 = new java.util.TreeSet();
    boolean var3 = var0.addAll((java.util.Collection)var2);
    java.util.Enumeration var4 = java.util.Collections.enumeration((java.util.Collection)var0);
    java.util.Iterator var5 = var0.descendingIterator();
    java.util.List var6 = java.util.Collections.singletonList((java.lang.Object)var5);
    java.util.TreeSet var7 = new java.util.TreeSet();
    var7.clear();
    java.util.TreeSet var9 = new java.util.TreeSet();
    boolean var10 = var7.addAll((java.util.Collection)var9);
    java.util.Enumeration var11 = java.util.Collections.enumeration((java.util.Collection)var7);
    java.util.ArrayList var12 = java.util.Collections.list(var11);
    java.util.Collections.copy(var6, (java.util.List)var12);
    java.util.TreeSet var15 = new java.util.TreeSet();
    var15.clear();
    java.util.TreeSet var17 = new java.util.TreeSet();
    boolean var18 = var15.addAll((java.util.Collection)var17);
    java.lang.Object var19 = var17.pollFirst();
    boolean var20 = java.util.Collections.replaceAll(var6, (java.lang.Object)1L, (java.lang.Object)var17);
    java.lang.Object var21 = var17.pollLast();
    java.lang.Object var23 = var17.lower((java.lang.Object)1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var24 = var17.last();
      fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);

  }

  public void test216() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test216");


    java.util.TreeSet var0 = new java.util.TreeSet();
    var0.clear();
    java.util.TreeSet var2 = new java.util.TreeSet();
    boolean var3 = var0.addAll((java.util.Collection)var2);
    java.util.Enumeration var4 = java.util.Collections.enumeration((java.util.Collection)var0);
    java.util.TreeSet var5 = new java.util.TreeSet((java.util.Collection)var0);
    java.util.Iterator var6 = var5.descendingIterator();
    java.util.TreeSet var7 = new java.util.TreeSet();
    var7.clear();
    java.util.TreeSet var9 = new java.util.TreeSet();
    boolean var10 = var7.addAll((java.util.Collection)var9);
    java.util.Enumeration var11 = java.util.Collections.enumeration((java.util.Collection)var7);
    java.util.ArrayList var12 = java.util.Collections.list(var11);
    java.util.ArrayList var13 = java.util.Collections.list(var11);
    java.util.Collection var14 = java.util.Collections.unmodifiableCollection((java.util.Collection)var13);
    boolean var15 = var5.containsAll((java.util.Collection)var13);
    java.util.TreeSet var16 = new java.util.TreeSet();
    var16.clear();
    java.util.TreeSet var18 = new java.util.TreeSet();
    var18.clear();
    java.util.TreeSet var20 = new java.util.TreeSet();
    boolean var21 = var18.addAll((java.util.Collection)var20);
    java.lang.Object var22 = var18.pollLast();
    java.util.TreeSet var23 = new java.util.TreeSet();
    java.lang.Object var24 = var18.floor((java.lang.Object)var23);
    boolean var25 = var16.containsAll((java.util.Collection)var23);
    java.util.Set var26 = java.util.Collections.singleton((java.lang.Object)var16);
    java.util.Set var28 = java.util.Collections.singleton((java.lang.Object)0L);
    java.util.Collection var29 = java.util.Collections.synchronizedCollection((java.util.Collection)var28);
    java.util.Set var30 = java.util.Collections.singleton((java.lang.Object)var29);
    boolean var31 = var16.equals((java.lang.Object)var29);
    int var32 = java.util.Collections.binarySearch((java.util.List)var13, (java.lang.Object)var29);
    java.util.List var33 = java.util.Collections.synchronizedList((java.util.List)var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);

  }

  public void test217() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test217");


    java.util.TreeSet var0 = new java.util.TreeSet();
    var0.clear();
    java.util.TreeSet var2 = new java.util.TreeSet();
    var2.clear();
    java.util.TreeSet var4 = new java.util.TreeSet();
    boolean var5 = var2.addAll((java.util.Collection)var4);
    java.lang.Object var6 = var2.pollLast();
    java.util.TreeSet var7 = new java.util.TreeSet();
    java.lang.Object var8 = var2.floor((java.lang.Object)var7);
    boolean var9 = var0.containsAll((java.util.Collection)var7);
    java.util.TreeSet var10 = new java.util.TreeSet((java.util.Collection)var7);
    java.util.TreeSet var11 = new java.util.TreeSet();
    var11.clear();
    java.util.TreeSet var13 = new java.util.TreeSet();
    boolean var14 = var11.addAll((java.util.Collection)var13);
    java.util.Enumeration var15 = java.util.Collections.enumeration((java.util.Collection)var11);
    java.util.ArrayList var16 = java.util.Collections.list(var15);
    java.util.ArrayList var17 = java.util.Collections.list(var15);
    java.util.Comparator var18 = java.util.Collections.reverseOrder();
    java.util.Collections.sort((java.util.List)var17, var18);
    java.util.Collections.rotate((java.util.List)var17, 0);
    java.util.TreeSet var22 = new java.util.TreeSet();
    var22.clear();
    java.util.TreeSet var24 = new java.util.TreeSet();
    boolean var25 = var22.addAll((java.util.Collection)var24);
    java.util.Enumeration var26 = java.util.Collections.enumeration((java.util.Collection)var22);
    java.util.ArrayList var27 = java.util.Collections.list(var26);
    java.util.TreeSet var28 = new java.util.TreeSet();
    var28.clear();
    java.util.TreeSet var30 = new java.util.TreeSet();
    boolean var31 = var28.addAll((java.util.Collection)var30);
    java.util.Enumeration var32 = java.util.Collections.enumeration((java.util.Collection)var28);
    java.util.Iterator var33 = var28.descendingIterator();
    java.util.List var34 = java.util.Collections.singletonList((java.lang.Object)var33);
    java.util.TreeSet var35 = new java.util.TreeSet();
    var35.clear();
    java.util.TreeSet var37 = new java.util.TreeSet();
    boolean var38 = var35.addAll((java.util.Collection)var37);
    java.util.Enumeration var39 = java.util.Collections.enumeration((java.util.Collection)var35);
    java.util.ArrayList var40 = java.util.Collections.list(var39);
    java.util.Collections.copy(var34, (java.util.List)var40);
    int var42 = java.util.Collections.lastIndexOfSubList((java.util.List)var27, (java.util.List)var40);
    java.util.Collections.copy((java.util.List)var17, (java.util.List)var27);
    java.util.TreeSet var44 = new java.util.TreeSet();
    var44.clear();
    java.util.TreeSet var46 = new java.util.TreeSet();
    boolean var47 = var44.addAll((java.util.Collection)var46);
    java.util.Enumeration var48 = java.util.Collections.enumeration((java.util.Collection)var44);
    java.util.Iterator var49 = var44.descendingIterator();
    java.util.List var50 = java.util.Collections.singletonList((java.lang.Object)var49);
    int var51 = java.util.Collections.lastIndexOfSubList((java.util.List)var27, var50);
    java.util.TreeSet var52 = new java.util.TreeSet();
    var52.clear();
    java.util.TreeSet var54 = new java.util.TreeSet();
    boolean var55 = var52.addAll((java.util.Collection)var54);
    java.util.Enumeration var56 = java.util.Collections.enumeration((java.util.Collection)var52);
    java.util.Iterator var57 = var52.descendingIterator();
    java.util.List var58 = java.util.Collections.singletonList((java.lang.Object)var57);
    java.util.TreeSet var59 = new java.util.TreeSet();
    var59.clear();
    java.util.TreeSet var61 = new java.util.TreeSet();
    boolean var62 = var59.addAll((java.util.Collection)var61);
    java.util.Enumeration var63 = java.util.Collections.enumeration((java.util.Collection)var59);
    java.util.ArrayList var64 = java.util.Collections.list(var63);
    java.util.Collections.copy(var58, (java.util.List)var64);
    java.util.TreeSet var67 = new java.util.TreeSet();
    var67.clear();
    java.util.TreeSet var69 = new java.util.TreeSet();
    boolean var70 = var67.addAll((java.util.Collection)var69);
    java.lang.Object var71 = var69.pollFirst();
    boolean var72 = java.util.Collections.replaceAll(var58, (java.lang.Object)1L, (java.lang.Object)var69);
    java.util.List var73 = java.util.Collections.singletonList((java.lang.Object)var72);
    java.util.List var74 = java.util.Collections.unmodifiableList(var73);
    int var75 = java.util.Collections.lastIndexOfSubList((java.util.List)var27, var74);
    java.lang.Object var76 = var7.higher((java.lang.Object)var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var70 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var72 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var75 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var76);

  }

}
