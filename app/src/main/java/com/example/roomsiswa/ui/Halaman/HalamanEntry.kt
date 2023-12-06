package com.example.roomsiswa.ui.Halaman

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.roomsiswa.R
import com.example.roomsiswa.model.EntryViewModel
import com.example.roomsiswa.navigasi.DestinasiNavigasi
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.roomsiswa.model.DetailSiswa
import com.example.roomsiswa.model.PenyediaViewModel


object DestinasiEntry: DestinasiNavigasi {
    override val route = "item_entry"
    override val titleRes = R.string.entry_siswa
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun EntrySiswaScreen(
    navigateBack: () -> Unit,
    modifier: Modifier = Modifier,
    viewModel: EntryViewModel = viewModel(factory = PenyediaViewModel.Factory)
){

}


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun FormInputSIswa(
    detailSiswa: DetailSiswa,
    modifier: Modifier = Modifier,
    onValueChange: (DetailSiswa) -> Unit = {},
    enabled: Boolean = true
){}