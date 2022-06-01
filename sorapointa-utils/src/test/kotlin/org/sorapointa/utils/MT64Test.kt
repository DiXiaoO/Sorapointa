package org.sorapointa.utils

import io.ktor.util.*
import kotlinx.coroutines.runBlocking
import org.junit.jupiter.api.Test
import org.sorapointa.utils.crypto.MT19937
import kotlin.test.assertEquals

class MT64Test {

    @Test
    fun `mt64 test`(): Unit = runBlocking {
        val seed = 11468049314633205968u
        /* ktlint-disable max-line-length */
        val key = "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"
        /* ktlint-enable max-line-length */

        assertEquals(key, MT19937.generateKey(seed).encodeBase64())
    }

}
