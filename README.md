# Spring Boot Web 综合实验项目

基于 Spring Boot + MyBatis-Plus 构建的后端 Web 项目，实现学生与课程信息的 CRUD、分页查询等完整业务接口。

## 功能特性

- **学生管理** — 学生信息的增删改查
- **课程管理** — 课程信息管理、分页查询
- **接口测试** — Postman 接口联调，统一异常响应
- **服务端渲染** — Thymeleaf 模板引擎渲染页面

## 技术栈

| 技术 | 版本 | 说明 |
|------|------|------|
| Spring Boot | 2.7.18 | 核心框架 |
| MyBatis-Plus | 3.5.5 | ORM 框架 |
| MySQL | 8.0 | 数据库 |
| Thymeleaf | 3.0.15 | 服务端模板引擎 |
| Maven | - | 依赖管理 |

## 快速开始

### 前置要求

- JDK 11+
- MySQL 8.0
- Maven 3.6+

### 步骤

1. 克隆仓库
```bash
git clone https://github.com/andzero3/springboot-web-lab.git
```

2. 创建数据库
```sql
CREATE DATABASE examlinjiaxian DEFAULT CHARACTER SET utf8mb4;
```

3. 修改 `src/main/resources/application.properties` 中的数据库连接信息

4. 运行项目
```bash
mvn spring-boot:run
```

5. 访问 `http://localhost:8080`

## 项目结构

```
linjiaxuan/
├── src/main/java/com/example/linjiaxuan/
│   ├── LinJiaXuanApplication.java    # 启动类
│   ├── controller/
│   │   ├── StudentController.java     # 学生控制器
│   │   └── CourseController.java      # 课程控制器
│   ├── entity/
│   │   └── ECourse.java              # 课程实体
│   └── mapper/
│       └── CourseMapper.java          # 课程 Mapper
├── src/main/resources/
│   ├── application.properties         # 配置文件
│   └── templates/                     # Thymeleaf 模板
└── pom.xml                           # Maven 依赖
```
