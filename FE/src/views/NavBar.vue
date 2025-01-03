<!--
 * @Author: Jason Shen
 * @Date: 2024-12-28 17:27:01
 * @Description: All I Can Do!
 * @FilePath: \FE\VisualizationSystem-Java-OSHI-Vue-ECharts\FE\src\views\NavBar.vue
-->
<!--
 * @Author: Jason Shen
 * @Date: 2024-12-28 17:27:01
 * @Description: All I Can Do!
 * @FilePath: \FE\VisualizationSystem-Java-OSHI-Vue-ECharts\FE\src\views\NavBar.vue
-->
<template>
  <div class="box">
    <div class="menu-demo">
    <a-menu mode="horizontal" :default-selected-keys="['1']">
      <a-menu-item key="0" :style="{ padding: 0, marginRight: '38px' }" disabled>
        <div
          :style="{
            width: '80px',
            height: '30px',
            borderRadius: '2px',
            background: 'var(--color-fill-3)',
            cursor: 'text',
          }"
        />
      </a-menu-item>
      <a-menu-item key="1" @click="navTo('/')">首页</a-menu-item>
      <a-menu-item key="2" @click="navTo('/')">CPU监控</a-menu-item>
      <a-menu-item key="3" @click="navTo('/')">Cloud Service</a-menu-item>
      <a-menu-item key="4" @click="navTo('/')">Cooperation</a-menu-item>
    </a-menu>
  </div>
  </div>
</template>

<script setup lang="ts">
import {useRouter} from 'vue-router'
const router = useRouter()
const navTo = (url:string) => {
  router.push(url);
}
</script>

<style scoped>
.menu-demo {
  box-sizing: border-box;
  height: 64px;
  width: 100%;
  background-color: var(--color-neutral-2);
}
</style>