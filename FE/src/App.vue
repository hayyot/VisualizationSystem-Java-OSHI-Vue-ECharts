<!--
 * @Author: Jason Shen
 * @Date: 2024-12-27 21:54:13
 * @Description: All I Can Do!
 * @FilePath: \FE\VisualizationSystem-Java-OSHI-Vue-ECharts\FE\src\App.vue
-->
<script setup lang="ts">
import NavBar from './views/NavBar.vue';

</script>

<template>
  <div class="layout-demo">
    <a-layout style="height: 100vh;">
      <a-layout-header>
        <NavBar />
      </a-layout-header>
      <a-layout-content><RouterView /></a-layout-content>
      <a-layout-footer>Footer</a-layout-footer>
    </a-layout>
  </div>
</template>

<style scoped>
.menu-demo {
  box-sizing: border-box;
  width: 100%;
  padding: 40px;
  background-color: var(--color-neutral-2);
}
.layout-demo :deep(.arco-layout-header),
.layout-demo :deep(.arco-layout-footer),
.layout-demo :deep(.arco-layout-sider-children),
.layout-demo :deep(.arco-layout-content) {
  display: flex;
  flex-direction: column;
  justify-content: center;
  color: var(--color-white);
  font-size: 16px;
  font-stretch: condensed;
  text-align: center;
}


.layout-demo :deep(.arco-layout-header),
.layout-demo :deep(.arco-layout-footer) {
  height: 64px;
  background-color: var(--color-primary-light-4);
}

.layout-demo :deep(.arco-layout-sider) {
  width: 206px;
  background-color: var(--color-primary-light-3);
}

.layout-demo :deep(.arco-layout-content) {
  background-color: rgb(var(--arcoblue-6));
}
</style>
