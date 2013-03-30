<%-- 
    Document   : index
    Created on : Dec 10, 2012, 1:01:23 PM
    Author     : bg
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="SmiteBuilder.*" %>
<%@ page import="java.util.*" %>
<!DOCTYPE html>
<%
    CharacterDBDAO dao = new CharacterDBDAO();
    ArrayList<Item> iList = dao.getItems();
    ArrayList<God> gList = dao.getGods();
%>
<html>
    <head>
        <title>Smite Character Builder</title>
        <meta content="text/html;charset=UTF-8" http-equiv="Content-Type">
        <meta content="Smite, Builder, Smite God Builder, Build" name="keyword">
        <meta content="Create, customize, and simulate Smite God character builds" name="description">
        <script type="text/javascript" src="js/jquery-1.8.3.min.js"></script>
        <script type="text/javascript" src="js/jquery-ui-1.10.0.custom.min.js"></script>
        <script type="text/javascript" src="js/smiteBuilder.js"></script>
        <link rel="stylesheet" type="text/css" href="css/jquery-ui-1.10.0.custom.min.css">
        <link rel="stylesheet" type="text/css" href="css/smiteBuilder.css">
        <link rel="stylesheet" type="text/css" href="css/cssloader.css">
        <script type="text/javascript">

            var _gaq = _gaq || [];
            _gaq.push(['_setAccount', 'UA-38148933-1']);
            _gaq.push(['_trackPageview']);

            (function() {
                var ga = document.createElement('script'); ga.type = 'text/javascript'; ga.async = true;
                ga.src = ('https:' == document.location.protocol ? 'https://ssl' : 'http://www') + '.google-analytics.com/ga.js';
                var s = document.getElementsByTagName('script')[0]; s.parentNode.insertBefore(ga, s);
            })();

        </script>
    </head>
    <body>
        <div id="loadingBackground">
            <div id="inTurnFadingTextG">
                <div id="inTurnFadingTextG_1" class="inTurnFadingTextG">
                    L</div>
                <div id="inTurnFadingTextG_2" class="inTurnFadingTextG">
                    o</div>
                <div id="inTurnFadingTextG_3" class="inTurnFadingTextG">
                    a</div>
                <div id="inTurnFadingTextG_4" class="inTurnFadingTextG">
                    d</div>
                <div id="inTurnFadingTextG_5" class="inTurnFadingTextG">
                    i</div>
                <div id="inTurnFadingTextG_6" class="inTurnFadingTextG">
                    n</div>
                <div id="inTurnFadingTextG_7" class="inTurnFadingTextG">
                    g</div>
                <div id="inTurnFadingTextG_8" class="inTurnFadingTextG">
                    .</div>
                <div id="inTurnFadingTextG_9" class="inTurnFadingTextG">
                    .</div>
                <div id="inTurnFadingTextG_10" class="inTurnFadingTextG">
                    .</div>
            </div>
        </div>
        <div id="header-pane">
            <img src="img/smite-logo2.png"/>
        </div>
        <div id="nav">
            <ul>
                <li><a href="index.jsp">Home</a></li>
                <li><a class="help" href="#">Help</a></li>
                <!--<li><a href="#">Contact</a></li>-->
                <li><a href="http://www.hirezstudios.com">Hi-Rez Studios Official Site</a></li>     
            </ul>
        </div>

        <div id="wrapper">

            <div id="main-content-pane">
                <div id="selection-pane">
                    <div id="god-selection">
                        <div id="god-menu-link">
                            <a href="#"><img src="img/gods/empty.png"/></a>
                        </div>

                    </div>
                    <div id="god-selection-info">
                        <!--
                        <h2 id="gs-name" class="gability"></h2>
                        <div class="gability">
                            <div id="g-passive" class="gportrait"></div>
                            <div id="gpassivecheck" class="gchk"><input type="checkbox" name="abilities" value="passive"/></div>
                        </div>
                        <div class="gability">
                            <div id="g-1" class="gportrait"></div>
                            <div id="g1check" class="gchk"><input type="checkbox" name="abilities" value="g-1"/></div>
                        </div>
                        <div class="gability">
                            <div id="g-2" class="gportrait"></div>
                            <div id="g2check" class="gchk"><input type="checkbox" name="abilities" value="g-2"/></div>
                        </div>
                        <div class="gability">
                            <div id="g-3" class="gportrait"></div>
                            <div id="g3check" class="gchk"><input type="checkbox" name="abilities" value="g-3"/></div>
                        </div>
                        <div class="gability">
                            <div id="g-4" class="gportrait"></div>
                            <div id="g4check" class="gchk"><input type="checkbox" name="abilities" value="g-4"/></div>
                        </div>
                        -->
                        <h2 id="gs-name"></h2>
                        <p id="gs-sub-desc" class="gs-info">Select A God</p>
                        <p id="gs-origin"></p>
                        <p id="gs-tags"></p>

                    </div>
                    <div id="item-selection">
                        <div id="i1" class='item-dropdown' rel='i1'>
                            <a href="#">Item 1</a>
                            <div id="i1s" class="stacks"><select id="i1stacks"></select></div>
                            <div id="i1r" class="ireset"><a href="#">[X]</a></div>
                        </div>
                        <div id="i2" class='item-dropdown' rel='i2'>
                            <a href="#">Item 2</a>
                            <div id="i2s" class="stacks"><select id="i2stacks"></select></div>
                            <div id="i2r" class="ireset"><a href="#">[X]</a></div>
                        </div>
                        <div id="i3" class='item-dropdown' rel='i3'>
                            <a href="#">Item 3</a>
                            <div id="i3s" class="stacks"><select id="i3stacks"></select></div>
                            <div id="i3r" class="ireset"><a href="#">[X]</a></div>
                        </div>
                        <div id="i4" class='item-dropdown' rel='i4'>
                            <a href="#">Item 4</a>
                            <div id="i4s" class="stacks"><select id="i4stacks"></select></div>
                            <div id="i4r" class="ireset"><a href="#">[X]</a></div>
                        </div>
                        <div id="i5" class='item-dropdown' rel='i5'>
                            <a href="#">Item 5</a>
                            <div id="i5s" class="stacks"><select id="i5stacks"></select></div>
                            <div id="i5r" class="ireset"><a href="#">[X]</a></div>
                        </div>
                        <div id="i6" class='item-dropdown' rel='i6'>
                            <a href="#">Item 6</a>
                            <div id="i6s" class="stacks"><select id="i6stacks"></select></div>
                            <div id="i6r" class="ireset"><a href="#">[X]</a></div>
                        </div>
                    </div>
                    <div id="form_div">

                        <div id="level-input">
                            Level
                            <select id="level">
                                <option value="1">1</option>
                                <option value="2">2</option>
                                <option value="3">3</option>
                                <option value="4">4</option>
                                <option value="5">5</option>
                                <option value="6">6</option>
                                <option value="7">7</option>
                                <option value="8">8</option>
                                <option value="9">9</option>
                                <option value="10">10</option>
                                <option value="11">11</option>
                                <option value="12">12</option>
                                <option value="13">13</option>
                                <option value="14">14</option>
                                <option value="15">15</option>
                                <option value="16">16</option>
                                <option value="17">17</option>
                                <option value="18">18</option>
                                <option value="19">19</option>
                                <option value="20">20</option>
                            </select>
                            <!--
                            Level:<input id="level" type="text" name="level" value="1" size="2" />
                            -->
                        </div>
                        <div id="cost-display">
                            Total Cost:<span id="cost-val">0</span>
                        </div>
                    </div>
                </div>
                <div id="stats-panel">
                    <div id="magical-stats">
                        <h2>Magical Stats</h2>
                        <table>
                            <tbody>
                                <tr>
                                    <td class="stat-pic"><img src="img/misc/power-magical.png"/></td>
                                    <td class="stat-lbl">Power</td>
                                    <td class="graphic-td">
                                        <div id="power_magical" class="magic-color">                                
                                            <div class="bc"></div>
                                            <div class="i1c"></div>
                                            <div class="i2c"></div>
                                            <div class="i3c"></div>
                                            <div class ="i4c"></div>
                                            <div class ="i5c"></div>
                                            <div class ="i6c"></div>                
                                        </div>
                                    </td>
                                    <td id="power_magical-text"></td>
                                </tr>
                                <tr>
                                    <td class="stat-pic"><img src="img/misc/lifesteal-magical.png"/></td>
                                    <td class="stat-lbl">Lifesteal</td>
                                    <td class="graphic-td">
                                        <div id="mag_lifesteal" class="magic-color">
                                            <div class="bc"></div>
                                            <div class="i1c"></div>
                                            <div class="i2c"></div>
                                            <div class="i3c"></div>
                                            <div class ="i4c"></div>
                                            <div class ="i5c"></div>
                                            <div class ="i6c"></div>
                                        </div>
                                    </td>
                                    <td id="mag_lifesteal-text"></td>
                                </tr>
                                <tr>
                                    <td class="stat-pic"><img src="img/misc/pen-magical.png"/></td>
                                    <td class="stat-lbl">Penetration</td>
                                    <td class="graphic-td">
                                        <div id="mag_penetration" class="magic-color">
                                            <div class="bc"></div>
                                            <div class="i1c"></div>
                                            <div class="i2c"></div>
                                            <div class="i3c"></div>
                                            <div class ="i4c"></div>
                                            <div class ="i5c"></div>
                                            <div class ="i6c"></div>
                                        </div>
                                    </td>
                                    <td id="mag_penetration-text"></td></tr>
                                <tr>
                                    <td class="stat-pic"><img src="img/misc/mana.png"/></td>
                                    <td class="stat-lbl">Mana</td>
                                    <td class="graphic-td">
                                        <div id="mana" class="magic-color">
                                            <div class="bc"></div>
                                            <div class="i1c"></div>
                                            <div class="i2c"></div>
                                            <div class="i3c"></div>
                                            <div class ="i4c"></div>
                                            <div class ="i5c"></div>
                                            <div class ="i6c"></div>
                                        </div>
                                    </td>
                                    <td id="mana-text"></td>
                                </tr>
                                <tr>
                                    <td class="stat-pic"><img src="img/misc/mp5.png"/></td>
                                    <td class="stat-lbl">MP5</td>
                                    <td class="graphic-td">
                                        <div id="mp5" class="magic-color">
                                            <div class="bc"></div>
                                            <div class="i1c"></div>
                                            <div class="i2c"></div>
                                            <div class="i3c"></div>
                                            <div class ="i4c"></div>
                                            <div class ="i5c"></div>
                                            <div class ="i6c"></div>
                                        </div>
                                    </td>
                                    <td id="mp5-text"></td>
                                </tr>
                                <tr>
                                    <td class="stat-pic"><img src="img/misc/cooldown.png"/></td>
                                    <td class="stat-lbl">Cooldown%</td>
                                    <td class="graphic-td">
                                        <div id="cooldown" class="magic-color">
                                            <div class="bc"></div>
                                            <div class="i1c"></div>
                                            <div class="i2c"></div>
                                            <div class="i3c"></div>
                                            <div class ="i4c"></div>
                                            <div class ="i5c"></div>
                                            <div class ="i6c"></div>
                                        </div>
                                    </td>
                                    <td id="cooldown-text"></td>
                                </tr>
                                <!-- Focus removed from game 2/13/2013
                                <tr>
                                    <td class="stat-pic"><img src="img/misc/focus.png"/></td>
                                    <td class="stat-lbl">Focus</td>
                                    <td class="graphic-td">
                                        <div id="focus" class="magic-color">
                                            <div class="bc"></div>
                                            <div class="i1c"></div>
                                            <div class="i2c"></div>
                                            <div class="i3c"></div>
                                            <div class ="i4c"></div>
                                            <div class ="i5c"></div>
                                            <div class ="i6c"></div>
                                        </div>
                                    </td>
                                    <td id="focus-text"></td>
                                </tr>
                                -->
                            </tbody>
                        </table>
                    </div>
                    <div id="physical-stats">
                        <h2>Physical Stats</h2>
                        <table>
                            <tbody>
                                <tr>
                                    <td class="stat-pic"><img src="img/misc/power-physical.png"/></td>
                                    <td class="stat-lbl">Power</td>
                                    <td class="graphic-td">
                                        <div id="power_physical" class="physical-color">
                                            <div class="bc"></div>
                                            <div class="i1c"></div>
                                            <div class="i2c"></div>
                                            <div class="i3c"></div>
                                            <div class ="i4c"></div>
                                            <div class ="i5c"></div>
                                            <div class ="i6c"></div>
                                        </div>
                                    </td>
                                    <td id="power_physical-text"></td>
                                </tr>
                                <tr>
                                    <td class="stat-pic"><img src="img/misc/attackspeed.png"/></td>
                                    <td class="stat-lbl">Attack Speed</td>
                                    <td class="graphic-td">
                                        <div id="attack_sec" class="physical-color">
                                            <div class="bc"></div>
                                            <div class="i1c"></div>
                                            <div class="i2c"></div>
                                            <div class="i3c"></div>
                                            <div class ="i4c"></div>
                                            <div class ="i5c"></div>
                                            <div class ="i6c"></div> 
                                        </div>
                                    </td>
                                    <td id="attack_sec-text"></td>
                                </tr>
                                <tr>
                                    <td class="stat-pic"><img src="img/misc/pen-physical.png"/></td>
                                    <td class="stat-lbl">Penetration</td>
                                    <td class="graphic-td">
                                        <div id="physical_penetration" class="physical-color">
                                            <div class="bc"></div>
                                            <div class="i1c"></div>
                                            <div class="i2c"></div>
                                            <div class="i3c"></div>
                                            <div class ="i4c"></div>
                                            <div class ="i5c"></div>
                                            <div class ="i6c"></div> 
                                        </div>
                                    </td>
                                    <td id="physical_penetration-text"></td></tr>
                                <tr>
                                    <td class="stat-pic"><img src="img/misc/lifesteal-physical.png"/></td>
                                    <td class="stat-lbl">Lifesteal</td>
                                    <td class="graphic-td">
                                        <div id="physical_lifesteal" class="physical-color">
                                            <div class="bc"></div>
                                            <div class="i1c"></div>
                                            <div class="i2c"></div>
                                            <div class="i3c"></div>
                                            <div class ="i4c"></div>
                                            <div class ="i5c"></div>
                                            <div class ="i6c"></div> 
                                        </div>
                                    </td>
                                    <td id="physical_lifesteal-text"></td>
                                </tr>
                                <tr>
                                    <td class="stat-pic"><img src="img/misc/critical.png"/></td>
                                    <td class="stat-lbl">Critical Chance</td>
                                    <td class="graphic-td">
                                        <div id="critical_chance" class="physical-color">
                                            <div class="bc"></div>
                                            <div class="i1c"></div>
                                            <div class="i2c"></div>
                                            <div class="i3c"></div>
                                            <div class ="i4c"></div>
                                            <div class ="i5c"></div>
                                            <div class ="i6c"></div> 
                                        </div>
                                    </td>
                                    <td id="critical_chance-text"></td>
                                </tr>
                            </tbody>
                        </table>
                    </div>
                    <div id="defense-stats">
                        <h2>Protection</h2>
                        <table>
                            <tbody>
                                <tr>
                                    <td class="stat-pic"><img src="img/misc/prot-physical.png"/></td>
                                    <td class="stat-lbl">Protection Physical</td>
                                    <td class="graphic-td">
                                        <div id="prot_physical" class="defense-color">
                                            <div class="bc"></div>
                                            <div class="i1c"></div>
                                            <div class="i2c"></div>
                                            <div class="i3c"></div>
                                            <div class ="i4c"></div>
                                            <div class ="i5c"></div>
                                            <div class ="i6c"></div> 
                                        </div>
                                    </td>
                                    <td id="prot_physical-text"></td>
                                </tr>
                                <tr>
                                    <td class="stat-pic"><img src="img/misc/prot-magical.png"/></td>
                                    <td class="stat-lbl">Protection Magical</td>
                                    <td class="graphic-td">
                                        <div id="prot_magical" class="defense-color">
                                            <div class="bc"></div>
                                            <div class="i1c"></div>
                                            <div class="i2c"></div>
                                            <div class="i3c"></div>
                                            <div class ="i4c"></div>
                                            <div class ="i5c"></div>
                                            <div class ="i6c"></div> 
                                        </div>
                                    </td>
                                    <td id="prot_magical-text"></td>
                                </tr>
                                <tr>
                                    <td class="stat-pic"><img src="img/misc/health.png"/></td>
                                    <td class="stat-lbl">Health</td>
                                    <td class="graphic-td">
                                        <div id="health" class="defense-color">
                                            <div class="bc"></div>
                                            <div class="i1c"></div>
                                            <div class="i2c"></div>
                                            <div class="i3c"></div>
                                            <div class ="i4c"></div>
                                            <div class ="i5c"></div>
                                            <div class ="i6c"></div> 
                                        </div>
                                    </td>
                                    <td id="health-text"></td></tr>
                                <tr>
                                    <td class="stat-pic"><img src="img/misc/hp5.png"/></td>
                                    <td class="stat-lbl">HP5</td>
                                    <td class="graphic-td">
                                        <div id="hp5" class="defense-color">
                                            <div class="bc"></div>
                                            <div class="i1c"></div>
                                            <div class="i2c"></div>
                                            <div class="i3c"></div>
                                            <div class ="i4c"></div>
                                            <div class ="i5c"></div>
                                            <div class ="i6c"></div> 
                                        </div>
                                    </td>
                                    <td id="hp5-text"></td>
                                </tr>
                                <tr>
                                    <td class="stat-pic"><img src="img/misc/movement.png"/></td>
                                    <td class="stat-lbl">Movement</td>
                                    <td class="graphic-td">
                                        <div id="speed" class="defense-color">
                                            <div class="bc"></div>
                                            <div class="i1c"></div>
                                            <div class="i2c"></div>
                                            <div class="i3c"></div>
                                            <div class ="i4c"></div>
                                            <div class ="i5c"></div>
                                            <div class ="i6c"></div> 
                                        </div>
                                    </td>
                                    <td id="speed-text"></td>
                                </tr>
                            </tbody>
                        </table>
                    </div>

                    <div id="extraPanel">
                        <div id="urllink">
                            Copy/Paste Build URL:<br/>
                            <input id="burl" type="text" value="http://"/>
                        </div>
                    </div>
                </div>
                <div id="passive-panel">
                    <table>
                        <tbody>
                            <tr id="p-i1">
                                <td class="p-portrait"></td>
                                <td class="p-txt"></td>
                            </tr>
                            <tr id="p-i2">
                                <td class="p-portrait"></td>
                                <td class="p-txt"></td>
                            </tr>
                            <tr id="p-i3">
                                <td class="p-portrait"></td>
                                <td class="p-txt"></td>
                            </tr>
                            <tr id="p-i4">
                                <td class="p-portrait"></td>
                                <td class="p-txt"></td>
                            </tr>
                            <tr id="p-i5">
                                <td class="p-portrait"></td>
                                <td class="p-txt"></td>
                            </tr>
                            <tr id="p-i6">
                                <td class="p-portrait"></td>
                                <td class="p-txt"></td>
                            </tr>
                        </tbody>
                    </table>
                </div>
                <div id="p-footer">
                    <ul>
                        <li><a class="help" href="#">Help</a></li>
                        <li><a class="about" href="#">About</a></li>
                        <li>Copyright © 2013 Smitebuilder.net. All Rights Reserved.</li>
                    </ul>
                </div>
                <!--
                <div id="comment-foot"><a href="#">[Show Comments]</a></div>
                <div id="hcb-comments">
                <!-- begin htmlcommentbox.com 
                <div id="HCB_comment_box"><a href="http://www.htmlcommentbox.com">HTML Comment Box</a> is loading comments...</div>
                <link rel="stylesheet" type="text/css" href="http://www.htmlcommentbox.com/static/skins/bootstrap/twitter-bootstrap.css" />
                <script type="text/javascript" language="javascript" id="hcb"> /*<!--*/ if(!window.hcb_user){hcb_user={};} (function(){s=document.createElement("script");s.setAttribute("type","text/javascript");s.setAttribute("src", "http://www.htmlcommentbox.com/jread?page="+escape((window.hcb_user && hcb_user.PAGE)||(""+window.location)).replace("+","%2B")+"&mod=%241%24wq1rdBcg%244i9FZYerwGaI9XxbezZ4Z."+"&opts=462&num=10");if (typeof s!="undefined") document.getElementsByTagName("head")[0].appendChild(s);})(); /*--*/ </script>
                <!-- end htmlcommentbox.com --
                </div>
                -->

                <div id="item-menu">
                    <div id="item-menu-list">
                        <%
                            for (Item i : iList) {
                        %>
                        <div class="item-container">
                            <a href="#" rel="<%=i.getItem_id()%>" id="cid<%=i.getItem_id()%>">
                                <div class="item-pic">
                                    <img class='portrait' src='img/items/<%=i.getPortrait_name()%>'/>
                                </div>

                                <div class="item-info">
                                    <div class="item-name">
                                        <span><%=i.getName()%></span>
                                    </div>
                                    <div class="item-cost">
                                        <%=i.getCost()%>
                                    </div>
                                </div>
                            </a>
                        </div>
                        <% }%>

                    </div>
                </div>
                <div id="god-menu">
                    <div id="god-menu-list">
                        <%
                            for (God g : gList) {
                        %>
                        <div id="god-container">
                            <a href="#" rel="<%=g.getGod_id()%>">
                                <div class="god-pic">
                                    <img class='portrait' src='img/gods/<%=g.getPortrait_name()%>'/>
                                </div>

                                <div class="god-info">
                                    <div class="god-name">
                                        <span><%=g.getName()%></span>
                                    </div>
                                </div>
                            </a>
                        </div>
                        <% }%>

                    </div>
                </div>
                <div class="item-tooltip-tt">
                </div>
                <div id="about-me">
                    <p>I am a software developer and Smite gamer/fan. My goal with this project is
                        simply to gain experience with HTML/JavaScript/CSS. 
                        I appreciate any and all feedback! Please feel free to contact me at the email 
                        below or in-game at any time! 
                    </p>
                    <br/>
                    <h2>In-Game:&nbsp;</h2>TheKurtz
                    <br/>
                    <h2>Email:&nbsp;</h2><a href="mailto:thekurtz80@gmail.com">thekurtz80@gmail.com</a>
                    <br/>
                    <div class="about-exit"><a href="#">[X]</a></div>
                </div>
                <div id="help-info">
                    <h1>SmiteBuilder Help</h1>
                    <p>SmiteBuilder.net provides and application simulating how your God's attributes
                        will scale without having to play through a full game. Mix and match different items
                        to forcast your favorite build.
                    </p>
                    <h2>Select A God</h2>
                    <p>Click on the empty portait to begin by selecting your God. 
                        Base statistics are unique per God
                    </p>
                    <h2>Choose A Level</h2>
                    <p>By selecting a level between 1-20, your God stats will scale 
                        according to each category multiplyer
                    </p>
                    <h2>Select Items</h2>
                    <p>Each item provides specific attribute bonuses</p>
                    <div class="about-exit"><a href="#">[X]</a></div>
                </div>
            </div>
            <div id="right-pane">
                <script type="text/javascript"><!--
                    google_ad_client = "ca-pub-0143795249305388";
                    /* smite-rightpanel */
                    google_ad_slot = "9129143981";
                    google_ad_width = 160;
                    google_ad_height = 600;
                    //-->
                </script>
                <script type="text/javascript"
                        src="http://pagead2.googlesyndication.com/pagead/show_ads.js">
                </script>
            </div>
        </div>
        <div id="share">
            <!-- Lockerz Share BEGIN -->
            <a class="a2a_dd" href="http://www.addtoany.com/share_save"><img src="http://static.addtoany.com/buttons/share_save_171_16.png" width="171" height="16" border="0" alt="Share"/></a>
            <script type="text/javascript" src="http://static.addtoany.com/menu/page.js"></script>
            <!-- Lockerz Share END -->
        </div>
    </body>
</html>