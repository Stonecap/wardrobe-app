package com.stonecap.wardrobe

import android.app.Application
import coil.ImageLoader
import coil.ImageLoaderFactory
import dagger.Provides
import dagger.hilt.android.HiltAndroidApp
import javax.inject.Inject
import javax.inject.Provider

@HiltAndroidApp
class WardrobeApplication : Application(), ImageLoaderFactory {

    @Inject
    lateinit var imageLoader: Provider<ImageLoader>

    override fun newImageLoader(): ImageLoader = imageLoader.get()

}
