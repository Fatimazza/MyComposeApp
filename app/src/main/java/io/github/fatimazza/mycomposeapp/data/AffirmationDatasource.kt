package io.github.fatimazza.mycomposeapp.data

import io.github.fatimazza.mycomposeapp.R
import io.github.fatimazza.mycomposeapp.model.Affirmation

class AffirmationDatasource(){
    fun loadAffirmations(): List<Affirmation> {
        return listOf<Affirmation>(
            Affirmation(R.string.affirmation1, R.drawable.affirmation_img1),
            Affirmation(R.string.affirmation2, R.drawable.affirmation_img2),
            Affirmation(R.string.affirmation3, R.drawable.affirmation_img3),
            Affirmation(R.string.affirmation4, R.drawable.affirmation_img4),
            Affirmation(R.string.affirmation5, R.drawable.affirmation_img5),
            Affirmation(R.string.affirmation6, R.drawable.affirmation_img6),
            Affirmation(R.string.affirmation7, R.drawable.affirmation_img7),
            Affirmation(R.string.affirmation8, R.drawable.affirmation_img8),
            Affirmation(R.string.affirmation9, R.drawable.affirmation_img9),
            Affirmation(R.string.affirmation10, R.drawable.affirmation_img10))
    }
}
