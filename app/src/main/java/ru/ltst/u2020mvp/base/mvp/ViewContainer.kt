package ru.ltst.u2020mvp.base.mvp

import android.app.Activity
import android.view.ViewGroup

/**
 * An indirection which allows controlling the root container used for each activity.
 */
interface ViewContainer {
    /**
     * The root [android.view.ViewGroup] into which the activity should place its contents.
     */
    fun forActivity(activity: Activity): ViewGroup

    companion object {

        /**
         * An [ViewContainer] which returns the normal activity content view.
         */
        val DEFAULT: ViewContainer = object : ViewContainer {
            override fun forActivity(activity: Activity): ViewGroup {
                return activity.findViewById(android.R.id.content) as ViewGroup
            }
        }
    }
}
