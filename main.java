//Title: @Hinamizawa  -  V4 Crafting - AIO Gem Cutter Including low levels + crushedGem Mechanic
//_____________________________________________
int user_decision = 5;
//Opal = 0
//Jade = 1
//Topaz = 2
//Sapphire = 3
//Emerald = 4
//Ruby = 5
//Diamond = 6 
//Dragonstone = 7
//_____________________________________________
//Don't change down below: 
int chisel = 1755;
int chiselSlot = v.getInventory().slot(chisel);
int gem;
int fgem;
int crushed_gem = 1633;
int cgemCounter = v.getInventory().count(crushed_gem);
private void gemData() {
    // Opal
    if (user_decision == 0) {
        gem = 1625;
        fgem = 1609; 
    }
    //Jade
    else if (user_decision == 1) {
        gem = 1627;
        fgem = 1611; 
    }
    //Topaz
    else if (user_decision == 2) {
        gem = 1629;
        fgem = 1613; 
    }
    //Sapphire
    else if (user_decision == 3) {
        gem = 1623;
        fgem = 1607; 
    }
    //Emerald
    else if (user_decision == 4) {
        gem = 1621;
        fgem = 1605; 
    }

    //Ruby
    else if (user_decision == 5) {
        gem = 1619;
        fgem = 1603; 
    }
    //Diamond
    else if (user_decision == 6) {
        gem = 1617;
        fgem = 1601; 
    }
    //Dragon
    else if (user_decision == 7) {
        gem = 1631;
        fgem = 1615; 
    }

}

gemData();

int gemCounter = v.getInventory().count(gem);
int gemSlot = v.getInventory().slot(gem);
int fgemCounter = v.getInventory().count(fgem);
int fgemSlot = v.getInventory().slot(fgem);
Widget multiSkillMenu = client.getWidget(270, 13);

if (gemCounter == 0 && !v.getBank().isOpen()) {
    v.getBank().open();
} else if (fgemCounter + cgemCounter != 0 && v.getBank().isOpen()) {
    v.getBank().deposit(fgem, 27);
    v.getBank().deposit(crushed_gem,27);
    v.getBank().withdraw(gem, 27);
    v.getBank().close();
} else if (gemCounter >= 27 && v.getLocalPlayer().hasAnimation(-1)) {
    v.invoke("Use", "xxxHinaxxx", 0, 25, chiselSlot, 9764864, false);
    v.invoke("Use", "xxxHinaxxx -> xxxHinaxxx", 0, 58, gemSlot, 9764864, false);
    v.invoke("Cut", "xxxHinaxxx", 1, 57, -1, 17694734, false);
}