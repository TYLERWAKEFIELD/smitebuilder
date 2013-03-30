/* 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

var characterObj;
var selectedId = 0;
var selectedItemDropdown;
var totalCost = 0;
var slots = ['i1','i2','i3','i4','i5','i6'];
var statObj = new StatObj();
var currentGod = new God();
var comments_flg = false;
var reset = false;
var itemBonuses = [];
var urlLink = new UrlLink();

function UrlLink() {
    this.i1 = null;
    this.i2 = null;
    this.i3 = null;
    this.i4 = null;
    this.i5 = null;
    this.i6 = null;
    this.g = null;
    this.l = null;
    this.setLink = function() {
        var baseUrl = "http://www.smitebuilder.net/builder.jsp?"+"l="+$("#level").val();
        for(var key in this) {          
            if(key != "setLink" && this[key] != null) {
                    baseUrl += ("&" +key+"="+this[key]);
            }
        }
        $("#burl").val(baseUrl);
    }
}

function StatObj() {
    this.health = 0;
    this.mana = 0;
    this.speed = 0;
    this.range = 0;
    this.attack_sec = 0;
    this.power_magical = 0;
    this.power_physical = 0;
    this.prot_magical = 0;
    this.prot_physical = 0;
    this.hp5 = 0;
    this.mp5 = 0;
    this.mag_lifesteal = 0;
    this.mag_penetration = 0;
    this.cooldown = 0;
    this.focus = 0;
    this.physical_lifesteal = 0;
    this.physical_penetration = 0;
    this.critical_chance = 0;
    this.cost = 0;

    this.sumStatObject = function(obj) {
        this.power_magical += obj.power_magical;
        this.mag_lifesteal += obj.mag_lifesteal;
        this.mag_penetration += obj.mag_penetration;
        this.mana += obj.mana;
        this.mp5 += obj.mp5;
        this.cooldown += obj.cooldown;
        this.focus += obj.focus;
        this.power_physical += obj.power_physical;
        this.attack_sec += obj.attack_sec;
        this.physical_penetration += obj.physical_penetration;
        this.physical_lifesteal += obj.physical_lifesteal;
        this.critical_chance += obj.critical_chance;
        this.prot_magical += obj.prot_magical;
        this.prot_physical += obj.prot_physical;
        this.health += obj.health;
        this.hp5 += obj.hp5;
        this.speed += obj.speed;
        if(obj.cost) {
            this.cost += obj.cost
        };
        
        //TODO: DO NOT included BONUSES that do not stack
        //Calculate percentage bonuses if they exist
        /*
        if(obj.speedP) this.speed += this.speed * obj.speedP;
        if(obj.attack_secP) this.attack_sec += this.attack_sec * obj.attack_secP;
        if(obj.mag_lifestealP) this.mag_lifesteal += this.mag_lifesteal * obj.mag_lifestealP;
        if(obj.physical_lifestealP) this.physical_lifesteal += this.physical_lifesteal * obj.physical_lifestealP;
        if(obj.mag_penetrationP) this.mag_penetration += this.mag_penetration * obj.mag_penetrationP;
        if(obj.physical_penetrationP) this.physical_penetration += this.physical_penetration * obj.physical_penetrationP;
        if(obj.critical_chanceP) this.critical_chance += this.critical_chance * obj.critical_chanceP;
        if(obj.cooldownP) this.cooldown += this.cooldown * obj.cooldownP;
        */
    
     
        //Add in passive bonuses 
        if(obj != currentGod && items) {
            for(var i=0; i<slots.length; i++) {
                var s = items[slots[i]];
                if(s && s != null) {
                    if(s.passive_modifier_1 > 0) {
                        this[s.passive_bonus_to_1] += s.passive_modifier_1 * this[s.passive_bonus_from_1];            
                    }
                    if(s.passive_modifier_2 > 0) {
                        this[s.passive_bonus_to_2] += s.passive_modifier_2 * this[s.passive_bonus_from_2];
                    }
                }
            }
        }
    }
}

function God() {
    this.name = "";
    this.god_id = 0;
    this.health_base = 0;
    this.health = 0;
    this.health_per = 0;
    this.mana_base = 0;
    this.mana = 0;
    this.mana_per = 0;
    this.speed_base = 0;
    this.speed = 0;
    this.speed_per = 0;
    this.range_base = 0;
    this.range = 0;
    this.range_per = 0;
    this.attack_sec_base = 0;
    this.attack_sec = 0;
    this.attack_sec_per = 0;
    this.power_magical_base = 0;
    this.power_magical = 0;
    this.power_magical_per = 0;
    this.power_physical_base = 0;
    this.power_physical = 0;
    this.power_physical_per = 0;
    this.prot_magical_base = 0;
    this.prot_magical = 0;
    this.prot_magical_per = 0;
    this.prot_physical_base = 0;
    this.prot_physical = 0;
    this.prot_physical_per = 0;
    this.hp5_base = 0;
    this.hp5 = 0;
    this.hp5_per = 0;
    this.mp5_per = 0;
    this.mp5 = 0;
    this.mp5_per = 0;
    this.mag_lifesteal = 0;
    this.mag_penetration = 0;
    this.cooldown = 0;
    this.focus = 0;
    this.physical_lifesteal = 0;
    this.physical_penetration = 0;
    this.critical_chance = 0;
    this.setGod = function(obj) {
        this.name = obj.name;
        this.god_id = obj.god_id;
        this.health_per = obj.health_per;
        this.health_base = obj.health_base;
        this.mana_per = obj.mana_per;
        this.mana_base = obj.mana_base;
        this.speed_base = obj.speed_base;
        this.speed_per = obj.speed_per;
        this.range_base = obj.range_base;
        this.range_per = obj.range_per;
        this.attack_sec_base = obj.attack_sec_base;
        this.attack_sec_per = obj.attack_sec_per;
        this.power_magical_base = obj.power_magical_base;
        this.power_magical_per = obj.power_magical_per;
        this.power_physical_base = obj.power_physical_base;
        this.power_physical_per = obj.power_physical_per;
        this.prot_magical_base = obj.prot_magical_base;
        this.prot_magical_per = obj.prot_magical_per;
        this.prot_physical_base = obj.prot_physical_base;
        this.prot_physical_per = obj.prot_physical_per;
        this.hp5_base = obj.hp5_base;
        this.hp5_per = obj.hp5_per;
        this.mp5_base = obj.mp5_base;  
        this.mp5_per = obj.mp5_per;
    };
    this.setLevel = function(level) {
        this.health = this.health_base + level * this.health_per;
        this.mana = this.mana_base + level * this.mana_per;
        this.speed = this.speed_base + level * this.speed_per;
        this.range = this.range_base + level * this.range_per;
        this.attack_sec = this.attack_sec_base + level * this.attack_sec_per;
        this.power_magical = this.power_magical_base + level * this.power_magical_per;
        this.power_physical = this.power_physical_base + level * this.power_physical_per;
        this.prot_magical = this.prot_magical_base + level * this.prot_magical_per;
        this.prot_physical = this.prot_physical_base + level * this.prot_physical_per;
        this.hp5 = this.hp5_base + level * this.hp5_per;
        this.mp5 = this.mp5_base + level * this.mp5_per;
    };
}

function itemObj() {
    this.health = 0;
    this.mana = 0;
    this.speed = 0;
    this.range = 0;
    this.attack_sec = 0;
    this.attack_secP = 0.0;
    this.power_magical = 0;
    this.power_physical = 0;
    this.prot_magical = 0;
    this.prot_physical = 0;
    this.hp5 = 0;
    this.mp5 = 0;
    this.mag_lifesteal = 0;
    this.mag_penetration = 0;
    this.cooldown = 0;
    this.focus = 0;
    this.physical_lifesteal = 0;
    this.physical_penetration = 0;
    this.critical_chance = 0;
    this.speedP = 0;
    this.mag_lifestealP = 0;
    this.physical_lifestealP =0;
    this.mag_penetrationP = 0;
    this.physical_penetrationP =0;
    this.critical_chanceP = 0;
    this.cooldownP = 0;
    this.cost = 0;
};

var items = {
    i1:null,
    i2:null,
    i3:null,
    i4:null,
    i5:null,
    i6:null,
    sumBonuses:function() {
        
        var obj = new itemObj();
        
        for(var i=0; i<slots.length; i++) {
            var s = this[slots[i]];
            var idx=i+1;
            if(s != null) {    
                //Process percentage bonuses
                s.speed < 1 ? obj.speedP += s.speed : obj.speed += s.speed;
                s.attack_sec < 1 ? obj.attack_secP += s.attack_sec : obj.attack_sec += s.attack_sec;
                s.mag_lifesteal < 1 ? obj.mag_lifestealP += s.mag_lifesteal : obj.mag_lifesteal += s.mag_lifesteal;
                s.physical_lifesteal < 1 ? obj.physical_lifestealP += s.physical_lifesteal : obj.physical_lifesteal += s.physical_lifesteal;
                s.mag_penetration < 1 ? obj.mag_penetrationP += s.mag_penetration : obj.mag_penetration += s.mag_penetration;
                s.physical_penetration < 1 ? obj.physical_penetrationP += s.physical_penetration : obj.physical_penetration += s.physical_penetration;
                s.critical_chance < 1 ? obj.critical_chanceP += s.critical_chance : obj.critical_chance += s.critical_chance;
                s.cooldown < 1 ? obj.cooldownP += s.cooldown : obj.cooldown += s.cooldown;
             
                obj.cost += s.cost;
                obj.health += s.health;
                obj.mana += s.mana;
                obj.range += s.range;
                obj.power_magical += parseInt(s.power_magical);
                obj.power_physical += s.power_physical;
                obj.prot_magical += s.prot_magical;
                obj.prot_physical += s.prot_physical;
                obj.hp5 += s.hp5;
                obj.mp5 += s.mp5;
                obj.focus += s.focus;
                
                //adjust item stacks
                if(s.max_stacks > 0) {
                    var stval = $("#i"+idx+"stacks").val();
                    var ttl1 = s.bonus_modifier_1 * stval;
                    obj[s.bonus_field_1] += ttl1;     
                     
                    if(s.bonus_modifier_2 > 0) {
                        var ttl2 = s.bonus_modifier_2 * stval;
                        obj[s.bonus_field_2] += ttl2;
                    }
                    if(s.bonus_modifier_3 > 0) {
                        var ttl3 = s.bonus_modifier_3 * stval;
                        obj[s.bonus_field_3] += ttl3;
                    }
                }               
                
                //use jQuery eq function to select sequential element within element               
                $("#p-i"+idx+" td:eq(0)").html("<img src='img/items/"+s.portrait_name+"'/>");
                $("#p-i"+idx+" td:eq(1)").html(s.passive);
            } else if(s == null) {//remove entries in passive table
                $("#p-i"+idx+" td:eq(0)").html("");
                $("#p-i"+idx+" td:eq(1)").html("");
            }
        }
        return obj;
    }
};

function calibrateAllStats() {
    //Set the statObj with currentGod values
    statObj = new StatObj();
    statObj.sumStatObject(currentGod);
        
    //Process items bonuses
    var vals = items.sumBonuses();
    
    //TODO: do not stack or add movement speed for items that don't stack
    statObj.sumStatObject(vals);  
    
    //Update page data
    updatePageData();
}

function displayTT(e, el) {
    //receives arguments for the event object(e) and the element the event was called on (el)
    var id = $(el).attr("rel");
    if(id && id!=null) {
        sendRequest('ajax/TooltipServlet?item=' + id, catchItemTooltip);
        var popupWidth = parseInt($(".item-tooltip-tt").css("width"));
        var popupHeight = parseInt($(".item-tooltip-tt").css("height"));
        var dx = e.pageX + popupWidth;
        var dy = e.pageY + popupHeight;
        
        if(dx > window.innerWidth && dy < window.innerHeight) {
            $(".item-tooltip-tt").css({
                left: e.pageX - popupWidth,
                top: e.pageY +1,
                zIndex: 99999
            }).stop().show(100);  /*.stop().show(100);*/
        } else if(dx < window.innerWidth && dy > window.innerHeight) {
            $(".item-tooltip-tt").css({
                left: e.pageX + 1,
                top: e.pageY - popupHeight,
                zIndex: 99999
            }).stop().show(100);  /*.stop().show(100);*/
        } else if(dx > window.innerWidth && dy > window.innerHeight) {
            $(".item-tooltip-tt").css({
                left: e.pageX - popupWidth,
                top: e.pageY - popupHeight,
                zIndex: 99999
            }).stop().show(100);  /*.stop().show(100);*/
        } else {
            $(".item-tooltip-tt").css({
                left: e.pageX + 1,
                top: e.pageY +1,
                zIndex: 99999
            }).stop().show(100);  /*.stop().show(100);*/
        }
    }
}

$.urlParam = function(name){
    var results = new RegExp('[\\?&amp;]' + name + '=([^&amp;#]*)').exec(window.location.href);
    if(results != null)
        return results[1] || 0;
    else return 0;
}

function go() { 
    $(document).tooltip();
    $(".stacks").change(function() {
        calibrateAllStats();
    })
    
    $("#i1 a").hover(function(e) {
        displayTT(e, this)
    }, function() {
        $(".item-tooltip-tt").hide();
    });
    
    $("#i2 a").hover(function(e) {
        displayTT(e, this)
    }, function() {
        $(".item-tooltip-tt").hide();
    });
    
    $("#i3 a").hover(function(e) {
        displayTT(e, this)
    }, function() {
        $(".item-tooltip-tt").hide();
    });
    
    $("#i4 a").hover(function(e) {
        displayTT(e, this)
    }, function() {
        $(".item-tooltip-tt").hide();
    });
    
    $("#i5 a").hover(function(e) {
        displayTT(e, this)
    }, function() {
        $(".item-tooltip-tt").hide();
    });
    
    $("#i6 a").hover(function(e) {
        displayTT(e, this)
    }, function() {
        $(".item-tooltip-tt").hide();
    });
    
    $(".item-container a").hover(function(e){
        displayTT(e, this)
    }, function() {
        $(".item-tooltip-tt").hide();  
    });    

    $("#burl").click(function() {
        $(this).select();
    });
    //jquery event registration   
    $("#level").change(function() {
        urlLink.setLink();
        var level = $("#level").val();

        //Validate that we have a non-null and defined level
        if(level != null && level) {
            var l = parseInt(level);
            //validate level entry
            if(l && l >= 1 && l <=20) {
                //make sure a god data has been pulled from the DB
                if(currentGod.god_id != 0) {
                    //set the level
                    currentGod.setLevel(l);
                    
                    calibrateAllStats();
                } else {
                    alert("Select a valid God first!");
                }
            } else {
                alert("Select a valid leve [1-20]");               
            }
        }
    });
    
    $("#god-menu-link").click(function() {
        //Pop-up God menu
        $("#god-menu").fadeIn();
        $("body").append("<div id='fade'></div>");
        $("#fade").css({
            'filter':'alpha(opacity=80)'
        }).fadeIn();
        
        var popuptopmargin = ($("#god-menu").height() + 10)/2; 
        var popupleftmargin = ($("#god-menu").width() + 10)/2;
        $("#god-menu").css({
            'margin-top' : -popuptopmargin,
            'margin-left' : -popupleftmargin
        });
    });
    
    $("#god-container a").click(function() {
        setGod(this);
        urlLink.g = $(this).attr("rel");
        urlLink.setLink();
    });
    
    $(".item-dropdown").click(function(e){
        setItemSlot(this)
    });
    
    $(".item-dropdown .stacks").click(function(e) {
        e.stopPropagation();
    });
    
    $(".about").click(function() {
        //Pop-up God menu
        $("#about-me").fadeIn();
        $("body").append("<div id='fade'></div>");
        $("#fade").css({
            'filter':'alpha(opacity=80)'
        }).fadeIn();
        
        var popuptopmargin = ($("#about-me").height() + 10)/2; 
        var popupleftmargin = ($("#about-me").width() + 10)/2;
        $("#about-me").css({
            'margin-top' : -popuptopmargin,
            'margin-left' : -popupleftmargin
        });
    });
    
    $(".help").click(function() {    //Pop-up God menu
        $("#help-info").fadeIn();
        $("body").append("<div id='fade'></div>");
        $("#fade").css({
            'filter':'alpha(opacity=80)'
        }).fadeIn();
        
        var popuptopmargin = ($("#help-info").height() + 10)/2; 
        var popupleftmargin = ($("#help-info").width() + 10)/2;
        $("#help-info").css({
            'margin-top' : -popuptopmargin,
            'margin-left' : -popupleftmargin
        })
    });
    
    $(".item-container a").click(function() {
        setItem(this);
        urlLink[selectedItemDropdown] = $(this).attr("rel");
        urlLink.setLink();
    /*
        if($(this).hasClass('noClick')) return;
        if(selectedItemDropdown && selectedItemDropdown != null) {
            //Save the image of the item selected
            var text = ($(this).find(".item-pic").html());
            var item = $(this).attr("rel");
 
            sendItemData(selectedId, item,$("#level").val());
            
            //disable item
            //$(this).removeAttr("href");
            //$(this).off("click");
            $(this).addClass('noClick');
            $(this).css("opacity", "0.5");
            $(this).css("filter", "alpha(opacity=50");
            
            $("#"+selectedItemDropdown+" a:first" ).html(text);
            //Save the item id to an attr
            $("#"+selectedItemDropdown+" a:first" ).attr("rel",item);
            $("#" +selectedItemDropdown+"r a").show();
        }
        $("#fade , #item-menu").fadeOut(); 
        */
    });
    
    
    
    $("ul#god-list a").click(function() {
        //selectNewGod(this.getAttributeNode('attr').nodeValue);
        selectNewGod($(this).attr("attr"));
    });
    
    $(".about-exit a").click(function() {
        $("#fade , #about-me").fadeOut(); 
        $("#fade , #help-info").fadeOut(); 
    });
    
    $("#comment-foot a").click(function() {
        if(!comments_flg) {
            $("#comment-foot a").html("[Hide Comments]");
            $("#hcb-comments").fadeIn();
            comments_flg = true;
        } else {//true 
            $("#comment-foot a").html("[Show Comments]");
            $("#hcb-comments").hide();
            comments_flg = false;
        }   
    });
    
    $(".ireset a").click(function() {
        var idiv = ["bc","i1c","i2c","i3c","i4c","i5c","i6c"];
        //Get handles    
        var aid = $(this).parent().attr("id");
        selectedItemDropdown =$(this).parent().parent().attr("id");
       
        //Reset Item
        $("#"+selectedItemDropdown+" a:first" ).html("Item " + selectedItemDropdown.substring(1,2));
        items[selectedItemDropdown] = null;
        
        //Re-enable item
        var cid = $("#"+selectedItemDropdown+" a:first" ).attr("rel");
        $("a[id='cid"+cid+"']").removeClass("noClick");
        $("a[id='cid"+cid+"']").css("opacity", "");
        $("a[id='cid"+cid+"']").css("filter", "");
       
        //Process items and update values
        calibrateAllStats();
    
        //hide reset link
        $("#"+aid+" a").hide();
        $("#"+selectedItemDropdown+"s").hide();
             
        reset = true;
    });
}

function setGod(e, gid) {
    //Save the image of the item selected
    var text = ($(e).find(".god-pic").html());
    $("#god-menu-link a").html(text);
    selectNewGod($(e).attr("rel"));
        
    $("#fade , #god-menu").fadeOut(); 
}

function setItem(e, sid, iid) {

    var ev = e && e != null ? e : "#"+iid;
    if($(ev).hasClass('noClick')) return;
    if(sid && sid != null) {
        selectedItemDropdown = sid;
    }
    var text, item;
    text = $(ev).find(".item-pic").html();
    item = $(ev).attr("rel");

    sendItemData(selectedId, item,$("#level").val());
            
    //disable item
    //$(this).removeAttr("href");
    //$(this).off("click");
    $(ev).addClass('noClick');
    $(ev).css("opacity", "0.5");
    $(ev).css("filter", "alpha(opacity=50");
            
    $("#"+selectedItemDropdown+" a:first" ).html(text);
    //Save the item id to an attr
    $("#"+selectedItemDropdown+" a:first" ).attr("rel",item);
    $("#" +selectedItemDropdown+"r a").show();
        
    $("#fade , #item-menu").fadeOut(); 
}

function setItemSlot(e, item) {
    if(reset) {
        reset = false;
        return;
    }        
    if(item && item != null) {
        selectedItemDropdown = item;
    } else {
        selectedItemDropdown = $(e).attr("id");
    }
    //Hide stack option
    $("#"+selectedItemDropdown+"s").hide();
        
    //Re-enable item
    var cid = $("#"+selectedItemDropdown+" a:first" ).attr("rel");
    if(cid ) {
        $("a[id='cid"+cid+"']").removeClass("noClick");
        $("a[id='cid"+cid+"']").css("opacity", "");
        $("a[id='cid"+cid+"']").css("filter", "");
    }
 
    //Pop-up Item div/menu
    $("#item-menu").fadeIn();
    $("body").append("<div id='fade'></div>");
    $("#fade").css({
        'filter':'alpha(opacity=80)'
    }).fadeIn();        
  
    var popuptopmargin = ($("#item-menu").height() + 10)/2; 
    var popupleftmargin = ($("#item-menu").width() + 10)/2;
    $("#item-menu").css({
        'margin-top' : -popuptopmargin,
        'margin-left' : -popupleftmargin
    });
}

function registerItemSelection(obj) {
    if(selectedItemDropdown && selectedItemDropdown != null) {
        //Save the image of the item selected
        var text = ($(obj).find(".item-pic").html());
        var item = $(obj).attr("rel");
 
        sendItemData(selectedId, item,$("#level").val());
            
        //disable item
        $(this).removeAttr("href");
        $(this).off("click");
        $(this).css("opacity", "0.5");
        $(this).css("filter", "alpha(opacity=50");
            
        $("#"+selectedItemDropdown+" a:first" ).html(text);
        //Save the item id to an attr
        $("#"+selectedItemDropdown+" a:first" ).attr("rel",item);
        $("#" +selectedItemDropdown+"r a").show();
    }
    $("#fade , #item-menu").fadeOut(); 
};

function selectNewGod (godId) {
    if(godId) {
        selectedId = godId;
        sendData(godId, 1);
    }
}

function sendItemData(gid, item, level) {
    if(gid && item && level && gid != null && item != null && level != null) {
        sendRequest('ajax/ProcessItem?id='+gid + '&item='+item + '&level='+level, catchItemData);
    } else if(item) {
        sendRequest('ajax/ProcessItem?item=' + item, catchItemData);
    }
}

function sendItemArrayData(item, l, g) {
    sendRequest('ajax/ProcessItemArray?item='+item+'&l='+l+'&g='+g, catchItemArrayData);
}

function sendData(gid, level) {

    if(gid || level) {
        sendRequest('ajax/ProcessData?id='+gid + '&level='+level, catchData);
    }

}

function updatePageData() {
    var cat = [{
        c:"power_magical",
        m:900
    }, {
        c:"mag_lifesteal", 
        m:65
    }, {
        c:"mag_penetration",
        m:50
    }, {
        c:"mana", 
        m:4000
    },{
        c:"mp5", 
        m:100
    }, {
        c:"cooldown", 
        m:35
    },

    {
        c:"power_physical", 
        m:500
    }, {
        c:"attack_sec", 
        m:2.5
    }, {
        c:"physical_penetration", 
        m:50
    }, {
        c:"physical_lifesteal", 
        m:65
    }, {
        c:"critical_chance", 
        m:80
    },

    {
        c:"prot_physical", 
        m:325
    }, {
        c:"prot_magical", 
        m:325
    }, {
        c:"health", 
        m:5500
    }, {
        c:"hp5", 
        m:100
    }, {
        c:"speed", 
        m:1000
    }];
    
    
    var b = new StatObj();
    b.sumStatObject(currentGod);
    
    for(var j=0; j<cat.length; j++) {     
        //get base value
        var bc = b[cat[j].c];
        var i1c = getItemCategoryValue(cat[j].c, 1);
        var i2c = getItemCategoryValue(cat[j].c, 2);
        var i3c = getItemCategoryValue(cat[j].c, 3);
        var i4c = getItemCategoryValue(cat[j].c, 4);
        var i5c = getItemCategoryValue(cat[j].c, 5);
        var i6c = getItemCategoryValue(cat[j].c, 6);
        var total = bc + i1c.total + i2c.total +i3c.total +i4c.total +i5c.total +i6c.total;

        //TODO: retrieve maximums from DB
        processPageOutput(cat[j].c, bc, i1c, i2c, i3c, i4c, i5c, i6c, cat[j].m, total);   
        
        //update cost
        $("#cost-val").html(statObj.cost);
    }
}

function processPageOutput(d, bc, i1c, i2c, i3c, i4c, i5c, i6c, max,total) {
    var cssWidth = parseInt($(".graphic-td").css("width"));
    var runningTotal = 0; 
        
    var bcP = bc / max * cssWidth;  
    var bw = getDivWidth(bcP, cssWidth, runningTotal, 0);
    if(bw == 0) $("#"+d+" div.bc").css("border-right","");
    $("#"+d+" div.bc").css("width",getDivWidth(bcP, cssWidth, runningTotal, 0));
    runningTotal += bcP;
    
    var i1cP = i1c.total / max * cssWidth;
    var i1w = getDivWidth(i1cP, cssWidth, runningTotal, 1);
    if(i1w == 0) $("#"+d+" div.i1c").css("border-right","");
    $("#"+d+" div.i1c").css("width",i1w);
    runningTotal += i1cP;
    
    var i2cP = i2c.total / max * cssWidth;  
    var i2w = getDivWidth(i2cP, cssWidth, runningTotal, 2);
    if(i2w == 0) $("#"+d+" div.i2c").css("border-right","");
    $("#"+d+" div.i2c").css("width",getDivWidth(i2cP, cssWidth, runningTotal, 2));
    runningTotal += i2cP;
    
    var i3cP = i3c.total / max * cssWidth;
    var i3w = getDivWidth(i3cP, cssWidth, runningTotal, 3);
    if(i3w == 0) $("#"+d+" div.i3c").css("border-right","");
    $("#"+d+" div.i3c").css("width",getDivWidth(i3cP, cssWidth, runningTotal, 3));
    runningTotal += i3cP;
    
    var i4cP = i4c.total / max * cssWidth;
    var i4w = getDivWidth(i4cP, cssWidth, runningTotal, 4);
    if(i4w == 0) $("#"+d+" div.i4c").css("border-right","");
    $("#"+d+" div.i4c").css("width",getDivWidth(i4cP, cssWidth, runningTotal, 4));   
    runningTotal += i4cP;
    
    var i5cP = i5c.total / max * cssWidth;
    var i5w = getDivWidth(i5cP, cssWidth, runningTotal, 5);
    if(i5w == 0) $("#"+d+" div.i5c").css("border-right","");
    $("#"+d+" div.i5c").css("width",getDivWidth(i5cP, cssWidth, runningTotal, 5));
    runningTotal += i5cP;
    
    var i6cP = i6c.total / max * cssWidth;
    var i6w = getDivWidth(i6cP, cssWidth, runningTotal, 6);
    if(i6w == 0) $("#"+d+" div.i6c").css("border-right","");
    $("#"+d+" div.i6c").css("width",getDivWidth(i6cP, cssWidth, runningTotal, 6));
    runningTotal += i6cP;

    if(bcP > 0) {
        $("#"+d+" div.bc").css("border-right","1px solid #DDAA22");
        $("#"+d+" div.bc").attr("title","Base/Passive: +" + bc.toFixed(2));
    }
    if(i1cP > 0) {
        $("#"+d+" div.i1c").css("border-right","1px solid #DDAA22");
        $("#"+d+" div.i1c").attr("title",i1c.name + ": +" +  i1c.total.toFixed(2));
    }
    if(i2cP > 0) {
        $("#"+d+" div.i2c").css("border-right","1px solid #DDAA22");
        $("#"+d+" div.i2c").attr("title",i2c.name + ": +" + i2c.total.toFixed(2));
    }
    if(i3cP > 0) {
        $("#"+d+" div.i3c").css("border-right","1px solid #DDAA22");
        $("#"+d+" div.i3c").attr("title",i3c.name + ": +" + i3c.total.toFixed(2));
    }
    if(i4cP > 0) {
        $("#"+d+" div.i4c").css("border-right","1px solid #DDAA22");
        $("#"+d+" div.i4c").attr("title",i4c.name + ": +" + i4c.total.toFixed(2));
    }
    if(i5cP > 0) {
        $("#"+d+" div.i5c").css("border-right","1px solid #DDAA22");
        $("#"+d+" div.i5c").attr("title",i5c.name + ": +" + i5c.total.toFixed(2));
    }
    if(i6cP > 0){
        $("#"+d+" div.i6c").css("border-right","1px solid #DDAA22");
        $("#"+d+" div.i6c").attr("title",i6c.name + ": +" + i6c.total.toFixed(2));
    }              
    //$("#"+d).css("width", percent);
    $("#"+d+"-text").html("["+total.toFixed(2)+"/" +max+"]");
    if(total >= max) $("#"+d+"-text").css("color", "#FF0000");
    if(total < max) $("#"+d+"-text").css("color", "#ffffff");
}

function getDivWidth(data, max, curr, divNum) {
    if(curr >= max) {
        return 0;
    }
    if(curr < max) {
        if((curr + data) >= max) {
            return max - curr-divNum;
        } else {
            return data;
        }
    }
    return 0; //default
}

function getItemCategoryValue(cat, islot) {
    var s = items["i"+islot];
    var itotal = 0;
    var name, id;
    if(s != null) {  
        
        //check for global modifiers ie. percentages
        if(s[cat] > 0 && s[cat] < 1) {
            //do something
            itotal = statObj[cat] * s[cat];
        } else {
            itotal = s[cat];
        }
        name = s.name;
        id = s.item_id;
        
        //Check for passive item bonuses
        if(s.passive_modifier_1 > 0 && cat == s.passive_bonus_to_1) {
            itotal += s.passive_modifier_1 * statObj[s.passive_bonus_from_1];            
        }
        if(s.passive_modifier_2 > 0 && cat == s.passive_bonus_to_2) {
            itotal += s.passive_modifier_2 * statObj[s.passive_bonus_from_2];
        }
    
        //adjust item stacks
        if(s.max_stacks > 0) {
            var stval = $("#i"+islot+"stacks").val();
            if(cat == s.bonus_field_1) {
                if(s.bonus_modifier_1 > 0) {                    
                    var ttl1 = s.bonus_modifier_1 * stval;
                    itotal += ttl1;    
                }
            }
            if(cat == s.bonus_field_2) {
                if(s.bonus_modifier_2 > 0) {
                    var ttl2 = s.bonus_modifier_2 * stval;
                    itotal += ttl2;
                }
            }
            if(cat == s.bonus_field_3) {
                if(s.bonus_modifier_3 > 0) {
                    var ttl3 = s.bonus_modifier_3 * stval;
                    itotal += ttl3;
                }
            }
        } 
    }
    return {
        "total":itotal, 
        "name":name, 
        "id":id
    };
    
}

function catchData(req) {
    characterObj = JSON.parse(req.responseText);
        
    //Set currentGod with newly imported stats
    currentGod.setGod(characterObj);
    
    //$("#g-passive").html("<img src='img/gods/" + characterObj.gp_portrait + "'/>");
    //$("#g-1").html("<img src='img/gods/" + characterObj.g1_portrait + "'/>");
    //$("#g-2").html("<img src='img/gods/" + characterObj.g2_portrait + "'/>");
    //$("#g-3").html("<img src='img/gods/" + characterObj.g3_portrait + "'/>");
    //$("#g-4").html("<img src='img/gods/" + characterObj.g4_portrait + "'/>");
    
    //Set selection text info
    $("#gs-name").html(characterObj.name);
    $("#gs-sub-desc").html(characterObj.sub_desc);
    $("#gs-origin").html(characterObj.origin);
    $("#gs-tags").html(characterObj.tags);
        
    //Reset level to 1
    currentGod.setLevel(1);
    $("#level").val("1");
        
    //Create new statObj to initialize values back to 0 and set new god stats
    statObj = new StatObj();
    statObj.sumStatObject(currentGod);

    updatePageData();
}

function catchItemData(req) {
    var item = JSON.parse(req.responseText); 
    //Set items slot i1
    items[selectedItemDropdown] = item;
    
    var stacks = parseInt(item.max_stacks);
    if(stacks > 0) {
        //give option to adjust, create change event
        $("#"+selectedItemDropdown+"stacks").html("");
        for(var i=0; i<=stacks; i++) {
            $("#"+selectedItemDropdown+"stacks").append("<option value='"+i+"'>"+i+"</option>");
        }
        $("#"+selectedItemDropdown+"s").show();
    }
    //Process items and update values
    calibrateAllStats();
}

function catchItemArrayData(req) {
    var itm = JSON.parse(req.responseText);
    var item = itm["items"];
    for(var key in item) {
        var sid = "i"+item[key].slot;
        items[sid] = item[key];
        
        setItemArray(sid, item[key].item_id);
        
        var stacks = parseInt(item[key].max_stacks);
        if(stacks > 0) {
            //give option to adjust, create change event
            $("#"+sid+"stacks").html("");
            for(var i=0; i<=stacks; i++) {
                $("#"+sid+"stacks").append("<option value='"+i+"'>"+i+"</option>");
            }
            $("#"+sid+"s").show();
        }
    }
    var god = itm["god"];
    characterObj = god;
    
    //Save the image of the item selected
    var ev = "#god-container a[rel='"+god.god_id+"']";
    var text = ($(ev).find(".god-pic").html());
    $("#god-menu-link a").html(text);    
    $("#fade , #god-menu").fadeOut(); 
        
    //Set currentGod with newly imported stats
    currentGod.setGod(characterObj);
    
    //Set selection text info
    $("#gs-name").html(characterObj.name);
    $("#gs-sub-desc").html(characterObj.sub_desc);
    $("#gs-origin").html(characterObj.origin);
    $("#gs-tags").html(characterObj.tags);
        
    //Set level
    currentGod.setLevel(god.level);
    $("#level").val(god.level);
        
    //Create new statObj to initialize values back to 0 and set new god stats
    statObj = new StatObj();
    statObj.sumStatObject(currentGod);

    updatePageData();
    calibrateAllStats();
}

function setItemArray(sid, iid) {
    var ev = "#cid"+iid;
    if($(ev).hasClass('noClick')) return;
    if(sid && sid != null) {
        selectedItemDropdown = sid;
    }
    var text, item;
    text = $(ev).find(".item-pic").html();
    item = $(ev).attr("rel");

    $(ev).addClass('noClick');
    $(ev).css("opacity", "0.5");
    $(ev).css("filter", "alpha(opacity=50");
            
    $("#"+selectedItemDropdown+" a:first" ).html(text);
    //Save the item id to an attr
    $("#"+selectedItemDropdown+" a:first" ).attr("rel",item);
    $("#" +selectedItemDropdown+"r a").show();
        
    $("#fade , #item-menu").fadeOut(); 
}

function processItemData(data, slot) {
    var item = JSON.parse(data.items);
    for(var key in item) {
        var sid = "i"+item[key].slot;
        items[sid] = item[key];
        
        var stacks = parseInt(item[key].max_stacks);
        if(stacks > 0) {
            //give option to adjust, create change event
            $("#"+sid+"stacks").html("");
            for(var i=0; i<=stacks; i++) {
                $("#"+sid+"stacks").append("<option value='"+i+"'>"+i+"</option>");
            }
            $("#"+sid+"s").show();
        }
    }
    calibrateAllStats();
}

function catchItemTooltip(req) {
    $(".item-tooltip-tt").html(req.responseText);
}

/* XMLHTTP */
function sendRequest(url,callback,postData) {
    var req = createXMLHTTPObject();
    if (!req) return;
    var method = (postData) ? "POST" : "GET";
    req.open(method,url,true);
    req.setRequestHeader('User-Agent','XMLHTTP/1.0');
    if (postData)
        req.setRequestHeader('Content-type','application/x-www-form-urlencoded');
    req.onreadystatechange = function () {
        if (req.readyState != 4) return;
        if (req.status != 200 && req.status != 304) {
            alert('HTTP error ' + req.status);
            return;
        }
        callback(req);
    }
    if (req.readyState == 4) return;
    req.send(postData);
}
var XMLHttpFactories = [
function () {
    return new XMLHttpRequest()
},
function () {
    return new ActiveXObject("Msxml2.XMLHTTP")
},
function () {
    return new ActiveXObject("Msxml3.XMLHTTP")
},
function () {
    return new ActiveXObject("Microsoft.XMLHTTP")
},
];
function createXMLHTTPObject() {
    var xmlhttp = false;
    for (var i=0;i<XMLHttpFactories.length;i++)
    {
        try {
            xmlhttp = XMLHttpFactories[i]();
        }
        catch (e) {
            continue;
        }
        break;
    }
    return xmlhttp;
}

function checkGetUrl() {
    var i1 = $.urlParam("i1");
    var i2 = $.urlParam("i2");
    var i3 = $.urlParam("i3");
    var i4 = $.urlParam("i4");
    var i5 = $.urlParam("i5");
    var i6 = $.urlParam("i6");
    var g = $.urlParam("g");
    var l = $.urlParam("l");
    var ia = $.urlParam("i1")+","+$.urlParam("i2")+","+$.urlParam("i3")+","+$.urlParam("i4")+","+$.urlParam("i5")+","+$.urlParam("i6");
    if(i1 || i2 || i3 || i4 || i5 || i6 || g || l) {
        sendItemArrayData(ia, $.urlParam("l"), $.urlParam("g"));
    }
    
    //Set urlLink to corresponding passed values
    if(i1 != 0) urlLink["i1"] = i1;
    if(i2 != 0) urlLink["i2"] = i2;

    if(i3 != 0) urlLink["i3"] = i3;
    if(i4 != 0) urlLink["i4"] = i4;
    if(i5 != 0) urlLink["i5"] = i5;
    if(i6 != 0) urlLink["i6"] = i6;
    if(g != 0) urlLink["g"] = g;
    urlLink.setLink();
}

$(window).load(function() {
    $("#loadingBackground").fadeOut(1000);
    go();
    checkGetUrl();
});