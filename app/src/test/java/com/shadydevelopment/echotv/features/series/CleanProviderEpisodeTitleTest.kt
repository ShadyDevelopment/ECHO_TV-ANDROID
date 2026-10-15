package com.shadydevelopment.echotv.features.series

import org.junit.Assert.assertEquals
import org.junit.Assert.assertNull
import org.junit.Test

class CleanProviderEpisodeTitleTest {

    @Test
    fun `removes series and season episode prefixes`() {
        assertEquals("Pilot", cleanProviderEpisodeTitle("The Show S01E02 - Pilot", "The Show"))
        assertEquals("Pilot", cleanProviderEpisodeTitle("the show - 1x02: Pilot", "The Show"))
    }

    @Test
    fun `removes season episode prefix without series name`() {
        assertEquals("Pilot", cleanProviderEpisodeTitle("S1.E2 Pilot", "The Show"))
    }

    @Test
    fun `preserves a title when it has no removable prefix`() {
        assertEquals("The Pilot", cleanProviderEpisodeTitle("The Pilot", "The Show"))
        assertEquals("The Show", cleanProviderEpisodeTitle("The Show", "The Show"))
    }

    @Test
    fun `empty titles remain absent`() {
        assertNull(cleanProviderEpisodeTitle("  ", "The Show"))
    }
}
