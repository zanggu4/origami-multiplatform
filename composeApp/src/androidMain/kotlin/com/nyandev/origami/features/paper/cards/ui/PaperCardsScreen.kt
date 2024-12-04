package com.nyandev.origami.features.paper.cards.ui

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.nyandev.origami.features.paper.cards.ui.components.PaperCard
import com.nyandev.origami.features.paper.cards.ui.viewdata.PaperCardViewData
import com.nyandev.origami.ui.components.OrigamiScaffold

@Composable
fun PaperCardsScreen(
    modifier: Modifier = Modifier,
) {
    OrigamiScaffold(
        modifier = modifier,
        title = "종이접기"
    ) { innerPadding ->
        LazyVerticalGrid(
            columns = GridCells.Fixed(2), // 2열 고정 그리드
            contentPadding = PaddingValues(8.dp),
            modifier = Modifier.padding(innerPadding)
        ) {
            items(
                count = 1000,
            ) { _ ->
                PaperCard(
                    viewData = PaperCardViewData.sample,
                    onClickCard = { },
                )
            }
        }
    }
}