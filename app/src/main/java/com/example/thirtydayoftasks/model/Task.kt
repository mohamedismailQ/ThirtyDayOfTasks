package com.example.thirtydayoftasks.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.example.thirtydayoftasks.R

data class Task(
    @StringRes val dayRes: Int,
    @DrawableRes val imageRes: Int,
    @StringRes val titleRes: Int,
    @StringRes val descriptionRes: Int
)

val tasks = listOf<Task>(

    Task(
        dayRes = R.string.day_1,
        imageRes = R.drawable.the_task_of_prayer1,
        titleRes = R.string.the_task_of_prayer1,
        descriptionRes = R.string.the_description_of_prayer1
    ),
    Task(
        dayRes = R.string.day_2,
        imageRes = R.drawable.jobs_chances1,
        titleRes = R.string.jop_chances1,
        descriptionRes = R.string.jop_chances_description1
    ),
    Task(
        dayRes = R.string.day_3,
        imageRes = R.drawable.movie_night1,
        titleRes = R.string.movie_night1,
        descriptionRes = R.string.movie_night_description1
    ),
    Task(
        dayRes = R.string.day_4,
        imageRes = R.drawable.the_task_of_prayer2,
        titleRes = R.string.the_task_of_prayer2,
        descriptionRes = R.string.the_description_of_prayer2
    ),
    Task(
        dayRes = R.string.day_5,
        imageRes = R.drawable.youtupe_video1,
        titleRes = R.string.youtupe_video1,
        descriptionRes = R.string.youtupe_video_description1
    ),
    Task(
        dayRes = R.string.day_6,
        imageRes = R.drawable.day_out1,
        titleRes = R.string.day_out1,
        descriptionRes = R.string.day_out_description1
    ),
    Task(
        dayRes = R.string.day_7,
        imageRes = R.drawable.the_task_of_prayer3,
        titleRes = R.string.the_task_of_prayer3,
        descriptionRes = R.string.the_task_of_prayer3
    ),


    Task(
        dayRes = R.string.day_8,
        imageRes = R.drawable.jobs_chances2,
        titleRes = R.string.jop_chances2,
        descriptionRes = R.string.jop_chances_description2
    ),
    Task(
        dayRes = R.string.day_9,
        imageRes = R.drawable.movie_night2,
        titleRes = R.string.movie_night2,
        descriptionRes = R.string.movie_night_description2
    ),
    Task(
        dayRes = R.string.day_10,
        imageRes = R.drawable.the_task_of_prayer4,
        titleRes = R.string.the_task_of_prayer4,
        descriptionRes = R.string.the_description_of_prayer4
    ),
    Task(
        dayRes = R.string.day_11,
        imageRes = R.drawable.youtupe_video2,
        titleRes = R.string.youtupe_video2,
        descriptionRes = R.string.youtupe_video_description2
    ),
    Task(
        dayRes = R.string.day_12,
        imageRes = R.drawable.day_out2,
        titleRes = R.string.day_out2,
        descriptionRes = R.string.day_out_description2
    ),
    Task(
        dayRes = R.string.day_13,
        imageRes = R.drawable.the_task_of_prayer5,
        titleRes = R.string.the_task_of_prayer5,
        descriptionRes = R.string.the_description_of_prayer5
    ),
    Task(
        dayRes = R.string.day_14,
        imageRes = R.drawable.relax_day1,
        titleRes = R.string.relax_day1,
        descriptionRes = R.string.relax_day1
    ),


    Task(
        dayRes = R.string.day_15,
        imageRes = R.drawable.jobs_chances3,
        titleRes = R.string.jop_chances3,
        descriptionRes = R.string.jop_chances_description3
    ),
    Task(
        dayRes = R.string.day_16,
        imageRes = R.drawable.the_task_of_prayer6,
        titleRes = R.string.the_task_of_prayer6,
        descriptionRes = R.string.the_description_of_prayer6
    ),
    Task(
        dayRes = R.string.day_17,
        imageRes = R.drawable.movie_night3,
        titleRes = R.string.movie_night3,
        descriptionRes = R.string.movie_night_description3
    ),
    Task(
        dayRes = R.string.day_18,
        imageRes = R.drawable.youtupe_video3,
        titleRes = R.string.youtupe_video3,
        descriptionRes = R.string.youtupe_video_description3
    ),
    Task(
        dayRes = R.string.day_19,
        imageRes = R.drawable.the_task_of_prayer7,
        titleRes = R.string.the_task_of_prayer7,
        descriptionRes = R.string.the_description_of_prayer7
    ),
    Task(
        dayRes = R.string.day_20,
        imageRes = R.drawable.day_out3,
        titleRes = R.string.day_out3,
        descriptionRes = R.string.day_out_description3
    ),
    Task(
        dayRes = R.string.day_21,
        imageRes = R.drawable.jobs_chances4,
        titleRes = R.string.jop_chances4,
        descriptionRes = R.string.jop_chances_description4
    ),


    Task(
        dayRes = R.string.day_22,
        imageRes = R.drawable.the_task_of_prayer8,
        titleRes = R.string.the_task_of_prayer8,
        descriptionRes = R.string.the_description_of_prayer8
    ),
    Task(
        dayRes = R.string.day_23,
        imageRes = R.drawable.movie_night4,
        titleRes = R.string.movie_night4,
        descriptionRes = R.string.movie_night_description4
    ),
    Task(
        dayRes = R.string.day_24,
        imageRes = R.drawable.youtupe_video4,
        titleRes = R.string.youtupe_video4,
        descriptionRes = R.string.youtupe_video_description4
    ),
    Task(
        dayRes = R.string.day_25,
        imageRes = R.drawable.the_task_of_prayer9,
        titleRes = R.string.the_task_of_prayer9,
        descriptionRes = R.string.the_description_of_prayer9
    ),
    Task(
        dayRes = R.string.day_26,
        imageRes = R.drawable.course_night2,
        titleRes = R.string.course_night2,
        descriptionRes = R.string.course_night_description2
    ),
    Task(
        dayRes = R.string.day_27,
        imageRes = R.drawable.day_out4,
        titleRes = R.string.day_out4,
        descriptionRes = R.string.day_out_description4
    ),
    Task(
        dayRes = R.string.day_28,
        imageRes = R.drawable.the_task_of_prayer10,
        titleRes = R.string.the_task_of_prayer10,
        descriptionRes = R.string.the_description_of_prayer10
    ),


    Task(
        dayRes = R.string.day_29,
        imageRes = R.drawable.relax_day2,
        titleRes = R.string.relax_day2,
        descriptionRes = R.string.relax_day_description2
    ),
    Task(
        dayRes = R.string.day_30,
        imageRes = R.drawable.course_night2,
        titleRes = R.string.course_night2,
        descriptionRes = R.string.course_night_description2
    )
)
