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
        <script type="text/javascript" src="js/smiteBuilder.js"></script>
        <link rel="stylesheet" type="text/css" href="css/smiteBuilder.css">
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
        <div id="launch"><a href="builder.jsp"><span id="launch-btn"></span></a></div>
        <div id="header-pane">
            <img src="img/smite-logo2.png"/>
        </div>
        <div id="nav">
            <ul>
                <li><a href="builder.jsp">LAUNCH BUILDER</a></li>
                <!--<li><a href="#">Contact</a></li>-->   
            </ul>
        </div>
        <div id="wrapper">
            <div id="main-p">
                <div>
                    <h2 class="main-header">Easter Weekend Update</h2>
                    <p class="dtt">March 30, 2013</p>
                    <p>Lots of updates in this week's patch including new god Apollo. For full patch notes visit <a style="color:#ddaa22" href="http://www.hirezstudios.com/smitegame/home/game-info/patch-notes">
                            HiRezStudios official site</a>.</p>

                    <p>I have been away the past month with minimal time to update the site - my apologies. I plan on spending the weekend getting some very important issues dealt with</p>
                    <ul>
                        <li>A few items out-dated</li>
                        <li>God base and per level values need to be updated</li>
                        <li>On-going enhancements.
                    </ul>
                    <p>Special thanks to <b>Theophrastus</b> and <b>Niobe</b> for contributing to list of bugs and requested improvements.</p>
                    <p>If you have any questions, concerns, feedback, or would potentially like to contribute, please contact me at...</p>
                    <ul>
                        <li><a style="color:#ddaa22" href="mailto:thekurtz80@gmail.com">thekurtz80@gmail.com</a></li>
                        <li>Post on the <a style="color:#ddaa22" href="http://forum.hirezstudios.com/phpbb/viewtopic.php?f=340&t=101934">Hi-Rez Community Forum</a>
                            thread</li>
                    </ul>

                </div>
                <div class="divider"></div>
                <div>
                    <h2 class="main-header">Updates and Patch 0.1.1349</h2>
                    <p class="dtt">February 14, 2013</p>
                    <p>A few upgrades and updates. For full patch notes visit <a style="color:#ddaa22" href="http://www.hirezstudios.com/smitegame/home/game-info/patch-notes">
                            HiRezStudios official site</a>.</p>
                    <ul>
                        <li>Focus Removed</li>
                        <li>Itemized stat bonuses: hover over stat bars for item details.</li>
                        <li>Items/Gods updated to reflect patch changes</li>
                    </ul>    
                    <p>More improvements to come!</p>
                </div>
                <div class="divider"></div>
                <div>
                    <h2 class="main-header">Updates and Patch 0.1.1349</h2>
                    <p class="dtt">February 14, 2013</p>
                    <p>A few upgrades and updates. For full patch notes visit <a style="color:#ddaa22" href="http://www.hirezstudios.com/smitegame/home/game-info/patch-notes">
                            HiRezStudios official site</a>.</p>
                    <ul>
                        <li>Focus Removed</li>
                        <li>Itemized stat bonuses: hover over stat bars for item details.</li>
                        <li>Items/Gods updated to reflect patch changes</li>
                    </ul>    
                    <p>More improvements to come!</p>
                </div>
                <div class="divider"></div>
                <div>
                    <h2 class="main-header">Coming Very Soon</h2>
                    <p class="dtt">February 06, 2013</p>
                    <p>Thanks for all the support and page hits the last few days. The following are updates I plan to release in the very near future.
                        For now, feel free to email me, <a style="color:#ddaa22" href="mailto:thekurtz80@gmail.com">thekurtz80@gmail.com</a>, any bugs, comments, or anything else you would
                        otherwise like to see.</p>
                    <ul>
                        <li>Exportable builds: copy/paste and link your build setup for God and Items</li>
                        <li>Situational and God ability options: simulate stats based on mechanics (IE. Tower defense, God abilities)</li>
                        <li>Comments section: provide feedback without having to email me!</li>
                    </ul>    
                    <p>Minor fixes today</p>
                    <ul>
                        <li>Item images updated</li>
                        <li>You are now limited to being able to select an item one time per build</li>
                    </ul>
                </div>
                <div class="divider"></div>
                <div>
                    <h2 class="main-header">Stackable Items Now Stack!</h2>
                    <p class="dtt">February 05, 2013</p>
                    <p>Added this new splash page as well as a major update to items.</p>
                    <ul>
                        <li>Stackable items such as Heartseeker and Doom Orb now provide a selectbox to pick the number of stacks per item.</li>
                        <li>Updated all items to be in synch with Smite/Hi-Rez. (Ie. focus has been removed from a number of items).</li>
                        <li>Static passive bonuses are calculated. These consist of all passive bonuses that are not state dependent. (Ie. Frostbound Hammer affect enemy opponents and thus has no direct individual stat boost).</li>
                    </ul>
                    <br/>
                    <p>
                        Again, I consider this BETA and I'm working as quickly as possible
                        to work out all the bugs! I plan to add some type of forum/comment section in the next few days to continue collecting input from everyone.
                        Thanks for all the amazing feedback and I will continue to try to push out as much as I can ASAP!</p>
                </div>
                <div class="divider"></div>
                <div>
                    <h2 class="main-header">SmiteBuilder(beta) Release</h2>
                    <p class="dtt">February 01, 2013</p>
                    <p>I have officially launched Smitebuilder.net. It is currently in what I like to call "beta" stage as there are a number of features yet to implement (see below).                   
                    </p>
                    <ul>
                        <li>Calculations for unique God abilities/passives</li>
                        <li>Ability to set number of stacks for stackable items (ie. Heartseeker)</li>
                        <li>Exporting builds</li>
                        <li>Item passive bonuses included in overall calculations</li>
                    </ul>
                </div>
                <div class="divider"></div>
            </div>
            <div id="m-right-pane">
                Visit Hi-Rez Studios to Play FREE!
                <a href="http://hirezstudios.com"><img src="img/hirezlogo.jpg"/></a>
            </div>
            <div id="p-footer">
                <ul>
                    <li><a href="builder.jsp">LAUNCH BUILDER!</a></li>
                    <li><a class="about" href="#">About</a></li>
                    <li>Copyright © 2013 Smitebuilder.net. All Rights Reserved.</li>
                </ul>
            </div>
            <div id="bottom-pane">
                <script type="text/javascript"><!--
                    google_ad_client = "ca-pub-0143795249305388";
                    /* bottom banner */
                    google_ad_slot = "2243175583";
                    google_ad_width = 468;
                    google_ad_height = 60;
                    //-->
                </script>
                <script type="text/javascript"
                        src="http://pagead2.googlesyndication.com/pagead/show_ads.js">
                </script>
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
        </div>
        <div id="share">
            <!-- Lockerz Share BEGIN -->
            <a class="a2a_dd" href="http://www.addtoany.com/share_save"><img src="http://static.addtoany.com/buttons/share_save_171_16.png" width="171" height="16" border="0" alt="Share"/></a>
            <script type="text/javascript" src="http://static.addtoany.com/menu/page.js"></script>
            <!-- Lockerz Share END -->
        </div>

    </body>
</html>