package com.shadydevelopment.echotv.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.shadydevelopment.echotv.R
import com.shadydevelopment.echotv.ui.theme.stageAccent

/** ECHO TV mark used in setup and launcher-icon settings. */
@Composable
@Suppress("UNUSED_PARAMETER")
fun BrandMark(icon: tv.own.owntv.core.brand.AppIcon, size: Dp, modifier: Modifier = Modifier, followAccent: Boolean = true) {
    Image(
        painter = painterResource(R.drawable.echo_tv_mark),
        contentDescription = null,
        modifier = modifier.size(size),
        contentScale = ContentScale.Fit,
    )
}

/**
 * "Pixel": kept for existing internal call sites; the ECHO TV mark is used for every brand surface.
 */
@Suppress("UNUSED_PARAMETER")
@Composable
fun PixelMark(modifier: Modifier = Modifier, triangle: Color = stageAccent.accent) {
    Image(painterResource(R.drawable.echo_tv_mark), null, modifier, contentScale = ContentScale.Fit)
}

/** ECHO TV horizontal logo. */
@Composable
@Suppress("UNUSED_PARAMETER")
fun Wordmark(width: Dp, modifier: Modifier = Modifier, tv: Color = stageAccent.accent, own: Color = WordmarkCream) {
    Image(
        painter = painterResource(R.drawable.echo_tv_horizontal),
        contentDescription = null,
        modifier = modifier.width(width).height(width * 424f / 1244f),
        contentScale = ContentScale.Fit,
    )
}

val WordmarkCream = Color(0xFFFFF6EE)

/**
 * The ECHO TV horizontal lockup, sized from the former mark width for existing layouts.
 */
@Composable
fun BrandLockup(
    modifier: Modifier = Modifier,
    markSize: Int = 36,
    stacked: Boolean = false,
) {
    val widthScale = if (stacked) 3.6f else 4f
    Wordmark((markSize * widthScale).dp, modifier)
}
