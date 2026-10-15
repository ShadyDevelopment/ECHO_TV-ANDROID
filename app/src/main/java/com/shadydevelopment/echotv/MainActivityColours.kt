package com.shadydevelopment.echotv

// One launcher activity per icon colour, so each can carry its own icon, banner and launch-screen theme
// (see the manifest and core's AppIconSwitcher). No code of their own: MainActivity is the app.
class MainActivitySunflower : MainActivity()
class MainActivityCobalt : MainActivity()
class MainActivityTomato : MainActivity()
class MainActivityBoard : MainActivity()
class MainActivityPetrol : MainActivity()
class MainActivityOlive : MainActivity()
class MainActivityOliveCream : MainActivity()
class MainActivityPixel : MainActivity()

/** The launch theme with the still mark (values-v31 `….Still`), for Animations Off. */
internal fun stillLaunchTheme(icon: tv.own.owntv.core.brand.AppIcon): Int = when (icon) {
    tv.own.owntv.core.brand.AppIcon.PETROL -> R.style.Theme_EchoTV_Starting_Petrol_Still
    tv.own.owntv.core.brand.AppIcon.SUNFLOWER -> R.style.Theme_EchoTV_Starting_Sunflower_Still
    tv.own.owntv.core.brand.AppIcon.COBALT -> R.style.Theme_EchoTV_Starting_Cobalt_Still
    tv.own.owntv.core.brand.AppIcon.TOMATO -> R.style.Theme_EchoTV_Starting_Tomato_Still
    tv.own.owntv.core.brand.AppIcon.BOARD -> R.style.Theme_EchoTV_Starting_Board_Still
    tv.own.owntv.core.brand.AppIcon.EGGSHELL -> R.style.Theme_EchoTV_Starting_Eggshell_Still
    tv.own.owntv.core.brand.AppIcon.OLIVE -> R.style.Theme_EchoTV_Starting_Olive_Still
    tv.own.owntv.core.brand.AppIcon.OLIVE_CREAM -> R.style.Theme_EchoTV_Starting_OliveCream_Still
    tv.own.owntv.core.brand.AppIcon.PIXEL -> R.style.Theme_EchoTV_Starting_Pixel_Still
}
