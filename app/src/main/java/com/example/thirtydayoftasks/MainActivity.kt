package com.example.thirtydayoftasks

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.spring
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ExpandLess
import androidx.compose.material.icons.filled.ExpandMore
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.thirtydayoftasks.model.Task
import com.example.thirtydayoftasks.model.tasks
import com.example.thirtydayoftasks.ui.theme.ThirtyDayOfTasksTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ThirtyDayOfTasksTheme {
                ThirtyDayOfTasksApp()
            }
        }
    }
}
@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun ThirtyDayOfTasksApp() {
    Scaffold(
        topBar = {
            ThirtyDayOfTasksTopAppBar()
        }
    ) {

        LazyColumn(modifier = Modifier.background(MaterialTheme.colors.background)) {
            items(tasks) {
                TaskItem(task = it)
            }
        }
    }
}

@Composable
fun TaskItem(
    task: Task,
    modifier: Modifier = Modifier
){
    var expanded by remember { mutableStateOf(false) }
    Card(
        modifier = modifier.padding(8.dp),
       elevation = 4.dp
    ) {

        Column(
            modifier = Modifier
                .animateContentSize(
                    animationSpec = spring(
                        dampingRatio = Spring.DampingRatioMediumBouncy,
                        stiffness = Spring.StiffnessLow
                    )
                ),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Column (
            modifier = Modifier
                .fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally

            ) {
                TaskDay(dayRes = task.dayRes)
                TaskImage(imageRes = task.imageRes)
                TaskTitle(titleRes = task.titleRes)
                if (expanded){
                    TaskDescription(descriptionRes = task.descriptionRes)
                }
            }
            DescriptionIcon(expanded = expanded, onClick = { expanded = !expanded })

        }
    }
}

@Composable
fun ThirtyDayOfTasksTopAppBar(
    modifier: Modifier = Modifier
){
    Row(
        modifier = modifier
            .fillMaxWidth(),
        horizontalArrangement = Arrangement.Center
    ) {
        Text(
            text = stringResource(id = R.string.app_name),
            style = MaterialTheme.typography.h1
        )
    }
}






@Composable
fun TaskDay(
    @StringRes dayRes:Int,
    modifier: Modifier = Modifier
){
    Text(text = stringResource(id = dayRes),
        modifier = modifier
            .padding(top = 8.dp),
        style = MaterialTheme.typography.h1
    )
}


@Composable
fun TaskImage(
    @DrawableRes imageRes: Int,
    modifier: Modifier = Modifier
){
    Box(
        modifier = modifier
            .fillMaxWidth()
            .padding(8.dp)
            .clip(
                RoundedCornerShape(
                    4
                )
            )
    ) {
        Image(
            modifier = Modifier
                .fillMaxWidth(),
            painter = painterResource(id = imageRes),
            contentDescription = null,
            contentScale = ContentScale.FillWidth
        )
    }
}

@Composable
fun TaskTitle(
    @StringRes titleRes:Int,
){
    Text(
        text = stringResource(id = titleRes),
        style = MaterialTheme.typography.h2
    )
}

@Composable
private fun DescriptionIcon(
    expanded: Boolean,
    onClick: () -> Unit,
    modifier: Modifier = Modifier
){
    IconButton(onClick = { onClick.invoke() }) {
        Icon(imageVector = if (expanded)Icons.Filled.ExpandLess else Icons.Filled.ExpandMore,
            tint = MaterialTheme.colors.secondary,
            contentDescription = null
        )
    }
}

@Composable
fun TaskDescription(
    @StringRes descriptionRes:Int,
    modifier: Modifier = Modifier
){
    Text(
        text = stringResource(id = descriptionRes),
        modifier = modifier
            .padding(8.dp),
        style = MaterialTheme.typography.body2
    )
}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun ThirtyDaysOfTasksAppPreview(){
    ThirtyDayOfTasksTheme(darkTheme = false) {
        ThirtyDayOfTasksApp()
    }
}

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun ThirtyDaysOfSuccessAppPreviewDark(){
    ThirtyDayOfTasksTheme(darkTheme = true) {
        ThirtyDayOfTasksApp()
    }
}
