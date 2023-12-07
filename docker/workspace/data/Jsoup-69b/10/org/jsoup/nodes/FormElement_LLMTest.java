package org.jsoup.nodes;
import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.junit.Test;
import java.util.List;
import static org.junit.Assert.*;

public class FormElement_LLMTest {
@Test public void test0() {
    Document doc = Jsoup.parse("<body />");
    doc.body().html("<form action='http://example.com/search'><input name='q' value='search'>");
    Element formEl = doc.select("form").first();
    assertTrue(formEl instanceof FormElement);

    FormElement form = (FormElement) formEl;
    assertEquals(1, form.elements().size());
}

@Test public void test1() {
    Document doc = Jsoup.parse("<body />");
    doc.body().html("<div><form action='http://example.com/search'><input name='q' value='search'>");
    Element formEl = doc.select("form").first();
    assertFalse(formEl instanceof FormElement);

    FormElement form = (FormElement) formEl;
    assertNull(form);
}

@Test public void test2() {
    //"button", "fieldset", "input", "keygen", "object", "output", "select", "textarea"
    String html = "<form id=1><button id=1><fieldset id=2 /><input id=3><keygen id=4><object id=5><output id=6>" +
            "<select id=7><option></select><textarea id=8><p id=9>";
    Document doc = Jsoup.parse(html);

    FormElement form = (FormElement) doc.select("form").first();
    assertEquals(8, form.elements().size());
}

@Test public void test3() {
    String html = "<form id=1><div id=1><fieldset id=2 /><span id=3><keygen id=4><a id=5><output id=6>" +
            "<b id=7><option></select><img id=8><p id=9>";
    Document doc = Jsoup.parse(html);

    FormElement form = (FormElement) doc.select("form").first();
    assertEquals(0, form.elements().size());
}

@Test public void test4() {
    Document doc = Jsoup.parse("<body />");
    doc.body().html("<form />");

    Element formEl = doc.select("form").first();
    formEl.append("<input name=foo value=bar>");

    assertTrue(formEl instanceof FormElement);
    FormElement form = (FormElement) formEl;
    assertEquals(1, form.elements().size());

    List<Connection.KeyVal> data = form.formData();
    assertEquals("foo=bar", data.get(0).toString());
}

@Test public void test5() {
    Document doc = Jsoup.parse("<body />");
    doc.body().html("<form /><input name=foo value=bar>");

    Element formEl = doc.select("form").first();

    assertTrue(formEl instanceof FormElement);
    FormElement form = (FormElement) formEl;
    assertEquals(0, form.elements().size());

    List<Connection.KeyVal> data = form.formData();
    assertEquals(0, data.size());
}


@Test public void test6() {
    String html = "<html><head></head><body>\n" +
            "      <form><input name='q'></form>\n" +
            "  </body>\n" +
            "</html>";
    Document doc = Jsoup.parse(html);
    FormElement form = ((FormElement) doc.select("form").first());


    boolean threw = false;
    try {
        Connection con = form.submit();
    } catch (IllegalArgumentException e) {
        threw = true;
        assertEquals("Could not determine a form action URL for submit. Ensure you set a base URI when parsing.",
                e.getMessage());
    }
    assertTrue(threw);
}

@Test public void test7() {
    String html = "<html>\n" +
            "  <body> \n" +
            "      <form action=\"/hello.php\" method=\"post\">\n" +
            "      User:<input type=\"text\" name=\"user\" />\n" +
            "      Password:<input type=\"password\" name=\"pass\" />\n" +
            "      <input type=\"submit\" name=\"login\" value=\"login\" />\n" +
            "   </form>\n" +
            "  </body>\n" +
            "</html>  ";
    Document doc = Jsoup.parse(html);
    FormElement form = (FormElement) doc.selectFirst("form");
    Element pass = form.selectFirst("input[name=pass]");
    pass.remove();

    List<Connection.KeyVal> data = form.formData();
    assertEquals(2, data.size());
    assertEquals("user", data.get(0).key());
    assertEquals("login", data.get(1).key());
    assertEquals(null, doc.selectFirst("input[name=pass]"));
}

@Test public void test8() {
    Document doc = Jsoup.parse("<body />");
    doc.body().html("<form />");

    Element formEl = doc.select("form").first();
    formEl.append("<input name=foo value=bar>");

    assertTrue(formEl instanceof FormElement);
    FormElement form = (FormElement) formEl;
    assertEquals(1, form.elements().size());

    List<Connection.KeyVal> data = form.formData();
    assertEquals("foo=bar", data.get(0).toString());
}

@Test public void test9() {
    String html = "<html><head></head><body>\n" +
            "      <form><input name='q'></form>\n" +
            "  </body>\n" +
            "</html>";
    Document doc = Jsoup.parse(html, "http://example.com/");
    FormElement form = ((FormElement) doc.select("form").first());
    Connection con = form.submit();

    assertEquals("http://example.com/", con.request().url().toExternalForm());
}

@Test public void test10() {
    String html = "<form><input name='one' value='two'><select name='three'><option value='not'>" +
            "<option value='four' selected><option value='five' selected><textarea name=six>seven</textarea>" +
            "<input name='seven' type='radio' value='on' checked><input name='seven' type='radio' value='off'>" +
            "<input name='eight' type='checkbox' checked><input name='nine' type='checkbox' value='unset'>" +
            "<input name='ten' value='text' disabled>" +
            "</form>";
    Document doc = Jsoup.parse(html);
    FormElement form = (FormElement) doc.select("form").first();
    List<Connection.KeyVal> data = form.formData();

    assertEquals(6, data.size());
    assertEquals("one=two", data.get(0).toString());
    assertEquals("three=four", data.get(1).toString());
    assertEquals("three=five", data.get(2).toString());
    assertEquals("six=seven", data.get(3).toString());
    assertEquals("seven=on", data.get(4).toString()); // set
    assertEquals("eight=on", data.get(5).toString()); // default
    // nine should not appear, not checked checkbox
    // ten should not appear, disabled
}

@Test public void test11() {
    Document doc = Jsoup.parse("<body />");
    doc.body().html("<form action='http://example.com/search'><input name='q' value='search'>");
    Element formEl = doc.select("form").first();
    assertTrue(formEl instanceof FormElement);

    FormElement form = (FormElement) formEl;
    assertEquals(1, form.elements().size());
}

@Test public void test12() {
    String html = "<form id=1><button id=1><fieldset id=2 /><input id=3><keygen id=4><object id=5><output id=6>" +
            "<select id=7><option></select><textarea id=8><p id=9>";
    Document doc = Jsoup.parse(html);

    FormElement form = (FormElement) doc.select("form").first();
    assertEquals(8, form.elements().size());
}

@Test public void test13() {
    // test for https://github.com/jhy/jsoup/issues/249
    String html = "<html>\n" +
            "<body>  \n" +
            "  <table>\n" +
            "      <form action=\"/hello.php\" method=\"post\">\n" +
            "      <tr><td>User:</td><td> <input type=\"text\" name=\"user\" /></td></tr>\n" +
            "      <tr><td>Password:</td><td> <input type=\"password\" name=\"pass\" /></td></tr>\n" +
            "      <tr><td><input type=\"submit\" name=\"login\" value=\"login\" /></td></tr>\n" +
            "   </form>\n" +
            "  </table>\n" +
            "</body>\n" +
            "</html>";
    Document doc = Jsoup.parse(html);
    FormElement form = (FormElement) doc.select("form").first();
    List<Connection.KeyVal> data = form.formData();
    assertEquals(3, data.size());
    assertEquals("user", data.get(0).key());
    assertEquals("pass", data.get(1).key());
    assertEquals("login", data.get(2).key());
}

@Test public void test14() {
    String html = "<form action='/search'><input name='q'></form>";
    Document doc = Jsoup.parse(html, "http://example.com/");
    doc.select("[name=q]").attr("value", "jsoup");

    FormElement form = ((FormElement) doc.select("form").first());
    Connection con = form.submit();

    assertEquals(Connection.Method.GET, con.request().method());
    assertEquals("http://example.com/search", con.request().url().toExternalForm());
    List<Connection.KeyVal> dataList = (List<Connection.KeyVal>) con.request().data();
    assertEquals("q=jsoup", dataList.get(0).toString());

    doc.select("form").attr("method", "post");
    Connection con2 = form.submit();
    assertEquals(Connection.Method.POST, con2.request().method());
}

@Test public void test15() {
    Document doc = Jsoup.parse("<form><input type=checkbox checked name=foo></form>");
    FormElement form = (FormElement) doc.select("form").first();
    List<Connection.KeyVal> data = form.formData();
    assertEquals("on", data.get(0).value());
    assertEquals("foo", data.get(0).key());
}

    @Test public void test16() {
        String html = "<form><input name='q'></form>";
        Document doc = Jsoup.parse(html, "http://example.com/");
        FormElement form = ((FormElement) doc.select("form").first());
        Connection con = form.submit();

        assertEquals("http://example.com/", con.request().url().toExternalForm());
    }
    @Test public void test17() {
        String html = "<form action='/search'><input name='q'></form>";
        Document doc = Jsoup.parse(html, "http://example.com/");
        doc.select("[name=q]").attr("value", "jsoup");

        FormElement form = ((FormElement) doc.select("form").first());
        Connection con = form.submit();

        assertEquals(Connection.Method.GET, con.request().method());
        assertEquals("http://example.com/search", con.request().url().toExternalForm());
        List<Connection.KeyVal> dataList = (List<Connection.KeyVal>) con.request().data();
        assertEquals("q=jsoup", dataList.get(0).toString());

        // Regression test case
        String modifiedHtml = "<form action='./submit'><input name='q'></form>";
        Document modifiedDoc = Jsoup.parse(modifiedHtml, "http://example.com/");
        modifiedDoc.select("[name=q]").attr("value", "jsoup");

        FormElement modifiedForm = ((FormElement) modifiedDoc.select("form").first());
        Connection modifiedCon = modifiedForm.submit();

        assertEquals(Connection.Method.GET, modifiedCon.request().method());
        assertEquals("http://example.com/submit", modifiedCon.request().url().toExternalForm());
        List<Connection.KeyVal> modifiedDataList = (List<Connection.KeyVal>) modifiedCon.request().data();
        assertEquals("q=jsoup", modifiedDataList.get(0).toString());
    }
    @Test public void test18() {
        String html = "<form><input name='q'></form>";
        Document doc = Jsoup.parse(html);
        FormElement form = ((FormElement) doc.select("form").first());


        boolean threw = false;
        try {
            Connection con = form.submit();
        } catch (IllegalArgumentException e) {
            threw = true;
            assertEquals("Could not determine a form action URL for submit. Ensure you set a base URI when parsing.",
                    e.getMessage());
        }
        assertTrue(threw);

        // Regression test case
        String modifiedHtml = "<form><input name='q'></form>";
        Document modifiedDoc = Jsoup.parse(modifiedHtml, "http://example.com/");
        FormElement modifiedForm = ((FormElement) modifiedDoc.select("form").first());

        Connection modifiedCon = modifiedForm.submit();

        assertEquals("http://example.com/", modifiedCon.request().url().toExternalForm());
    }

    @Test public void test19() {
        // Changing the name and value of form input
        String html = "<html>\n" +
                "  <body> \n" +
                "      <form action=\"/hello.php\" method=\"post\">\n" +
                "      User:<input type=\"text\" name=\"user\" />\n" +
                "      Password:<input type=\"password\" name=\"pass_new\" />\n" +
                "      <input type=\"submit\" name=\"login\" value=\"login\" />\n" +
                "   </form>\n" +
                "  </body>\n" +
                "</html>  ";
        
        Document doc = Jsoup.parse(html);
        FormElement form = (FormElement) doc.selectFirst("form");
        Element pass = form.selectFirst("input[name=pass_new]");
        pass.remove();

        List<Connection.KeyVal> data = form.formData();
        assertEquals(2, data.size());
        assertEquals("user", data.get(0).key());
        assertEquals("login", data.get(1).key());
        assertEquals(null, doc.selectFirst("input[name=pass_new]"));
    }
    @Test public void test20() {
        // Changing the name and value of form input
        String html = "<html>\n" +
                "<body>  \n" +
                "  <table>\n" +
                "      <form action=\"/hello.php\" method=\"post\">\n" +
                "      <tr><td>User:</td><td> <input type=\"text\" name=\"user_new\" /></td></tr>\n" +
                "      <tr><td>Password:</td><td> <input type=\"password\" name=\"pass_new\" /></td></tr>\n" +
                "      <tr><td><input type=\"submit\" name=\"login\" value=\"login\" /></td></tr>\n" +
                "   </form>\n" +
                "  </table>\n" +
                "</body>\n" +
                "</html>";
                
        Document doc = Jsoup.parse(html);
        FormElement form = (FormElement) doc.select("form").first();
        List<Connection.KeyVal> data = form.formData();
        assertEquals(3, data.size());
        assertEquals("user_new", data.get(0).key());
        assertEquals("pass_new", data.get(1).key());
        assertEquals("login", data.get(2).key());
    }
    @Test public void test21() {
        // Changing the action URL
        String html = "<form action='/search_new'><input name='q'></form>";
        
        Document doc = Jsoup.parse(html, "http://example.com/");
        doc.select("[name=q]").attr("value", "jsoup");

        FormElement form = ((FormElement) doc.select("form").first());
        Connection con = form.submit();

        assertEquals(Connection.Method.GET, con.request().method());
        assertEquals("http://example.com/search_new", con.request().url().toExternalForm());
        List<Connection.KeyVal> dataList = (List<Connection.KeyVal>) con.request().data();
        assertEquals("q=jsoup", dataList.get(0).toString());

        doc.select("form").attr("method", "post");
        Connection con2 = form.submit();
        assertEquals(Connection.Method.POST, con2.request().method());
    }
    @Test public void test22() {
        // Changing the input name and value
        Document doc = Jsoup.parse("<body />");
        doc.body().html("<form />");

        Element formEl = doc.select("form").first();
        formEl.append("<input name=foo_new value=bar>");

        assertTrue(formEl instanceof FormElement);
        FormElement form = (FormElement) formEl;
        assertEquals(1, form.elements().size());

        List<Connection.KeyVal> data = form.formData();
        assertEquals("foo_new=bar", data.get(0).toString());
    }
    @Test public void test23() {
        // Changing the action URL
        String html = "<form><input name='q'></form>";
        Document doc = Jsoup.parse(html, "http://example.com/");
        FormElement form = ((FormElement) doc.select("form").first());
        Connection con = form.submit();

        assertEquals("http://example.com/", con.request().url().toExternalForm());
    }
    @Test public void test24() {
        // Changing the form input values
        String html = "<form><input name='one_new' value='two_new'><select name='three'>" +
                "<option value='not'>" +
                "<option value='four' selected>" +
                "<option value='five' selected><textarea name=six>seven</textarea>" +
                "<input name='seven' type='radio' value='on' checked>" +
                "<input name='seven' type='radio' value='off'>" +
                "<input name='eight_new' type='checkbox' checked>" +
                "<input name='nine' type='checkbox' value='unset'>" +
                "<input name='ten_new' value='text' disabled>" +
                "</form>";
                
        Document doc = Jsoup.parse(html);
        FormElement form = (FormElement) doc.select("form").first();
        List<Connection.KeyVal> data = form.formData();

        assertEquals(6, data.size());
        assertEquals("one_new=two_new", data.get(0).toString());
        assertEquals("three=four", data.get(1).toString());
        assertEquals("three=five", data.get(2).toString());
        assertEquals("six=seven", data.get(3).toString());
        assertEquals("seven=on", data.get(4).toString()); // set
        assertEquals("eight_new=on", data.get(5).toString()); // default
    }
    @Test public void test25() {
        // Changing the name of the checkbox
        Document doc = Jsoup.parse("<form><input type=checkbox checked name=foo_new></form>");
        FormElement form = (FormElement) doc.select("form").first();
        List<Connection.KeyVal> data = form.formData();
        assertEquals("on", data.get(0).value());
        assertEquals("foo_new", data.get(0).key());
    }

}