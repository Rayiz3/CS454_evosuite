/*
 * This file was automatically generated by EvoSuite
 * Sat Dec 16 01:08:06 GMT 2023
 */

package org.apache.commons.cli;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Properties;
import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.DefaultParser;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.OptionGroup;
import org.apache.commons.cli.Options;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class DefaultParser_ESTest extends DefaultParser_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DefaultParser defaultParser0 = new DefaultParser();
      Options options0 = new Options();
      Option.Builder option_Builder0 = Option.builder("t");
      Option.Builder option_Builder1 = option_Builder0.numberOfArgs(13);
      option_Builder0.build();
      Option.builder("t");
      Option.Builder option_Builder2 = option_Builder1.numberOfArgs((-2));
      Option option0 = option_Builder2.build();
      Options options1 = options0.addOption(option0);
      DefaultParser defaultParser1 = new DefaultParser();
      String[] stringArray0 = new String[5];
      stringArray0[0] = "-t1";
      stringArray0[1] = ",%Abbv";
      stringArray0[2] = "t";
      stringArray0[3] = "j*ibXy!";
      stringArray0[4] = "-t1";
      CommandLine commandLine0 = defaultParser0.parse(options1, stringArray0);
      assertNotNull(commandLine0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Options options0 = new Options();
      boolean boolean0 = true;
      Options options1 = options0.addOption("t1", "--=", true, "--=");
      DefaultParser defaultParser0 = new DefaultParser();
      String[] stringArray0 = new String[3];
      options1.addOption("t1", "--Dparam2=value2", true, "t1");
      stringArray0[0] = "t1";
      stringArray0[1] = "-t1";
      stringArray0[2] = "--=";
      defaultParser0.skipParsing = true;
      try { 
        defaultParser0.parse(options0, stringArray0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Ambiguous option: '--'  (could be: '--=', '--Dparam2=value2')
         //
         verifyException("org.apache.commons.cli.DefaultParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Options options0 = new Options();
      options0.addOption("t1", "t1", true, "t1");
      DefaultParser defaultParser0 = new DefaultParser();
      String[] stringArray0 = new String[7];
      stringArray0[0] = "}e2!5P";
      stringArray0[1] = "-t1_path";
      stringArray0[2] = "-t1_path";
      stringArray0[3] = "t1";
      stringArray0[4] = "t1";
      stringArray0[5] = "AW";
      stringArray0[6] = "-t1_path";
      CommandLine commandLine0 = defaultParser0.parse(options0, stringArray0);
      assertNotNull(commandLine0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Options options0 = new Options();
      Options options1 = options0.addOption("t1", "t1", false, "t1");
      DefaultParser defaultParser0 = new DefaultParser();
      String[] stringArray0 = new String[6];
      stringArray0[0] = "-t1_path";
      try { 
        defaultParser0.parse(options1, stringArray0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unrecognized option: -t1_path
         //
         verifyException("org.apache.commons.cli.DefaultParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DefaultParser defaultParser0 = new DefaultParser();
      Options options0 = new Options();
      Option option0 = defaultParser0.currentOption;
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      Option option1 = new Option("", "org.apache.commons.cli.DefaultParser", true, "--t");
      options0.addOption(option1);
      Properties properties0 = new Properties();
      String[] stringArray0 = new String[4];
      stringArray0[0] = "";
      stringArray0[1] = "--=";
      stringArray0[2] = "";
      stringArray0[3] = "Default option wasn't defined";
      defaultParser0.parse(options0, stringArray0, properties0, false);
      Options options1 = defaultParser0.options;
      defaultParser0.handleConcatenatedOptions("--=");
      defaultParser0.handleConcatenatedOptions("--t");
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DefaultParser defaultParser0 = new DefaultParser();
      Properties properties0 = new Properties();
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "org.apache.commons.cli.UnrecognizedOptionException");
      Properties properties1 = new Properties();
      Options options0 = new Options();
      Options options1 = options0.addOption("", "");
      CommandLine commandLine0 = defaultParser0.parse(options0, (String[]) null, properties0, true);
      options0.helpOptions();
      defaultParser0.handleConcatenatedOptions("");
      options0.addOption("", "org.apache.commons.cli.UnrecognizedOptionException", false, ")f,+;W=|");
      defaultParser0.handleConcatenatedOptions("-Dparam2=value2");
      String[] stringArray0 = new String[5];
      stringArray0[0] = "-Dparam2=value2";
      stringArray0[1] = "-Dparam2=value2";
      stringArray0[3] = "";
      stringArray0[4] = "-Dparam2=value2";
      defaultParser0.parse(options0, stringArray0, true);
      defaultParser0.parse(options1, stringArray0, properties0, true);
      defaultParser0.handleConcatenatedOptions("--$wW[");
      CommandLine commandLine1 = defaultParser0.parse(options0, (String[]) null);
      assertFalse(commandLine1.equals((Object)commandLine0));
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DefaultParser defaultParser0 = new DefaultParser();
      Options options0 = new Options();
      Option option0 = new Option("", true, "");
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      Option option1 = new Option("", "", true, "--=");
      Options options1 = options0.addOption(option1);
      String[] stringArray0 = new String[2];
      stringArray0[0] = "";
      stringArray0[1] = "";
      Properties properties0 = new Properties();
      defaultParser0.parse(options1, stringArray0, properties0, true);
      defaultParser0.handleConcatenatedOptions("");
      Options options2 = defaultParser0.options;
      defaultParser0.handleConcatenatedOptions("Twx_zxTM8<X");
      defaultParser0.handleConcatenatedOptions("--");
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Options options0 = new Options();
      Option.Builder option_Builder0 = Option.builder("t1");
      option_Builder0.numberOfArgs(1);
      Option.builder("t1");
      Option option0 = option_Builder0.build();
      Options options1 = options0.addOption(option0);
      Option option1 = new Option("t1", "t1");
      DefaultParser defaultParser0 = new DefaultParser();
      String[] stringArray0 = new String[7];
      stringArray0[0] = "-t1";
      stringArray0[1] = "t1";
      stringArray0[2] = "-t1";
      stringArray0[3] = "-Dparam2=value2";
      stringArray0[4] = "-t";
      Properties properties0 = new Properties();
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      CommandLine commandLine0 = defaultParser0.parse(options1, stringArray0, properties0, true);
      defaultParser0.handleConcatenatedOptions("5[lZ^l<V-^_Z");
      CommandLine commandLine1 = defaultParser0.parse(options0, stringArray0, properties0, true);
      assertFalse(commandLine1.equals((Object)commandLine0));
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Options options0 = new Options();
      String string0 = "t";
      Option.Builder option_Builder0 = Option.builder("t");
      option_Builder0.numberOfArgs((-8));
      Option option0 = option_Builder0.build();
      FileSystemHandling.shouldAllThrowIOExceptions();
      String string1 = "-t1";
      String[] stringArray0 = new String[9];
      stringArray0[0] = "-t1";
      option0.setRequired(false);
      Options options1 = options0.addOption(option0);
      Properties properties0 = new Properties();
      options1.addRequiredOption(stringArray0[1], "t", true, "t");
      Properties properties1 = new Properties();
      OptionGroup optionGroup0 = new OptionGroup();
      OptionGroup optionGroup1 = optionGroup0.addOption(option0);
      optionGroup1.setRequired(true);
      options0.addOptionGroup(optionGroup1);
      DefaultParser defaultParser0 = new DefaultParser();
      try { 
        defaultParser0.parse(options1, stringArray0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unrecognized option: -t1
         //
         verifyException("org.apache.commons.cli.DefaultParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Options options0 = new Options();
      Option.Builder option_Builder0 = Option.builder("t1");
      option_Builder0.numberOfArgs(69);
      Option option0 = new Option("t", "t");
      Option option1 = option_Builder0.build();
      OptionGroup optionGroup0 = new OptionGroup();
      OptionGroup optionGroup1 = optionGroup0.addOption(option1);
      optionGroup0.addOption(option0);
      option1.addValueForProcessing("t");
      Options options1 = options0.addOptionGroup(optionGroup1);
      options1.addOption(option0);
      DefaultParser defaultParser0 = new DefaultParser();
      String[] stringArray0 = new String[3];
      stringArray0[0] = "-t1";
      stringArray0[1] = "t1";
      stringArray0[2] = "-t1";
      try { 
        defaultParser0.parse(options0, stringArray0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Missing argument for option: t1
         //
         verifyException("org.apache.commons.cli.DefaultParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DefaultParser defaultParser0 = new DefaultParser();
      Options options0 = new Options();
      Option.Builder option_Builder0 = Option.builder("t");
      option_Builder0.numberOfArgs((-19));
      Option option0 = option_Builder0.build();
      FileSystemHandling.shouldAllThrowIOExceptions();
      String[] stringArray0 = new String[15];
      stringArray0[0] = "-t";
      stringArray0[1] = "t";
      Options options1 = options0.addOption(option0);
      Properties properties0 = new Properties();
      defaultParser0.parse(options1, stringArray0, true);
      defaultParser0.parse(options0, stringArray0, properties0, true);
      options1.addRequiredOption("t", "t", true, "t");
      // Undeclared exception!
      try { 
        defaultParser0.parse(options1, stringArray0, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DefaultParser defaultParser0 = new DefaultParser();
      Options options0 = new Options();
      options0.addOption("", "", true, "");
      String[] stringArray0 = Locale.getISOLanguages();
      Properties properties0 = new Properties();
      defaultParser0.parse(options0, stringArray0, properties0, true);
      defaultParser0.handleConcatenatedOptions("--,");
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DefaultParser defaultParser0 = new DefaultParser();
      Options options0 = new Options();
      options0.addOption("", "", true, "");
      String[] stringArray0 = Locale.getISOCountries();
      defaultParser0.parse(options0, stringArray0, true);
      defaultParser0.handleConcatenatedOptions("--");
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Options options0 = new Options();
      Option.Builder option_Builder0 = Option.builder("t");
      Option option0 = option_Builder0.build();
      FileSystemHandling.shouldAllThrowIOExceptions();
      String[] stringArray0 = new String[15];
      stringArray0[0] = "-t1";
      stringArray0[1] = "t";
      options0.addOption(option0);
      Properties properties0 = new Properties();
      DefaultParser defaultParser0 = new DefaultParser();
      CommandLine commandLine0 = defaultParser0.parse(options0, stringArray0, properties0, true);
      assertNotNull(commandLine0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DefaultParser defaultParser0 = new DefaultParser();
      Options options0 = new Options();
      Properties properties0 = new Properties();
      String[] stringArray0 = new String[1];
      stringArray0[0] = "Z/";
      defaultParser0.parse(options0, stringArray0, properties0, false);
      defaultParser0.handleConcatenatedOptions("TqFCOD;oC_LWg");
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Options options0 = new Options();
      Options options1 = options0.addRequiredOption("t1", "t1", true, "t1");
      DefaultParser defaultParser0 = new DefaultParser();
      String[] stringArray0 = new String[4];
      options1.addOption("t1", (String) null);
      stringArray0[0] = "t1";
      stringArray0[1] = "--=";
      stringArray0[2] = ",+";
      stringArray0[3] = ",+";
      try { 
        defaultParser0.parse(options1, stringArray0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unrecognized option: --=
         //
         verifyException("org.apache.commons.cli.DefaultParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Options options0 = new Options();
      options0.addRequiredOption("t1", "t1", true, "t1");
      DefaultParser defaultParser0 = new DefaultParser();
      String[] stringArray0 = new String[3];
      stringArray0[0] = "t1";
      stringArray0[1] = "t1";
      stringArray0[2] = "--=";
      CommandLine commandLine0 = defaultParser0.parse(options0, stringArray0);
      assertNotNull(commandLine0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DefaultParser defaultParser0 = new DefaultParser();
      Options options0 = new Options();
      Option.Builder option_Builder0 = Option.builder("t");
      option_Builder0.numberOfArgs(13);
      Option option0 = option_Builder0.build();
      String[] stringArray0 = new String[10];
      stringArray0[0] = "-t1";
      option_Builder0.build();
      options0.addOption(option0);
      DefaultParser defaultParser1 = new DefaultParser();
      // Undeclared exception!
      try { 
        defaultParser0.parse(options0, stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      DefaultParser defaultParser0 = new DefaultParser();
      Options options0 = new Options();
      Options options1 = options0.addOption("t1", "--=", true, "--=");
      Properties properties0 = new Properties();
      String[] stringArray0 = new String[9];
      stringArray0[0] = "--=";
      // Undeclared exception!
      try { 
        defaultParser0.parse(options1, stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.cli.DefaultParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DefaultParser defaultParser0 = new DefaultParser();
      Options options0 = new Options();
      String[] stringArray0 = new String[2];
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      stringArray0[0] = "--=";
      Options options1 = new Options();
      try { 
        defaultParser0.parse(options1, stringArray0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unrecognized option: --=
         //
         verifyException("org.apache.commons.cli.DefaultParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      DefaultParser defaultParser0 = new DefaultParser();
      Options options0 = new Options();
      String[] stringArray0 = new String[2];
      stringArray0[0] = "-Dparam2=Ivle2";
      try { 
        defaultParser0.parse(options0, stringArray0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unrecognized option: -Dparam2=Ivle2
         //
         verifyException("org.apache.commons.cli.DefaultParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Options options0 = new Options();
      Properties properties0 = new Properties();
      properties0.put("t", "t");
      DefaultParser defaultParser0 = new DefaultParser();
      try { 
        defaultParser0.parse(options0, (String[]) null, properties0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Default option wasn't defined
         //
         verifyException("org.apache.commons.cli.DefaultParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Options options0 = new Options();
      options0.getRequiredOptions();
      options0.addOption("t1", "-", true, "-");
      String[] stringArray0 = new String[3];
      stringArray0[0] = "t1";
      stringArray0[1] = "-t1";
      stringArray0[2] = "-";
      DefaultParser defaultParser0 = new DefaultParser();
      Properties properties0 = new Properties();
      CommandLine commandLine0 = defaultParser0.parse(options0, stringArray0, properties0, false);
      assertNotNull(commandLine0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      DefaultParser defaultParser0 = new DefaultParser();
      Options options0 = new Options();
      options0.getMatchingOptions("");
      options0.addOption("", "", true, "");
      OptionGroup optionGroup0 = new OptionGroup();
      Option option0 = new Option("", "");
      OptionGroup optionGroup1 = optionGroup0.addOption(option0);
      options0.addOptionGroup(optionGroup1);
      String[] stringArray0 = Locale.getISOCountries();
      defaultParser0.parse(options0, stringArray0, true);
      defaultParser0.handleConcatenatedOptions("--");
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      DefaultParser defaultParser0 = new DefaultParser();
      Options options0 = new Options();
      Option.Builder option_Builder0 = Option.builder("t1");
      option_Builder0.numberOfArgs(1);
      option_Builder0.optionalArg(true);
      Option option0 = option_Builder0.build();
      Options options1 = options0.addOption(option0);
      Option.Builder option_Builder1 = Option.builder("last");
      Option.Builder option_Builder2 = option_Builder1.hasArg(true);
      option_Builder1.build();
      option_Builder2.build();
      options1.addOption(option0);
      String[] stringArray0 = new String[9];
      stringArray0[0] = "U=q&C}.'N5tx";
      stringArray0[1] = "U=q&C}.'N5tx";
      stringArray0[2] = "-t1";
      stringArray0[3] = "-n";
      stringArray0[4] = "-t1";
      stringArray0[5] = "-t1";
      stringArray0[6] = "-t1";
      stringArray0[7] = "-t1";
      stringArray0[8] = "U=q&C}.'N5tx";
      Properties properties0 = new Properties();
      defaultParser0.parse(options1, stringArray0, properties0, true);
      defaultParser0.handleConcatenatedOptions("-cURrR");
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      DefaultParser defaultParser0 = new DefaultParser();
      Options options0 = new Options();
      Options options1 = new Options();
      Option.builder();
      String[] stringArray0 = new String[1];
      stringArray0[0] = "--";
      CommandLine commandLine0 = defaultParser0.parse(options0, stringArray0);
      assertNotNull(commandLine0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      DefaultParser defaultParser0 = new DefaultParser();
      Options options0 = new Options();
      defaultParser0.handleConcatenatedOptions("");
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      DefaultParser defaultParser0 = new DefaultParser();
      Options options0 = new Options();
      String[] stringArray0 = new String[1];
      stringArray0[0] = "-";
      CommandLine commandLine0 = defaultParser0.parse(options0, stringArray0);
      assertNotNull(commandLine0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      DefaultParser defaultParser0 = new DefaultParser();
      Options options0 = new Options();
      String[] stringArray0 = new String[8];
      stringArray0[0] = "-U=q&C}.'N5tx";
      try { 
        defaultParser0.parse(options0, stringArray0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unrecognized option: -U=q&C}.'N5tx
         //
         verifyException("org.apache.commons.cli.DefaultParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      DefaultParser defaultParser0 = new DefaultParser();
      Options options0 = new Options();
      String[] stringArray0 = Locale.getISOCountries();
      defaultParser0.parse(options0, stringArray0, true);
      defaultParser0.handleConcatenatedOptions("--");
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Options options0 = new Options();
      String[] stringArray0 = new String[28];
      DefaultParser defaultParser0 = new DefaultParser();
      OptionGroup optionGroup0 = new OptionGroup();
      Option option0 = new Option("N0", "N0", false, "R~Bmg$8d55");
      OptionGroup optionGroup1 = optionGroup0.addOption(option0);
      Options options1 = options0.addOptionGroup(optionGroup1);
      // Undeclared exception!
      try { 
        defaultParser0.parse(options1, stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      DefaultParser defaultParser0 = new DefaultParser();
      Options options0 = new Options();
      Option.Builder option_Builder0 = Option.builder("t1");
      option_Builder0.hasArg();
      option_Builder0.numberOfArgs(1);
      option_Builder0.optionalArg(true);
      option_Builder0.argName("t1");
      Option option0 = option_Builder0.build();
      Options options1 = options0.addOption(option0);
      Option.Builder option_Builder1 = Option.builder("last");
      option_Builder1.hasArg(false);
      option_Builder1.build();
      String[] stringArray0 = new String[8];
      stringArray0[0] = "t1";
      stringArray0[1] = "path/to/my/db";
      stringArray0[2] = "8B}^SzR)+JpIi!8\"$$";
      stringArray0[3] = "t1";
      stringArray0[4] = "last";
      stringArray0[5] = "t1";
      stringArray0[6] = "path/to/my/db";
      stringArray0[7] = "cURrR";
      defaultParser0.parse(options1, stringArray0);
      Properties properties0 = new Properties();
      defaultParser0.parse(options0, stringArray0, properties0, true);
      defaultParser0.handleConcatenatedOptions("8B}^SzR)+JpIi!8\"$$");
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      DefaultParser defaultParser0 = new DefaultParser();
      Options options0 = new Options();
      String[] stringArray0 = Locale.getISOCountries();
      Properties properties0 = new Properties();
      CommandLine commandLine0 = defaultParser0.parse(options0, stringArray0, properties0, true);
      assertNotNull(commandLine0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      DefaultParser defaultParser0 = new DefaultParser();
      Options options0 = new Options();
      String[] stringArray0 = new String[8];
      // Undeclared exception!
      try { 
        defaultParser0.parse(options0, stringArray0, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      DefaultParser defaultParser0 = new DefaultParser();
      Options options0 = new Options();
      CommandLine commandLine0 = defaultParser0.parse(options0, (String[]) null);
      assertNotNull(commandLine0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      DefaultParser defaultParser0 = new DefaultParser();
      Options options0 = new Options();
      options0.addRequiredOption("2", "2", true, "2");
      try { 
        defaultParser0.parse(options0, (String[]) null);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Missing required option: 2
         //
         verifyException("org.apache.commons.cli.DefaultParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      DefaultParser defaultParser0 = new DefaultParser();
      Options options0 = new Options();
      String[] stringArray0 = new String[18];
      stringArray0[0] = "-,";
      try { 
        defaultParser0.parse(options0, stringArray0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unrecognized option: -,
         //
         verifyException("org.apache.commons.cli.DefaultParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      DefaultParser defaultParser0 = new DefaultParser();
      Options options0 = new Options();
      Option.Builder option_Builder0 = Option.builder("t1");
      option_Builder0.hasArg();
      option_Builder0.numberOfArgs(1);
      option_Builder0.optionalArg(true);
      option_Builder0.argName("t1_path");
      Option option0 = option_Builder0.build();
      Options options1 = options0.addOption(option0);
      Option.Builder option_Builder1 = Option.builder("last");
      option_Builder1.hasArg(false);
      Option option1 = option_Builder1.build();
      option1.setDescription("last");
      options1.addOption(option1);
      String[] stringArray0 = new String[1];
      stringArray0[0] = "-t1";
      defaultParser0.parse(options1, stringArray0);
      defaultParser0.handleConcatenatedOptions("last");
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      DefaultParser defaultParser0 = new DefaultParser();
      Options options0 = new Options();
      Option.Builder option_Builder0 = Option.builder("t1");
      Option.Builder option_Builder1 = option_Builder0.hasArg();
      Option.Builder option_Builder2 = option_Builder0.numberOfArgs(1);
      Option.Builder option_Builder3 = option_Builder1.optionalArg(true);
      option_Builder3.argName("@A0'8tG7{ypF4)a");
      Option option0 = option_Builder2.build();
      options0.addOption(option0);
      DefaultParser defaultParser1 = new DefaultParser();
      String[] stringArray0 = new String[1];
      stringArray0[0] = "-t1";
      CommandLine commandLine0 = defaultParser1.parse(options0, stringArray0);
      assertNotNull(commandLine0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Options options0 = new Options();
      options0.addOption("t1", "--=", true, "--=");
      DefaultParser defaultParser0 = new DefaultParser();
      DefaultParser defaultParser1 = new DefaultParser();
      String[] stringArray0 = new String[1];
      stringArray0[0] = "-t1";
      try { 
        defaultParser0.parse(options0, stringArray0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Missing argument for option: t1
         //
         verifyException("org.apache.commons.cli.DefaultParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      DefaultParser defaultParser0 = new DefaultParser();
      Options options0 = new Options();
      String[] stringArray0 = new String[4];
      stringArray0[0] = "--sjOhA4|?_";
      try { 
        defaultParser0.parse(options0, stringArray0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unrecognized option: --sjOhA4|?_
         //
         verifyException("org.apache.commons.cli.DefaultParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      DefaultParser defaultParser0 = new DefaultParser();
      // Undeclared exception!
      try { 
        defaultParser0.handleConcatenatedOptions("---$wW[");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.cli.DefaultParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Options options0 = new Options();
      Properties properties0 = new Properties();
      DefaultParser defaultParser0 = new DefaultParser();
      CommandLine commandLine0 = defaultParser0.parse(options0, (String[]) null, properties0);
      assertNotNull(commandLine0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      DefaultParser defaultParser0 = new DefaultParser();
      Options options0 = new Options();
      String[] stringArray0 = Locale.getISOLanguages();
      CommandLine commandLine0 = defaultParser0.parse(options0, stringArray0);
      assertNotNull(commandLine0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Options options0 = new Options();
      options0.addOption("t1", "--=", true, "--=");
      DefaultParser defaultParser0 = new DefaultParser();
      DefaultParser defaultParser1 = new DefaultParser();
      String[] stringArray0 = new String[8];
      stringArray0[0] = "-t1";
      // Undeclared exception!
      try { 
        defaultParser1.parse(options0, stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      DefaultParser defaultParser0 = new DefaultParser();
      Options options0 = new Options();
      Options options1 = options0.addRequiredOption("t1_path", "t1_path", true, "t1_path");
      String[] stringArray0 = new String[5];
      stringArray0[0] = "-t1";
      stringArray0[1] = "t1_path";
      stringArray0[2] = "-t1";
      stringArray0[3] = "-t1";
      try { 
        defaultParser0.parse(options1, stringArray0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Missing argument for option: t1_path
         //
         verifyException("org.apache.commons.cli.DefaultParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      DefaultParser defaultParser0 = new DefaultParser();
      Options options0 = new Options();
      Options options1 = options0.addRequiredOption("t1_path", "t1_path", true, "t1_path");
      String[] stringArray0 = new String[5];
      stringArray0[0] = "-t1";
      stringArray0[1] = "t1_path";
      // Undeclared exception!
      try { 
        defaultParser0.parse(options1, stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      DefaultParser defaultParser0 = new DefaultParser();
      Options options0 = new Options();
      Options options1 = options0.addRequiredOption("t1_path", "t1_path", true, "t1_path");
      String[] stringArray0 = new String[5];
      stringArray0[0] = "-t1";
      // Undeclared exception!
      try { 
        defaultParser0.parse(options1, stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      DefaultParser defaultParser0 = new DefaultParser();
      Options options0 = new Options();
      options0.addOption("t", "-t1_path", false, "-t1_path");
      String[] stringArray0 = new String[1];
      stringArray0[0] = "-t1_path";
      try { 
        defaultParser0.parse(options0, stringArray0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unrecognized option: -t1_path
         //
         verifyException("org.apache.commons.cli.DefaultParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Options options0 = new Options();
      Options options1 = options0.addOption("t1", "--=", true, "--=");
      DefaultParser defaultParser0 = new DefaultParser();
      String[] stringArray0 = new String[19];
      stringArray0[0] = "-t1";
      stringArray0[1] = "--=";
      // Undeclared exception!
      try { 
        defaultParser0.parse(options1, stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.cli.DefaultParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      DefaultParser defaultParser0 = new DefaultParser();
      Options options0 = new Options();
      String[] stringArray0 = new String[0];
      CommandLine commandLine0 = defaultParser0.parse(options0, stringArray0);
      assertNotNull(commandLine0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      Options options0 = new Options();
      Options options1 = options0.addOption("t1", "--=", true, "--=");
      DefaultParser defaultParser0 = new DefaultParser();
      DefaultParser defaultParser1 = new DefaultParser();
      String[] stringArray0 = new String[18];
      stringArray0[0] = "-t1";
      stringArray0[1] = "-t1";
      // Undeclared exception!
      try { 
        defaultParser0.parse(options1, stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      DefaultParser defaultParser0 = new DefaultParser();
      Options options0 = new Options();
      String[] stringArray0 = new String[3];
      // Undeclared exception!
      try { 
        defaultParser0.parse(options0, stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      DefaultParser defaultParser0 = new DefaultParser();
      Options options0 = new Options();
      String[] stringArray0 = new String[1];
      stringArray0[0] = "-Dparam1";
      try { 
        defaultParser0.parse(options0, stringArray0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unrecognized option: -Dparam1
         //
         verifyException("org.apache.commons.cli.DefaultParser", e);
      }
  }
}