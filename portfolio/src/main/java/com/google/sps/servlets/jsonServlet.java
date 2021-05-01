// Copyright 2019 Google LLC
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     https://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.google.sps.servlets;

import java.io.IOException;
import org.json.simple.JSONObject; 
import java.util.Date;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/json-servlet")
public final class jsonServlet extends HttpServlet {

  @Override
  public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
    String json = "{";
    json += "\"first\": ";
    json += "\"" + "Lorde" + "\"";
    json += ", ";
    json += "\"second\": ";
    json += "\"" + "Lana Del Rey" + "\"";
    json += ", ";
    json += "\"third\": ";
    json += "\"" + "The Neighbourhood" + "\"";
    json += ", ";
    json += "\"fourth\": ";
    json += "\"" + "Sza" + "\"";
    json += "}";

    response.setContentType("application/json;");
    response.getWriter().println(json);
  }

}
