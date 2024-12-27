/*
 * @Author: Jason Shen
 * @Date: 2024-12-27 21:54:13
 * @Description: All I Can Do!
 * @FilePath: \FE\VisualizationSystem-Java-OSHI-Vue-ECharts\FE\src\main.ts
 */
import { createApp } from 'vue'
import { createPinia } from 'pinia'

import App from './App.vue'
import router from './router'

const app = createApp(App)

app.use(createPinia())
app.use(router)

app.mount('#app')
